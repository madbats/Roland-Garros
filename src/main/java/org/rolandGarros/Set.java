package org.rolandGarros;

public class Set {
	public Set(int idSet, int idMatch, int scoreJ1, int scoreJ2, int numero) {
		super();
		this.idSet = idSet;
		this.idMatch = idMatch;
		this.scoreJ1 = scoreJ1;
		this.scoreJ2 = scoreJ2;
		this.numero = numero;
	}
	
	private int idSet;
	private int idMatch;
	private int scoreJ1;
	private int scoreJ2;
	private int numero;
	
	public int getIdSet() {
		return idSet;
	}
	public void setIdSet(int idSet) {
		this.idSet = idSet;
	}
	public int getIdMatch() {
		return idMatch;
	}
	public void setIdMatch(int idMatch) {
		this.idMatch = idMatch;
	}
	public int getScoreJ1() {
		return scoreJ1;
	}
	public void setScoreJ1(int scoreJ1) {
		this.scoreJ1 = scoreJ1;
	}
	public int getScoreJ2() {
		return scoreJ2;
	}
	public void setScoreJ2(int scoreJ2) {
		this.scoreJ2 = scoreJ2;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
