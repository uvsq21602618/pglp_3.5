package fr.uvsq.uvsq21602618.pglp_3_5;
/**
 * Le main.
 * @author Nathalie
 *
 */
public enum Main {
    /**
     * Singleton main.
     */
    MAIN;
    /**
     * Le programme du main.
     * On teste nos deux méthodes.
     */
    public void run() {
        AffichageTemps affT = new AffichageTemps();
        UneClasseMetier a = new UneClasseMetier(affT);

        a.uneMethodeMetier();
        a.uneMethodeMetierSLF4J();
    }
    /**
     * Méthode main.
     * @param args arguments
     */
    public static void main(final String[] args) {
        MAIN.run();
    }
}
