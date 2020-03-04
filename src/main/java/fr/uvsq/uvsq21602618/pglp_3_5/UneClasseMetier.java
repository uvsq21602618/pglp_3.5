package fr.uvsq.uvsq21602618.pglp_3_5;

public class UneClasseMetier{

	private AffichageTemps AT;
	
	public UneClasseMetier(AffichageTemps AT) {
		this.AT=AT;
	}
	public void uneMethodeMetier() {
		this.AT.affichageTemporel(": Début de uneMethodeMetier");
		//Traitement métier
		this.AT.affichageTemporel(": Fin de uneMethodeMetier");
	}
}
