package UI;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSlider;

import Backend.Control;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JSlider slider;
	public Board b;
	public JPanel menu;
	public JPanel display;
	public JLabel punishment;
	public JLabel rollResult;
	public JButton btnRoll;
	public JLabel player;
	Control c;
	private JTextField playerName;
	public List<JLabel> players;
	
	/**
	 * Create the frame.
	 */
	public GameFrame(Control cont) {
		c = cont;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 542);
		contentPane = new JPanel(new CardLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		menu = new JPanel();
		menu.setLayout(null);
		playerName = new JTextField();
		playerName.setBounds(275, 80, 150, 25);
		menu.add(playerName);
		players = new ArrayList<JLabel>();
		
		JButton btnBulba = new JButton("Bulbasaur");
		btnBulba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(playerName.getText().length()>0){
					c.addPlayer(playerName.getText(),0);
					JLabel l = new JLabel(playerName.getText());
					l.setBounds(275, 230+(30*(players.size())), 150, 25);
					playerName.setText("");
					players.add(l);
					menu.add(l);
					menu.revalidate();
					menu.repaint();
				}
			}
		});
		btnBulba.setBounds(100, 125, 150, 100);
		menu.add(btnBulba);
		
		JButton btnCharmander = new JButton("Charmander");
		btnCharmander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playerName.getText().length()>0){
					c.addPlayer(playerName.getText(),1);
					JLabel l = new JLabel(playerName.getText());
					l.setBounds(275, 230+(30*(players.size())), 150, 25);
					playerName.setText("");
					menu.add(l);
					players.add(l);
					menu.revalidate();
					menu.repaint();
					
				}
			}
		});
		btnCharmander.setBounds(275, 125, 150, 100);
		menu.add(btnCharmander);
		
		JButton btnSquirtle = new JButton("Squirtle");
		btnSquirtle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playerName.getText().length()>0){
					c.addPlayer(playerName.getText(),2);
					JLabel l = new JLabel(playerName.getText());
					l.setBounds(275, 230+(30*(players.size())), 150, 25);
					playerName.setText("");
					players.add(l);
					menu.add(l);
					menu.revalidate();
					menu.repaint();
				}
			}
		});
		btnSquirtle.setBounds(450, 125, 150, 100);
		menu.add(btnSquirtle);
		
		
			display = new JPanel();
			display.setBounds(0, 0, 700, 500);
			punishment = new JLabel("");
			punishment.setBounds(510, 130, 180, 200);
			punishment.setMaximumSize(getPreferredSize());
			display.setLayout(null);
			rollResult = new JLabel("");
			rollResult.setBounds(595, 75, 100, 25);
			display.add(rollResult);
			display.add(punishment);
			btnRoll = new JButton("Roll");
			btnRoll.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					c.roll();
					repaint();
				}
			});
			btnRoll.setBounds(570, 100, 60, 25);
			display.add(btnRoll);
			player = new JLabel("");
			player.setBounds(570, 25, 100, 25);
			display.add(player);
			b = new Board(cont);
			b.setBounds(0, 0, 500, 500);
			display.add(b);
		
			JPanel victory = new JPanel();
			
			contentPane.add(menu,"MENU");
			
			JButton btnReady = new JButton("Ready");
			btnReady.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(players.size()>1){
						CardLayout cl = (CardLayout)contentPane.getLayout();
						cl.show(contentPane, "GAME");
					}
				}
			});
			btnReady.setBounds(553, 453, 117, 25);
			menu.add(btnReady);
			
			contentPane.add(display, "GAME");
			contentPane.add(victory,"VICTORY");
			this.setVisible(true);	
	}
}
