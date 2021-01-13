package model;

public class Balise extends ElementMobile implements SatelitteMoveListener{
	
	EtatBalise etat;;
	
	public Balise(int memorySize) {
		super(memorySize);
		this.etat = new BaliseEnregistre();
	}
	
	public int profondeur() { 
		return this.getPosition().y; 
	}
	
	protected void readSensors() {
		this.dataSize++;
	}
	
	public void tick() {
		
		if(this.memoryFull()) {
			this.etat = new BaliseSynchronize();
			Deplacement redescendre = new Redescendre(this.deplacement(), this.profondeur());
			Deplacement deplSynchro = new DeplSynchronisation(redescendre);
			Deplacement nextDepl = new MonteSurfacePourSynchro(deplSynchro);
			this.setDeplacement(nextDepl);
			this.resetData();
		}
		etat.action(this);
		/*if (this.memoryFull() && !this.synchronize) {
			this.synchronize = true;
			
			
			this.resetData();
		}else if(!this.memoryFull() && !this.synchronize) {
			this.readSensors();
		}*/
		super.tick();
	}

	@Override
	public void whenSatelitteMoved(SatelitteMoved arg) {
		DeplacementBalise dp = (DeplacementBalise) this.depl;
		dp.whenSatelitteMoved(arg, this);
	}


}
