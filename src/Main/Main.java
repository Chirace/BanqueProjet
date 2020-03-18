package Main;

import dao.CompteDAOMySQL;
import dao.DAOGenerique;
import dao.OperationDAOMySQL;
import daoFactory.DAOFactory;
import daoFactory.DAOMySQLFactory;
import modele.BanqueFacade;
import modele.Compte;
import modele.Operation;

public class Main {
	//private MySQLManager manager;
	
	public static void main(String args[]) {
		Compte c1 = new Compte("1",Float.parseFloat("0.1"));
		Compte c2 = new Compte("7",Float.parseFloat("23500.0"));
		Compte c3 = new Compte("9",Float.parseFloat("1700.0"));
		Compte c4 = new Compte("8",Float.parseFloat("1500.0"));
		Compte c5 = new Compte("11",Float.parseFloat("3000.0"));
		
		//CompteDAOMySQL interactionCompte = new CompteDAOMySQL();
		//Compte compte = interactionCompte.findById(1);
		
		//Operation o1 = new Operation("Op�ration 1", Float.parseFloat("3000.0"), "18-02-2020", compte.getCle());
		/*Operation o2 = new Operation("Op�ration 2", Float.parseFloat("3000.0"), "19-02-2020", 1);
		Operation o3 = new Operation("Op�ration 3", Float.parseFloat("3000.0"), "20-02-2020", 1);
		Operation o4 = new Operation("Op�ration 4", Float.parseFloat("3000.0"), "21-02-2020", 1);*/
		
		/*c1.addOperation("Op�ration 1", "18-02-2020", Float.parseFloat("3000.0"));
		c1.addOperation("Op�ration 2", "19-02-2020", Float.parseFloat("3000.0"));
		c1.addOperation("Op�ration 3", "20-02-2020", Float.parseFloat("3000.0"));*/
		
		//OperationDAOMySQL interactionOperation = new OperationDAOMySQL();
		//interactionOperation.create(o1);
		
		
		
		//DAOGenerique<Compte> interactionCompte = new CompteDAOMySQL();
		//DAOFactory interactionCompte2 = new DAOMySQLFactory();
		//System.out.println("T : " + interactionCompte2.getCompteDAO());
		//interactionCompte.create(c4);
		
		BanqueFacade bf = new BanqueFacade();
		//bf.ajouterCompte("8", Float.parseFloat("1500"));
		System.out.println("T : " + bf.findCompte(1).toString2()); //Exception MySQL
		//bf.enregistrerCompte(10);
		//bf.ajouterOperation("Op�ration 1", "18-02-2020", Float.parseFloat("3000.0"), c5);
		
		System.out.println("Fin");
	}
}
