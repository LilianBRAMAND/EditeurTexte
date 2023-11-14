package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {

    private static final String DescriptionCommande = "ajouter;texte\n  Ajoute le texte à la fin du document\n";

    /**
     * Constructeur de la classe CommandeAjouter.
     *
     * @param document   le document sur lequel s'applique la commande.
     * @param parameters les paramètres de la commande.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    /**
     * Exécute la commande d'ajout de texte au document.
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    /**
     * Renvoie la description de la commande.
     *
     * @return la description de la commande.
     */
    public String getDescriptionCommande() {
        return DescriptionCommande;
    }
}
