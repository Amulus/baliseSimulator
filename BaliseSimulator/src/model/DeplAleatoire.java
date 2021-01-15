package model;

import java.util.Random;

public class DeplAleatoire extends DeplacementBalise {

	public DeplAleatoire() {
		super(null);
	}

	public Deplacement dep(Integer start, Integer end) {
		Random r = new Random();
		if (r.nextInt(100) % 4 == 0)
			return new DeplSinusoidal(start + 50, start - 50, start, end);
		else if (r.nextInt(100) % 2 == 0) {
			return new DeplVertical(start, end);
		} else
			return new DeplHorizontal(start, end);
	}
}
