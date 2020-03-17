package dao;

import java.util.LinkedList;

import modele.Operation;

public abstract class DAOFactory {
	public abstract DAOGenerique getCompteDAO();
	
	public abstract DAOGenerique getOperationDAO();
	
	//public abstract DAOFactory getFactory(SourceDonnees sd);
}
