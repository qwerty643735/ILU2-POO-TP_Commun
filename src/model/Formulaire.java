package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int nbEntite;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return nbEntite;
	}

	public void setIdentificationEntite(int nbEntite) {
		this.nbEntite = nbEntite;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
}