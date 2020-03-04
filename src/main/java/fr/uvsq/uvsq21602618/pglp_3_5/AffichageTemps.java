package fr.uvsq.uvsq21602618.pglp_3_5;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AffichageTemps implements Affichage {

	final Logger logger;
	
	public AffichageTemps() {
		this.logger =  LoggerFactory.getLogger(AffichageTemps.class);
		
	}
	public void affichageTemporel(final String descriptif) {
		System.out.println(LocalDateTime.now() + descriptif);
	}
	
	public void affichageTemporelSLF4J(final String descriptif) {
		logger.info(LocalDateTime.now() + descriptif);
	}

}
