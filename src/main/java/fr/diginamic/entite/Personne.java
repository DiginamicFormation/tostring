package fr.diginamic.entite;

import fr.diginamic.annotation.ToString;
import fr.diginamic.utils.StringUtils;

/**
 * Représente le concept de Personne dans l'application
 * 
 * @author RichardBONNAMY
 *
 */
public class Personne {

	/** nom */
	@ToString(upperCase = true)
	private String nom;

	/** prenom */
	@ToString(separator = "\n")
	private String prenom;

	/** adresse */
	@ToString
	private AdressePostale adresse;

	/**
	 * Constructeur
	 * 
	 * @param nom     nom de la personne
	 * @param prenom  prénom de la personne
	 * @param adresse adresse de la personne
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return StringUtils.toString(this);
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}

}
