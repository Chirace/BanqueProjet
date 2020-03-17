package modele;

public class Operation {
	private int cle;
	private String intitule;
	private Float montant;
	private String dateOperation;
	private Compte compte;
	
	public int getCle() {
		return cle;
	}
	public void setCle(int cle) {
		this.cle = cle;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	
	public int getCleCompte() {
		return compte.getCle();
	}
	public void setCleCompte(Compte compte) {
		this.compte.setCle(compte.getCle());
	}
	public Operation(String intitule, Float montant, String dateOperation, int idCompte){
		this.intitule = intitule;
		this.montant = montant;
		this.dateOperation = dateOperation;
		this.compte.setCle(idCompte);
	}
	
	public Operation() {
		super();
	}
	
}
