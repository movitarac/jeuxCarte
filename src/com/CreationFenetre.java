package com;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreationFenetre extends JFrame {
int chance;
Cartes cartes;
	public int getChance() {
	return chance;
}

	public JPanel panneau=new JPanel();
	public JButton boutonDos = new JButton();
	public JButton boutonDos2 = new JButton();
	public JButton boutonDos3 = new JButton();
	public JButton boutonDos4 = new JButton();
	public JButton boutonGagnant = new JButton();
	public JButton boutonPerdant = new JButton();
	public JButton boutonRestart = new JButton();


	public JLabel labelScore=new JLabel();
	public JLabel labelPoint=new JLabel();
	public JLabel label3=new JLabel();
	public JLabel label4=new JLabel();

	public CreationFenetre(Cartes cartes) {
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
		panneau.add(labelScore);

		labelPoint = new JLabel();
		labelPoint.setBounds(50,20,150,20);
		
		panneau.add(labelPoint);

		//button insert image
		ImageIcon imgDos= new ImageIcon ("dos.jpg");
		
		boutonDos.setBounds(10, 250, 150, 200);
		boutonDos.setIcon(imgDos);
		this.panneau.add(boutonDos);


		boutonDos2.setBounds(190, 250, 150, 200);
		boutonDos2.setIcon(imgDos);
		this.panneau.add(boutonDos2);
		
		
		boutonDos3.setBounds(370, 250, 150, 200);
		boutonDos3.setIcon(imgDos);
		this.panneau.add(boutonDos3);
		
		boutonDos4.setBounds(550, 250, 150, 200);
		boutonDos4.setIcon(imgDos);
		this.panneau.add(boutonDos4);
		
		Random randomchoix = new Random();
		chance = randomchoix.nextInt(4);
		System.out.println("chance : "+chance);
		System.out.println(boutonDos.getActionCommand());	
		
		boutonDos.setActionCommand("perdu");
		boutonDos2.setActionCommand("perdu");
		boutonDos3.setActionCommand("perdu");
		boutonDos4.setActionCommand("perdu");
		
		if (chance==0) {
			boutonDos.setActionCommand("gagne");
		} else if (chance==1) {
			boutonDos2.setActionCommand("gagne");
		} else if (chance==2) {
			boutonDos3.setActionCommand("gagne");
		} else if (chance==3) {
			boutonDos4.setActionCommand("gagne");
		}
		this.setResizable(false);
	}




	public JButton getBoutonDos3() {
		return boutonDos3;
	}

	public void setBoutonDos3(JButton boutonDos3) {
		this.boutonDos3 = boutonDos3;
	}

	public JButton getBoutonDos4() {
		return boutonDos4;
	}

	public void setBoutonDos4(JButton boutonDos4) {
		this.boutonDos4 = boutonDos4;
	}

	public JPanel getPanneau() {
		return panneau;
	}

	public void setPanneau(JPanel panneau) {
		this.panneau = panneau;
	}

	public JButton getBoutonDos() {
		return boutonDos;
	}

	public void setBoutonDos(JButton boutonDos) {
		this.boutonDos = boutonDos;
	}

	public JButton getBoutonDos2() {
		return boutonDos2;
	}

	public void setBoutonDos2(JButton boutonDos2) {
		this.boutonDos2 = boutonDos2;
	}


	public JButton getBoutonGagnant() {
		return boutonGagnant;
	}

	public void setBoutonGagnant(JButton boutonGagnant) {
		this.boutonGagnant = boutonGagnant;
	}

	public JButton getBoutonPerdant() {
		return boutonPerdant;
	}

	public void setBoutonPerdant(JButton boutonPerdant) {
		this.boutonPerdant = boutonPerdant;
	}

	public JButton getBoutonRestart() {
		return boutonRestart;
	}

	public void setBoutonRestart(JButton boutonRestart) {
		this.boutonRestart = boutonRestart;
	}

	public JLabel getLabelScore() {
		return labelScore;
	}

	public void setLabelScore(JLabel labelScore) {
		this.labelScore = labelScore;
	}

	public JLabel getLabelPoint() {
		return labelPoint;
	}

	public void setLabelPoint(JLabel labelPoint) {
		this.labelPoint = labelPoint;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public void setLabel3(JLabel label3) {
		this.label3 = label3;
	}

	public JLabel getLabel4() {
		return label4;
	}

	public void setLabel4(JLabel label4) {
		this.label4 = label4;
	}
}
