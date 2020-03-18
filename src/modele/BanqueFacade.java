package modele;

import java.util.LinkedList;

import dao.CompteDAOMySQL;
import dao.OperationDAOMySQL;

public class BanqueFacade {

	public LinkedList<Compte> getLesComptes(){
		LinkedList<Compte> LesComptes = new LinkedList<Compte>();
		CompteDAOMySQL compteDAO = new CompteDAOMySQL();
		LesComptes = compteDAO.findAll();
		
		return LesComptes;
	}
	
	public Compte findCompte(int cle) {
		CompteDAOMySQL compteDAO = new CompteDAOMySQL();
		Compte compte = compteDAO.findById(cle);
		
		return compte;
	}
	
	public Compte ajouterCompte(String numCompte, Float solde) {
		CompteDAOMySQL compteDAO = new CompteDAOMySQL();
		Compte compte = compteDAO.create(new Compte(numCompte, solde));
		
		return compte;
	}
	
	public Compte enregistrerCompte(int cleCompte) {
		CompteDAOMySQL compteDAO = new CompteDAOMySQL();
		Compte compte = compteDAO.update(compteDAO.findById(cleCompte));
		
		return compte;
	}
	
	public Compte ajouterOperation(String intitule, String date, Float montant, Compte c) {
		CompteDAOMySQL compteDAO = new CompteDAOMySQL();
		OperationDAOMySQL operationDAO = new OperationDAOMySQL();
		
		Compte compte = compteDAO.findById(c.getCle());
		compte.addOperation(intitule, date, montant);
		
		operationDAO.create(new Operation(intitule, montant, date, compte.getCle()));
		
		//compte = compteDAO.update(c);
		
		return compte;
	}
	
	public void saveAll() {
		//Faut appeler le saveAll de MySQL et faut réecrire le saveAll du JSON
	}
	
	
}
