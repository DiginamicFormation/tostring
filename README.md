# Mise en oeuvre d'une annotation @ToString pour la génération de la méthode toString()

> Ce projet montre comment développer un mécanisme reposant sur une annotation

**Liste des classes de ce projet**
- fr.diginamic.annotation.ToString : annotation utilisée dans le mécanisme
- fr.diginamic.utils.StringUtils: classe qui génère une chaine de caractères pour un objet passé en paramètre
- fr.diginamic.entite.Adresse : exemple de classe qui utilise cette annotation (attributs + méthode toString())
- fr.diginamic.entite.Personne: second exemple de classe qui utilise cette annotation (attributs + méthode toString()
- fr.diginamic.TestToString: classe qui fait une démo.

> A propos des classes Adresse et Personne
- Observez bien la méthode toString() définie dans ces 2 classes. Elle utilise la classe StringUtils.