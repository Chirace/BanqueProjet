package modele;

import java.util.LinkedList;

public class Compte {
	private int cle;
	private String numCompte;
	private float solde;
	private LinkedList<Operation> LesOperations;
	
	//Getters & Setters
	public int getCle() {
		return cle;
	}

	public void setCle(int cle) {
		this.cle = cle;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public LinkedList<Operation> getLesOperations() {
		return LesOperations;
	}
	
	public void addOperation(String intitule, String date, Float montant) {
		Operation l_operation = new Operation(intitule, montant, date, cle);
		if (LesOperations==null) LesOperations=new LinkedList<Operation>();
		LesOperations.add(l_operation);
	}
	//Constructeur
	public Compte(String numCompte, float solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public Compte() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (cle != other.cle)
			return false;
		if (numCompte == null) {
			if (other.numCompte != null)
				return false;
		} else if (!numCompte.equals(other.numCompte))
			return false;
		if (Float.floatToIntBits(solde) != Float.floatToIntBits(other.solde))
			return false;
		return true;
	}
	
	
	
}
