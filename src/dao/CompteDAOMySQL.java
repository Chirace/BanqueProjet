package dao;

import java.util.LinkedList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import datasourceManagement.MySQLManager;
import modele.Compte;


public class CompteDAOMySQL {
	public Compte create(Compte compte) {
			String req = "INSERT INTO Compte (numCompte, solde) VALUES ('" 
					+ compte.getNumCompte() + ("', '" +compte.getSolde() + "')");
			
			compte.setCle(MySQLManager.getInstance().setData(req));
		return compte;
	}
	
	/*public Compte delete(Compte compte) {
		return compte;
	}*/
	
	public Compte update(Compte compte) {
		String req = "UPDATE Compte SET	numCompte = '" + compte.getNumCompte() + 
				"' AND SET solde = '" + compte.getSolde() +
				"' WHERE idCompte = " + compte.getCle();
		compte.setCle(MySQLManager.getInstance().setData(req));
		return compte;
	}
	
	public void saveAll(LinkedList<Compte> LesComptes) {
		String req = "";
	}
	
	public Compte findById(int cle) {
		Compte compte = new Compte();
		try {
			String req = "SELECT * FROM Compte WHERE idCompte = " + cle;
			ResultSet rs = MySQLManager.getInstance().getData(req);
			compte = new Compte(rs.getString("numCompte"), rs.getFloat("solde"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return compte;
	}
	
	public LinkedList<Compte> findAll(){
		LinkedList<Compte> LesComptes = new LinkedList<Compte>();
		try {
			String req = "SELECT * FROM Compte";
			ResultSet rs = MySQLManager.getInstance().getData(req);
			while(rs.next()) {
				LesComptes.add(new Compte(rs.getString("numCompte"), rs.getFloat("solde")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return LesComptes;
	}
	
	public LinkedList<Compte> findByName(String name){
		LinkedList<Compte> LesComptes = new LinkedList<Compte>();
		try {
			String req = "SELECT * FROM Compte WHERE numCompte = " + name;
			ResultSet rs = MySQLManager.getInstance().getData(req);
			while(rs.next()) {
				LesComptes.add(new Compte(rs.getString("numCompte"), rs.getFloat("solde")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LesComptes;
	}
}
