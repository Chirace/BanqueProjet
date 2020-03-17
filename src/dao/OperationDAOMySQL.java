package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;

import datasourceManagement.MySQLManager;
import modele.Compte;
import modele.Operation;

public class OperationDAOMySQL extends DAOGenerique<Operation> {
	
	/*public OperationDAOMySQL(Connection conn) {
	    super(conn);
	}*/
	
	public Operation create(Operation operation) {
		String req = "INSERT INTO Operation (intitule, montant, dateOperation, idCompte)";
		System.out.println("Début connexion");
		operation.setCle(MySQLManager.getInstance().setData(req));
		return operation;
	}
	
	/*public Operation delete(Operation operation) {
		return operation;
	}*/
	
	public Operation update(Operation operation) {
		String req = "UPDATE Operation SET	intitule = '" + operation.getIntitule() + 
				"' AND SET montant = '" + operation.getMontant() +
				"' AND SET dateOperation = '" + operation.getDateOperation() +
				"' AND SET idCompte = '" + operation.getCleCompte() +
				"' WHERE idOperation = " + operation.getCle();
		operation.setCle(MySQLManager.getInstance().setData(req));
		return operation;
	}
	
	public void saveAll(LinkedList<Operation> LesOperations) {
		
	}
	
	public Operation findById(int cle) {
		Operation operation = new Operation();
		try {
			String req = "SELECT * FROM Operation WHERE idOperation = " + cle;
			ResultSet rs = MySQLManager.getInstance().getData(req);
			operation = new Operation(rs.getString("intitule"), rs.getFloat("montant"), rs.getString("dateOperation"), rs.getInt("idCompte"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return operation;
	}
	
	public LinkedList<Operation> findAll(){
		LinkedList<Operation> LesOperations = new LinkedList<Operation>();
		try {
			String req = "SELECT * FROM Operation";
			ResultSet rs = MySQLManager.getInstance().getData(req);
			while(rs.next()) {
				LesOperations.add(new Operation(rs.getString("intitule"), rs.getFloat("montant"), rs.getString("dateOperation"), rs.getInt("idCompte")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return LesOperations;
	}
	
	public LinkedList<Operation> findByName(String name){
		LinkedList<Operation> LesOperations = new LinkedList<Operation>();
		try {
			String req = "SELECT * FROM Operation WHERE intitule = " + name;
			ResultSet rs = MySQLManager.getInstance().getData(req);
			while(rs.next()) {
				LesOperations.add(new Operation(rs.getString("intitule"), rs.getFloat("montant"), rs.getString("dateOperation"), rs.getInt("idCompte")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return LesOperations;
	}
}
