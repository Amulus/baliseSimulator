package model;

public class BaliseSynchronize extends EtatBalise {

	@Override
	public void action(Balise balise) {
		// TODO Auto-generated method stub

	}

	@Override
	public void done(Balise balise) {
		// TODO Auto-generated method stub
		balise.setEtat(new BaliseEnregistre());
	}

}
