package Main;

import modele.*;
import dao.*;
import datasourceManagement.MySQLManager;

public class Main {
	//private MySQLManager manager;
	
	public static void main(String args[]) {
		Compte c1 = new Compte("1",Float.parseFloat("0.1"));
		Compte c2 = new Compte("7",Float.parseFloat("23500.0"));
		CompteDAOMySQL interactionCompte = new CompteDAOMySQL();
		interactionCompte.create(c2);
		System.out.println("Fin");
	}
}
