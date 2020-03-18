package fr.diginamic.utils;

import java.lang.reflect.Field;

import fr.diginamic.annotation.ToString;

/**
 * Transforme en chaine de caractères un objet
 * 
 * @author RichardBONNAMY
 *
 */
public class StringUtils {

	/**
	 * Cette méthode transforme en chaine de caractères un objet passé en paramètre.
	 * 
	 * @param obj objet à transformer.
	 * @return String
	 */
	public static String toString(Object obj) {

		// J'instancier le builder qui va permettre de construire la chaine de
		// caractères pour l'objet passé en paramètre
		StringBuilder builder = new StringBuilder();

		// On commence par récupérer la classe de l'objet passée en paramètre.
		// la classe fournit toutes les informations sur la structure d'un objet.
		Class<?> classe = obj.getClass();

		// Sur cette classe on récupère le tableau des variables d'instance
		Field[] fields = classe.getDeclaredFields();

		// On fait une boucle sur ce tableau
		for (Field field : fields) {

			// Certaines méthodes qu'on appelle dans cette boucle peuvent jeter des
			// exceptions, c'est la raison pour laquelle on encadre les appels dans
			// un try / catch.
			try {

				// Pour un attribut d'instance donné (field), on regarde s'il a l'annotation
				// ToString ou non
				if (field.isAnnotationPresent(ToString.class)) {

					// S'il possède cette annotation on la récupère
					ToString annotation = field.getAnnotation(ToString.class);

					// On récupère les informations renseignées au niveau de l'annotation
					// pour ce champ.
					String separator = annotation.separator();
					boolean upperCase = annotation.upperCase();

					// On force l'accès à l'attribut depuis une classe externe.
					// Un peu comme si je forçais l'attribut en lisibilité public.
					field.setAccessible(true);

					// Je regarde ensuite si la valeur de l'attribut est null ou pas
					if (field.get(obj) != null) {

						// J'appelle la méthode toString() sur la valeur de l'attribut afin
						// de convertir cette valeur en chaine de caractères
						String convertedValue = field.get(obj).toString();

						// Si au niveau de n'annotation il est indiqué qu'il faut mettre en MAJ
						if (upperCase) {
							// Alors on met en majuscules.
							convertedValue = convertedValue.toUpperCase();
						}

						// Puis j'ajoute la valeur de l'attribut à ma chaine de caractères avec le
						// séparateur
						builder.append(convertedValue).append(separator);
					}
				}

			} catch (IllegalArgumentException | IllegalAccessException e) {
				throw new RuntimeException("Impossible d'accéder à la valeur d'un attribut :" + e.getMessage());
			}
		}
		return builder.toString();
	}
}
