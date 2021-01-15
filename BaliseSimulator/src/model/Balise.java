package model;

public class Balise extends ElementMobile implements SatelitteMoveListener{
	
	EtatBalise etat;;
	
	public EtatBalise getEtat() {
		return etat;
	}

	public void setEtat(EtatBalise etat) {
		this.etat = etat;
	}

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
			this.etat.done(this);
		}
		etat.action(this);
		super.tick();
	}

	@Override
	public void whenSatelitteMoved(SatelitteMoved arg) {
		DeplacementBalise dp = (DeplacementBalise) this.depl;
		dp.whenSatelitteMoved(arg, this);
	}


}
