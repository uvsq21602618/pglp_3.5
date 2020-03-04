package fr.uvsq.uvsq21602618.pglp_3_5;

public class UneClasseMetier {

	private AffichageTemps AT;
	public UneClasseMetier(final AffichageTemps AT) {
		this.AT = AT;
	}
	
	public void uneMethodeMetier() {
		this.AT.affichageTemporel(": Début de uneMethodeMetier");
		//Traitement métier
		this.AT.affichageTemporel(": Fin de uneMethodeMetier");
	}
	
	public void uneMethodeMetierSLF4J() {
		this.AT.affichageTemporelSLF4J(": Début de uneMethodeMetier");
		//Traitement métier
		this.AT.affichageTemporelSLF4J(": Fin de uneMethodeMetier");
	}
}
