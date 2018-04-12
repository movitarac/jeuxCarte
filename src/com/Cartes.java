package com;

import java.util.Random;

public class Cartes {
	
	int score=0;
	
	
	/*public int calculerScore () {
		Random random=new Random();
		int chance = random.nextInt(4);
		score = 0;
		
		if (chance==0) {
			score+=5;
			System.out.println("GAGNE");
		}
		else {
			score -= 1;
			System.out.println("PERDU");
		}
		
		return score;
	
	}	*/
	
	


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

}
