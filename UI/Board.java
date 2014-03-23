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

import Backend.Control;
import Backend.Player;

public class Board extends Component {
	private static final long serialVersionUID = 1L;

	private BufferedImage full; 
	private Control c;
	
	public Board(Control cont) {
		try {
			full = ImageIO.read(new File("/home/adam/workspace/Pokemon Drinking game/scaled_square_board.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		c = cont;
	}
	 
	public void paint(Graphics g){
		g.drawImage(full,0,0,500,500,null);
		for(Player p : c.players){
			BufferedImage picon = p.draw();
			int x = 0;
			int y = 0;
			if(p.loc<32){
				int deg = (int)(((double)p.loc/32)*360)+90;
				x = (((int)(Math.cos(Math.toRadians(deg)) * 240)+250)-5)+(p.id);
				y = (((int)(Math.sin(Math.toRadians(deg)) * 240)+250)-5)+(p.id);
			}
			else if(p.loc<64){
				int deg = (int)(((double)(63-p.loc)/32)*360)+90;
				x = (((int)(Math.cos(Math.toRadians(deg)) * 213)+250)-5)+(p.id);
				y = (((int)(Math.sin(Math.toRadians(deg)) * 213)+250)-5)+(p.id);
			}
			else if(p.loc < 96){
				int deg = (int)(((double)(p.loc-64)/32)*360)+90;
				x = (((int)(Math.cos(Math.toRadians(deg)) * 188)+250)-5)+(p.id);
				y = (((int)(Math.sin(Math.toRadians(deg)) * 188)+250)-5)+(p.id);
			}
			else if(p.loc < 128){
				int deg = (int)(((double)(127-p.loc)/32)*360)+90;
				x = (((int)(Math.cos(Math.toRadians(deg)) * 155)+250)-5)+(p.id);
				y = (((int)(Math.sin(Math.toRadians(deg)) * 155)+250)-5)+(p.id);
			}
			else if(p.loc < 144){
				int deg = (int)(((double)(p.loc-144)/16)*360)+90;
				x = (((int)(Math.cos(Math.toRadians(deg)) * 125)+250)-5)+(p.id);
				y = (((int)(Math.sin(Math.toRadians(deg)) * 125)+250)-5)+(p.id);
			}
			else{
				int deg = (int)(((double)(159-p.loc)/16)*360)+90;
				x = (((int)(Math.cos(Math.toRadians(deg)) * 80)+250)-5)+(p.id);
				y = (((int)(Math.sin(Math.toRadians(deg)) * 80)+250)-5)+(p.id);
			}
			g.drawImage(picon,x,y,10,10,null);
		}
	}
	
}
