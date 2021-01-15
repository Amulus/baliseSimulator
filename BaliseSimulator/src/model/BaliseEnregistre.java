package model;

public class BaliseEnregistre extends EtatBalise {

	@Override
	public void action(Balise balise) {
		// TODO Auto-generated method stub
		balise.readSensors();
	}

	@Override
	public void done(Balise balise) {
		// TODO Auto-generated method stub
		balise.setEtat(new BaliseSynchronize());
		Deplacement redescendre = new Redescendre(balise.deplacement(), balise.profondeur());
		Deplacement deplSynchro = new DeplSynchronisation(redescendre);
		Deplacement nextDepl = new MonteSurfacePourSynchro(deplSynchro);
		balise.setDeplacement(nextDepl);
		balise.resetData();
	}

}
