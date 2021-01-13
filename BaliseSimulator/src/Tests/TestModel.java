package Tests;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

import model.Balise;
import model.DeplHorizontal;
import model.DeplSatellite;
import model.DeplSinusoidal;
import model.DeplVertical;
import model.Satelitte;

public class TestModel {

	@Test
	public void testBalise() {
		Balise bal = new Balise(300);
		bal.setPosition(new Point(400, 200));
		bal.setDeplacement(new DeplVertical(130, 270));
		bal.setDeplacement(new DeplSinusoidal(250, 150, 200, 600));
		bal.setDeplacement(new DeplHorizontal(50, 750));
		bal.bouge();
		bal.tick();
		/*
		 * System.out.println(bal.getPosition().x+" ,"+bal.getPosition().y);
		 * System.out.println(bal.memorySize()); System.out.println(bal.profondeur());
		 * System.out.println(bal.dataSize());
		 */

		Assert.assertEquals(bal.profondeur(), 200);
		Assert.assertTrue(bal.getPosition().equals(new Point(412, 200)));
		Assert.assertTrue(bal.memorySize() == 300);
		Assert.assertTrue(bal.dataSize() == 1);
	}

	@Test
	public void testBaliseMemoryFull() {
		Balise bal = new Balise(300);
		bal.setPosition(new Point(400, 200));
		bal.setDeplacement(new DeplVertical(130, 270));
		bal.setDeplacement(new DeplSinusoidal(250, 150, 200, 600));
		bal.setDeplacement(new DeplHorizontal(50, 750));
		bal.bouge();
		bal.tick();
		/*
		 * System.out.println(bal.getPosition().x+" ,"+bal.getPosition().y);
		 * System.out.println(bal.memorySize()); System.out.println(bal.profondeur());
		 * System.out.println(bal.dataSize());
		 */

		Assert.assertEquals(bal.profondeur(), 200);
		Assert.assertTrue(bal.getPosition().equals(new Point(412, 200)));
		Assert.assertTrue(bal.memorySize() == 300);
		Assert.assertTrue(bal.dataSize() == 1);
	}

	@Test
	public void testSatellite() {
		Satelitte sat = new Satelitte(100000);
		sat.setPosition(new Point(10, 50));
		sat.setDeplacement(new DeplSatellite(-10, 1000, 2));
		sat.bouge();
		sat.tick();
		/*
		 * System.out.println(sat.getPosition().x+" ,"+sat.getPosition().y);
		 * System.out.println(sat.memorySize());
		 * 
		 */

		Assert.assertTrue(sat.getPosition().equals(new Point(14, 50)));
		Assert.assertTrue(sat.memorySize() == 100000);
	}

}
