package fr.uvsq.uvsq21602618.pglp_3_5;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Classe pour un affichage temporel.
 * @author Nathalie
 *
 */
public class AffichageTemps implements Affichage {
    /**
     * Le logger utilisé.
     */
	final private Logger logger;
	/**
	 * Méthode pour afficher le temps avec un logger.
	 */
	public AffichageTemps() {
		this.logger =  LoggerFactory.getLogger(AffichageTemps.class);
	}
	/**
	 * Méthode pour afficher la date immédiate avec le
	 * descriptif associé.
	 * @param descriptif Le descriptif
	 */
	public void affichageTemporel(final String descriptif) {
		System.out.println(LocalDateTime.now() + descriptif);
	}
	/**
     * Méthode pour afficher la date immédiate avec le
     * descriptif associé. Cette fois-ci avec logger.
     * @param descriptif Le descriptif
     */
	public void affichageTemporelSLF4J(final String descriptif) {
		logger.info(LocalDateTime.now() + descriptif);
	}
	/**
	 * Méthode retourne le logger.
	 * @return le logger
	 */
	public Logger getLogger() {
	    return this.logger;
	}

}
