package jogo;

import jplay.Sprite;
import jplay.URL;

public class Jogador extends Sprite {
	
	public Jogador(int x, int y) {
		super(URL.sprite("Jogador.png"),20);
		this.x = x;
		this.y = y;
	}
	
	public void mover() {
		moveX(0.3);
		moveY(0.3);
		
	}

}
