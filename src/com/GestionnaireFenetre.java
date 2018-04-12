package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GestionnaireFenetre implements ActionListener {
	Cartes cartes;
	CreationFenetre fenetreJeux = new CreationFenetre(cartes);
	
	public GestionnaireFenetre(Cartes cartes) {
		this.cartes = cartes;
		fenetreJeux.getBoutonDos().addActionListener(this);
		fenetreJeux.getBoutonDos2().addActionListener(this);
		fenetreJeux.getBoutonDos3().addActionListener(this);
		fenetreJeux.getBoutonDos4().addActionListener(this);
		fenetreJeux.labelPoint.setText(" "+ cartes.getScore());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub


		
		if(e.getActionCommand().equals("perdu")) {
			
			cartes.setScore(cartes.getScore()-1);
			
		}
		else{
			cartes.setScore(cartes.getScore()+5);
			
		}
		FenetreRestart fenetreRestart = new FenetreRestart(cartes,fenetreJeux.getChance());
		System.out.println(cartes.getScore());
		
		fenetreJeux.dispose();
		
	}

}