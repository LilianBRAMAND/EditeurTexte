package fr.iut.editeur.document;

public class Document {

    private String texte;

    /**
     * Constructeur de la classe Document.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Renvoie le texte du document.
     *
     * @return le texte du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Modifie le texte du document.
     *
     * @param texte le nouveau texte du document.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document.
     *
     * @param texte le texte à ajouter.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Renvoie une représentation sous forme de chaîne de caractères du document.
     *
     * @return la chaîne de caractères représentant le document.
     */
    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace une partie du texte par une autre chaîne de caractères.
     *
     * @param start        l'indice de début de la partie à remplacer.
     * @param end          l'indice de fin de la partie à remplacer.
     * @param remplacement la nouvelle chaîne de caractères de remplacement.
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Met en majuscules une partie du texte.
     *
     * @param start l'indice de début de la partie à mettre en majuscules.
     * @param end   l'indice de fin de la partie à mettre en majuscules.
     */
    public void majuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String toUpper = texte.substring(start, end).toUpperCase();
        texte = leftPart + toUpper + rightPart;
    }

    /**
     * Efface une partie du texte.
     *
     * @param start l'indice de début de la partie à effacer.
     * @param end   l'indice de fin de la partie à effacer.
     */
    public void effacer(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + rightPart;
    }

    /**
     * Efface tout le texte du document.
     */
    public void clear() {
        texte = "";
    }

    /**
     * Insère une chaîne de caractères à une position donnée du texte.
     *
     * @param start     l'indice de la position d'insertion.
     * @param insertion la chaîne de caractères à insérer.
     */
    public void inserer(int start, String insertion) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(start);
        texte = leftPart + insertion + rightPart;

    }

    /**
     * Met en minuscules une partie du texte.
     *
     * @param start l'indice de début de la partie à mettre en minuscules.
     * @param end   l'indice de fin de la partie à mettre en minuscules.
     */
    public void minuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String toLower = texte.substring(start, end).toLowerCase();
        texte = leftPart + toLower + rightPart;
    }

}
