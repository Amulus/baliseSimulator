package Tests;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

import model.Balise;
import model.DeplHorizontal;
import model.DeplSatellite;
import model.DeplSinusoidal;
import model.DeplVertical;
import model.Manager;
import model.Satelitte;

public class TestModel {

	@Test
	public void testBalise() {
		Balise bal = new Balise(300);
		bal.setPosition(new Point(400, 200));
		bal.setDeplacement(new DeplVertical(130, 270));

		for(int i = 0;i<301;i++)
		{
			bal.bouge();
			bal.tick();
		}
		
		  System.out.println(bal.getPosition().x+" ,"+bal.getPosition().y);
		  System.out.println(bal.memorySize()); 
		  System.out.println(bal.profondeur());
		  System.out.println(bal.dataSize());
		 

		Assert.assertEquals(bal.profondeur(), 266);
		Assert.assertTrue(bal.getPosition().equals(new Point(400, 266)));
		Assert.assertTrue(bal.memorySize() == 300);
		Assert.assertTrue(bal.dataSize() == 0);
	}

	@Test
	public void testBaliseMemoryFull() {
		Balise bal = new Balise(300);
		bal.setPosition(new Point(400, 200));
		bal.setDeplacement(new DeplHorizontal(50, 750));
		bal.bouge();

		for(int i = 0;i<301;i++)
		{
			bal.bouge();
			bal.tick();
		}

		Assert.assertEquals(bal.profondeur(), 197);
		Assert.assertTrue(bal.getPosition().equals(new Point(612, 197)));
		Assert.assertTrue(bal.memorySize() == 300);
		Assert.assertTrue(bal.dataSize() == 0);
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
	
	@Test
	public void testManager() {
		Manager manager = new Manager();
		Balise bal = new Balise(300);
		bal.setPosition(new Point(400, 200));
		bal.setDeplacement(new DeplSinusoidal(250, 150, 200, 600));
		Satelitte sat = new Satelitte(100000);
		sat.setPosition(new Point(10, 50));
		sat.setDeplacement(new DeplSatellite(-10, 1000, 2));
		manager.addElementMobile(bal);
		manager.tick();
		manager.addElementMobile(sat);
		manager.tick();
		
//		System.out.println(sat.getPosition().x+" ,"+sat.getPosition().y);
//		System.out.println(sat.memorySize());
//		System.out.println("---------");
//		System.out.println(bal.getPosition().x+" ,"+bal.getPosition().y);
//		System.out.println(bal.memorySize()); System.out.println(bal.profondeur());
//		System.out.println(bal.dataSize());
		Assert.assertTrue(sat.getPosition().equals(new Point(12, 50)));
		Assert.assertTrue(bal.getPosition().equals(new Point(414, 200)));

		 

	}

}
