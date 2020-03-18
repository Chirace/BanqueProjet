package daoFactory;

import dao.CompteDAOMySQL;
import dao.DAOGenerique;
import dao.OperationDAOMySQL;

//import modele.*;

public class DAOMySQLFactory extends DAOFactory{
	public DAOGenerique getCompteDAO() {
		return new CompteDAOMySQL();
	}
	
	public DAOGenerique getOperationDAO() {
		return new OperationDAOMySQL();
	}
}
