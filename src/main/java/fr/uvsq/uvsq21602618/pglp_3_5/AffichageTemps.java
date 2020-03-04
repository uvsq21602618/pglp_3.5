package fr.uvsq.uvsq21602618.pglp_3_5;

import java.time.LocalDateTime;

public class AffichageTemps implements Affichage {

	public void affichageTemporel(String descriptif) {
		System.out.println(LocalDateTime.now() + descriptif);
		
	}

}
