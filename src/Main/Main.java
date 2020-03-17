package Main;

import dao.CompteDAOMySQL;
import dao.DAOGenerique;
import modele.Compte;
import java.sql.Connection;

public class Main {
	//private MySQLManager manager;
	
	public static void main(String args[]) {
		Compte c1 = new Compte("1",Float.parseFloat("0.1"));
		Compte c2 = new Compte("7",Float.parseFloat("23500.0"));
		Compte c3 = new Compte("9",Float.parseFloat("1700.0"));
		//CompteDAOMySQL interactionCompte = new CompteDAOMySQL();
		
		DAOGenerique<Compte> interactionCompte = new CompteDAOMySQL();
		interactionCompte.create(c3);
		System.out.println("Fin");
	}
}
