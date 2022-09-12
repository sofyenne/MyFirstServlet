package web;

public class CalculImp implements ICalcul {

	@Override
	public double claculePoids(double taille, String sexe) {
		if(sexe.equals(SEXE.HOME)) {
			return taille-100-((taille-150)/4);
		}else
			return taille-100-((taille-150)/2.5);
	}
		
	}
	
