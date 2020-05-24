package fr.uvsq.uvsq21602618.pglp_3_5;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import org.junit.Test;

/**
 * Classe de tests pour la classe AffichageTemps.
 * @author Nathalie
 *
 */
public class AffichageTempsTest {
    /**
     * Teste le méthode getDescriptif.
     */
    @Test
    public void affichageTemporel() {
        AffichageTemps affT = new AffichageTemps();
        UneClasseMetier a = new UneClasseMetier(affT);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        a.uneMethodeMetier();
        String expected = LocalDateTime.now()+": Début de uneMethodeMetier\r\n"
                + LocalDateTime.now() + ": Fin de uneMethodeMetier";
        assertEquals(expected, outContent.toString().trim());
    }
}
