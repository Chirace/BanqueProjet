package Main;

import dao.CompteDAOMySQL;
import dao.DAOFactory;
import dao.DAOGenerique;
import dao.DAOMySQLFactory;
import modele.*;
import java.sql.Connection;

public class Main {
	//private MySQLManager manager;
	
	public static void main(String args[]) {
		Compte c1 = new Compte("1",Float.parseFloat("0.1"));
		Compte c2 = new Compte("7",Float.parseFloat("23500.0"));
		Compte c3 = new Compte("9",Float.parseFloat("1700.0"));
		Compte c4 = new Compte("8",Float.parseFloat("1500.0"));
		//CompteDAOMySQL interactionCompte = new CompteDAOMySQL();
		
		DAOGenerique<Compte> interactionCompte = new CompteDAOMySQL();
		DAOFactory interactionCompte2 = new DAOMySQLFactory();
		//System.out.println("T : " + interactionCompte2.getCompteDAO());
		//interactionCompte.create(c4);
		
		BanqueFacade bf = new BanqueFacade();
		//bf.ajouterCompte("10", Float.parseFloat("1200"));
		System.out.println("T : " + bf.findCompte(6));
		
		System.out.println("Fin");
	}
}
