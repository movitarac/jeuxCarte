package com;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class FenetreRestart extends JFrame implements ActionListener {
		Cartes cartes;
		int chance;
		Font font = new Font("Arial",Font.BOLD,24);
		public JPanel panneau=new JPanel();
		public JButton boutonRestart = new JButton();


		public JLabel labelScore=new JLabel();
		public JLabel labelPoint=new JLabel();
		public JLabel labelImage=new JLabel();
		public JLabel labelImage1=new JLabel();
		public JLabel labelImage2=new JLabel();
		public JLabel labelImage3=new JLabel();
		
		public FenetreRestart(Cartes cartes,int chance) {
			this.cartes = cartes;
			this.chance=chance;
			
			this.setTitle("Jeux de Carte");
			this.setSize(725, 725);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panneau = new JPanel();
			panneau.setLayout(null);
			this.setContentPane(panneau);
			

			
		
			labelScore = new JLabel();
			labelScore.setBounds(5,20,150,20);
			labelScore.setText("Score: ");
			labelScore.setFont(font);
			panneau.add(labelScore);

			labelPoint = new JLabel();
			labelPoint.setBounds(100,20,150,20);
			labelPoint.setFont(font);
			labelPoint.setText(" "+ cartes.getScore());
			panneau.add(labelPoint);
			//label insert image
			ImageIcon imgjoker= new ImageIcon ("joker_1.jpg");
			ImageIcon imgAutre = new ImageIcon ("2copy.jpg");
			
			labelImage.setBounds(10, 250, 150, 200);
			
			this.panneau.add(labelImage);

			labelImage1.setBounds(190, 250, 150, 200);
			
			this.panneau.add(labelImage1);
			
			
			labelImage2.setBounds(370, 250, 150, 200);
			
			this.panneau.add(labelImage2);
			
			
			labelImage3.setBounds(550, 250, 150, 200);
		
			this.panneau.add(labelImage3);
			
			if (chance==0) {
				
				labelImage.setIcon(imgjoker);
				labelImage1.setIcon(imgAutre);
				labelImage2.setIcon(imgAutre);
				labelImage3.setIcon(imgAutre);
			}
			if (chance==1) {
				labelImage1.setIcon(imgjoker);
				labelImage2.setIcon(imgAutre);
				labelImage3.setIcon(imgAutre);
				labelImage.setIcon(imgAutre);
			}
			if (chance==2) {
				labelImage2.setIcon(imgjoker);
				labelImage1.setIcon(imgAutre);
				labelImage3.setIcon(imgAutre);
				labelImage.setIcon(imgAutre);
			}
			if (chance==3) {
				labelImage3.setIcon(imgjoker);
				labelImage2.setIcon(imgAutre);
				labelImage.setIcon(imgAutre);
				labelImage1.setIcon(imgAutre);
			}
				
				
				
			
			
			boutonRestart.setText("Restart");
			boutonRestart.setBounds(375, 500, 150, 20);
			boutonRestart.setActionCommand("restart");
			this.panneau.add(boutonRestart);
			
			
			getBoutonRestart().addActionListener(this);
			

			this.panneau.repaint();
			
		}


		public JButton getBoutonRestart() {
			return boutonRestart;
		}


		public void setBoutonRestart(JButton boutonRestart) {
			this.boutonRestart = boutonRestart;
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getActionCommand());
			if (e.getActionCommand().equals("restart")) {
				//CreationFenetre fenetreJeux = new CreationFenetre();

				GestionnaireFenetre jeux = new GestionnaireFenetre(cartes);
				System.out.println("youhou");
			}
			
			dispose();
		}

	
}
