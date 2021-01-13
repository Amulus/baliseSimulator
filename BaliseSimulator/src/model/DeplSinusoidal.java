package model;

import java.awt.Point;

public class DeplSinusoidal extends DeplacementBalise {
	Integer min;
	Integer max;
	Integer start;
	Integer end;
	Boolean monte = false;
	Boolean fromStartToEnd = true;
	
	public DeplSinusoidal(Integer min, Integer max, Integer start, Integer end) {
		super(null);
		this.min = min;
		this.max = max;
		this.start = start;
		this.end = end;
	}
	@Override
	public void bouge(ElementMobile target) {
		Point p = target.getPosition();
		int x = p.x;
		int y = p.y;
		
		if (fromStartToEnd) {
			x += 7;
			if (x > end) fromStartToEnd = false;
		} else {
			x -= 7;
			if (x < start) fromStartToEnd = true;
		}
		
		if (monte) {
			y -= 10;
			if (y < min) monte = false;
		} else {
			y += 10;
			if (y > max) monte = true;
		}
		target.setPosition(new Point(x, y));
	}
	

}
