package fr.diginamic.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation qui sert pour la classe {@link StringUtils} et la génération du
 * toString.<br>
 * La Retention choisie est RUNTIME de manière à ce que l'annotation ne soit pas
 * supprimée à la compilation.<br>
 * La target est FIELD afin de limiter la présence de cette annotation aux
 * variables d'instances
 * 
 * @author RichardBONNAMY
 *
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface ToString {

	/**
	 * Indique si oui ou non une valeur doit être mise en majuscules
	 * 
	 * @return boolean
	 */
	boolean upperCase() default false;

	/**
	 * Indique le séparateur à utiliser entre 2 valeurs
	 * 
	 * @return String
	 */
	String separator() default " ";

}
