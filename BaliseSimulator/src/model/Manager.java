package model;

import java.util.ArrayList;

public class Manager {
	ArrayList<ElementMobile> listeElementMobile = new ArrayList<ElementMobile>();
	ArrayList<Satelitte> sats = new ArrayList<Satelitte>();
	ArrayList<Balise> bals = new ArrayList<Balise>();
	
	public void addElementMobile(ElementMobile e) {
		listeElementMobile.add(e);
		e.setManager(this);
	}
	/*public void addBalise(Balise bal) {
		bals.add(bal);
		bal.setManager(this);
	}
	public void addSatellite(Satelitte sat) {
		this.sats.add(sat);
		sat.setManager(this);
	}
	public void tick() {
		for (Balise b : this.bals) {
			b.tick();
		}
		for (Satelitte s : this.sats) {
			s.tick();
		}
	}*/
	
	public void tick() {
		for (ElementMobile e : this.listeElementMobile) {			
			e.tick();
		}
	}
	
	public void baliseReadyForSynchro(Balise b) {
		for (ElementMobile e : this.listeElementMobile) {			
			e.registerBaliseParSatellite(b);
		}
	}
	public void baliseSynchroDone(Balise b) {
		for (ElementMobile e : this.listeElementMobile) {			
			e.unregisterBaliseParSatellite(b);
		}
	}

}
