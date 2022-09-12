package web;




public class ResModel {
	double taille  ;
	String sexe ; 
	double poids ;
	public ResModel() {
		
	}
	
	public ResModel(double taille, String sexe, double poids) {
		super();
		this.taille = taille;
		this.sexe = sexe;
		this.poids = poids;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	

}
