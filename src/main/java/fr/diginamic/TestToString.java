package fr.diginamic;

import fr.diginamic.entite.AdressePostale;
import fr.diginamic.entite.Personne;

public class TestToString {

	public static void main(String[] args) {
		AdressePostale adresse = new AdressePostale(5, "rue du Marché", 44850, "Saint-Herblain");
		System.out.println(adresse);

		Personne personne = new Personne("Durand", "Paul", adresse);
		System.out.println(personne);
	}

}
