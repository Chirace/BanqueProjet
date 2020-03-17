package dao;

import java.sql.Connection;
import java.util.LinkedList;

public abstract class DAOGenerique<T> {
	   
	protected Connection connect = null;
	   
	  /*public DAOGenerique(Connection conn){
	    this.connect = conn;
	  }*/
	   
	  //public abstract boolean delete(T obj);
	  
	  public abstract T create(T obj);
	  
	  public abstract T update(T obj);

	  public abstract void saveAll(LinkedList<T> obj);
	  
	  public abstract T findById(int cle);
	  
	  public abstract LinkedList<T> findAll();
	  
	  public abstract LinkedList<T> findByName(String name);

}
