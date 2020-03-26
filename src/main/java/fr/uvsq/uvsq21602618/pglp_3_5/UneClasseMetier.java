package fr.uvsq.uvsq21602618.pglp_3_5;
/**
 * Une classe métier lambda.
 * @author Nathalie
 *
 */
public class UneClasseMetier {
    /**
     * Un type d'affichage temporel.
     */
    private AffichageTemps affT;
    /**
     * Constructeur de la classe métier.
     * @param at L'affichage temps
     */
    public UneClasseMetier(final AffichageTemps at) {
        this.affT = at;
    }
    /**
     * Une méthode métier lambda.
     */
    public void uneMethodeMetier() {
        this.affT.affichageTemporel(": Début de uneMethodeMetier");
        //Traitement métier
        this.affT.affichageTemporel(": Fin de uneMethodeMetier");
    }
    /**
     * Une méthode métier utilisant SLF4J.
     */
    public void uneMethodeMetierSLF4J() {
        this.affT.affichageTemporelSLF4J(": Début de uneMethodeMetier");
        //Traitement métier
        this.affT.affichageTemporelSLF4J(": Fin de uneMethodeMetier");
    }
}
