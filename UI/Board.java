package UI;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.UIManager;

public class Board extends Component {
	/**
	 * Create the panel.
	 */
	
	private BufferedImage full; 
	private BufferedImage viewPort;
	private int rotate;
	
	public Board() {
		try {
			full = ImageIO.read(new File("/home/adam/workspace/Pokemon Drinking game/c31502_3509312.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setForeground(UIManager.getColor("window"));
	}
	
	public void paint(Graphics g){
		
		g.drawImage(full,0,0,450,300,(full.getWidth()/2)-225,full.getHeight()-300, (full.getWidth()/2)+225,full.getHeight(),null);
	}
	
	public void rotate(int center){
		int rotate = center;
	}
}
