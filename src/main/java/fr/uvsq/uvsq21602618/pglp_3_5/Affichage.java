package fr.uvsq.uvsq21602618.pglp_3_5;
/**
 * Une interface pour l'affichage.
 * @author Nathalie
 *
 */
public interface Affichage {
    /**
     * Méthode pour l'affichage du temps.
     * @param descriptif description associée au temps
     */
    void affichageTemporel(String descriptif);
    /**
     * Méthode pour l'affichage du temps avec SLF4J.
     * @param descriptif description associée au temps
     */
    void affichageTemporelSLF4J(String descriptif);
}
