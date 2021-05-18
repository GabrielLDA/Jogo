package jogo;

import jplay.Sprite;
import jplay.URL;

public class Inimigo extends Sprite{

	protected double   velocidade = 0.8;
	protected int      direcao    = 3;
	protected boolean  andando    = false;
	
	public Inimigo(int x, int y) {
		super(URL.sprite("inimigo.png"), 12);
			this.x = x;
			this.y = y;
			this.setTotalDuration(2000);
			this.velocidade = 0.5;
	}
	
	public void rastrear(double x, double y) {
		
		if(this.x > x && this.y <= y + 50 && this.y >= y - 50) {
			moveTo(x, y, velocidade);
			if(direcao != 1) {
				setSequence(4, 8);
				direcao = 1;
			}andando = true;
			
		}else if(this.x < x && this.y <= y + 50 && this.y >= y -50) {
			moveTo(x, y, velocidade);
			if(direcao != 2) {
				setSequence(7, 12);
				direcao = 2;
			}andando = true;
			
		}else if(this.y > y) {
			moveTo(x, y, velocidade);
			if(direcao != 4) {
				setSequence(0, 4);
				direcao = 4;
			}andando = true;
		
		}else if(this.y < y) {
			moveTo(x, y, velocidade);
			if(direcao != 5) {
				setSequence(6, 9);
				direcao = 5;
			}andando = true;
		}
		if(andando) {
			update();
			andando = false;
		}
	}
	
	
}
