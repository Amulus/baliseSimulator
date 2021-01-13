package model;

public class BaliseEnregistre extends EtatBalise {

	@Override
	public void action(Balise balise) {
		// TODO Auto-generated method stub
		balise.readSensors();
	}

}
