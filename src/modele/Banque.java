package modele;

import java.util.LinkedList;

public class Banque {
	private LinkedList<Compte> LesComptes;
	
	
	public LinkedList<Compte> getLesComptes(){
		return LesComptes;
	}
	
	public void setLesComptes(LinkedList<Compte> LesComptes) {
		this.LesComptes = LesComptes;
	}
	
	public Compte addCompte(String numCompte, Float solde) {
		Compte l_compte = new Compte(numCompte,solde);
		if (LesComptes==null) LesComptes=new LinkedList<Compte>();
		LesComptes.add(l_compte);
		return l_compte;
	}
	
}
