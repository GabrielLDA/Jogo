package jogo;

import java.util.LinkedList;

import jplay.Scene;
import jplay.Sound;
import jplay.URL;

public class ControleTiros {
	public static int pontos = 0; 
	LinkedList<Tiro> tiros = new LinkedList<>(); 
	
	public void adicionaTiro(double x, double y, int caminho, Scene cena) {
		
		Tiro tiro = new Tiro(x, y, caminho);
		tiros.addFirst(tiro);
		cena.addOverlay(tiro);
		somDisparo();
	
	}
	public void run(Inimigo inimigo){
		for (int i = 0; i < tiros.size(); i++) {
			Tiro tiro = tiros.removeFirst();
			tiro.move();
			tiros.addLast(tiro);
			if(tiro.collided(inimigo)) {
				tiro.y = 10_000;
				tiro.x = 10_000;
				inimigo.energia -= 250;
				if(inimigo.energia == 0) {
					ControleTiros.pontos = 1 + ControleTiros.pontos;
					
				}
				
			}
			
		}
	}
	
	private void somDisparo() {
		new Sound(URL.audio("somtiro.wav")).play();
	}
	
}
