package fr.diginamic.entite;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import fr.diginamic.annotation.ToString;
import fr.diginamic.utils.StringUtils;

/**
 * Représente le concept d'adresse postale
 * 
 * @author RichardBONNAMY
 *
 */
public class AdressePostale {

	@ToString(separator = " -> ")
	private int numeroRue;

	@ToString(separator = " <-> ")
	private String libelleRue;

	@ToString
	private int codePostal;

	@ToString(upperCase = true)
	private String ville;

	@ToString(upperCase = true)
	private String pays;

	public static final int NB_DEPARTEMENTS = 101;

	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville, String pays) {
		this(numeroRue, libelleRue, codePostal, ville);
		this.pays = pays;
	}

	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String toString() {

		return StringUtils.toString(this);
	}

	/**
	 * Getter
	 * 
	 * @return the numeroRue
	 */
	public int getNumeroRue() {
		return numeroRue;
	}

	/**
	 * Setter
	 * 
	 * @param numeroRue the numeroRue to set
	 */
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	/**
	 * Getter
	 * 
	 * @return the libelleRue
	 */
	public String getLibelleRue() {
		return libelleRue;
	}

	/**
	 * Setter
	 * 
	 * @param libelleRue the libelleRue to set
	 */
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	/**
	 * Getter
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter
	 * 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter
	 * 
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		return builder.append(numeroRue).append(libelleRue).append(codePostal).append(ville).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdressePostale other = (AdressePostale) obj;
		if (codePostal != other.codePostal)
			return false;
		if (libelleRue == null) {
			if (other.libelleRue != null)
				return false;
		} else if (!libelleRue.equals(other.libelleRue))
			return false;
		if (numeroRue != other.numeroRue)
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}
}
