package model;

public class Satelitte extends ElementMobile {
			
	public Satelitte(int memorySize) {
		super(memorySize);
	}
	
	public void bouge () {
		super.bouge();
		this.send(new SatelitteMoved(this));		
	}
	
	public void registerBaliseParSatellite(Balise b) {
		this.registerListener(SatelitteMoved.class, b);
	}
	public void unregisterBaliseParSatellite(Balise b) {
		this.unregisterListener(SatelitteMoved.class, b);
	}
}
