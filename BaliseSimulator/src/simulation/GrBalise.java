package simulation;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import graphicLayer.GImage;

public class GrBalise extends GrElementMobile implements MouseListener {
	public GrBalise() {
		File path = new File("balise.png");
		this.withoutBorder();
		this.withoutBackground();
		BufferedImage rawImage = null;
		try {
			rawImage = ImageIO.read(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.addElement(new GImage(rawImage));
		this.setDimension(new Dimension(rawImage.getWidth(), rawImage.getHeight()));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Identifiant : "+model);
		System.out.println("Pourcentage complétion :"+ Math.round(((float)model.dataSize()/(float)model.memorySize())*100.0));
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
