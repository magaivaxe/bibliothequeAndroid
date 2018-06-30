
Salut mes gars! Voici les standards de codage.

Nom de variables, methodes et paquets: le nom plus court possible et logique minuscule en premier et pas de numéros, pas de under score, pas de tiret (_ -). Toujuors utiliser la notation majuscule-minuscule exemple: monNomDeVariable = quelqueChose;

Dans variables numéros sont permis à la fin pour les énumérations ou séquences, exemple:

int [] monVecteur = new int[]{quelquechose1,quelquechose2,quelquechose3,quelquechose4}

Classes: Si il y a besoin de creer des classes choisir le nom plus court et logique possible, pas de numéro, pas de under score, pas de tiret, utiliser notation majuscule-minuscule exemple: MaClasseFavorite;

TOUJOURS ABSOLUMENT TOUJOURS le nom de variables ou finales pour retourner dans le méthodes seront appellées aRetourner. exemple:

// methode exemple private double meuBagoSempreGrande(){ double aRetourner = 00;

return aRetourner; }

L'indintation adoptée sera le style K&R, exemple:

// methode exemple private void meuBagonildos(){ if (x == y) { quelquechose1(); quelquechose2(); } else { quelquechose1(); quelquechose2(); } finalement(); }
