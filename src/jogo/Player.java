package jogo;


import java.awt.Point;
import java.util.Vector;

import jplay.GameObject;
import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.TileInfo;
import jplay.URL;
import jplay.Window;

public class Player extends Sprite{

	private double velocidade = 1.3;
	private int direcao = 3;
	private boolean andando = false;
	
	public Player(int x, int y) {
		super(URL.sprite("jogador.png"), 20);
		this.x = x;
		this.y = y;
		this.setTotalDuration(2000);
	}
	
	public void andar(Window janela, Keyboard teclado) {
		
		
		if(teclado.keyDown(Keyboard.LEFT_KEY)) {
			if(this.x > 0) {
				this.x -= velocidade;
			}
			if(direcao != 1) {
				setSequence(4, 8);
				direcao = 1;
			}andando = true;
		}
		else if(teclado.keyDown(Keyboard.RIGHT_KEY)) {
			if(this.x < janela.getWidth() - 60) {
				this.x += velocidade;
			}
			if(direcao != 2) {
				setSequence(8, 12);
				direcao = 2;
			}andando = true;
		}
		if(teclado.keyDown(Keyboard.UP_KEY)) {
			if(this.y > 0) {
				this.y -= velocidade;
			}
			if(direcao != 4) {
				setSequence(12, 16);
				direcao = 4;
			}andando = true;
		}
		if(teclado.keyDown(Keyboard.DOWN_KEY)) {
			if(this.y < janela.getHeight() - 60) {
				this.y += velocidade;
			}
			if(direcao != 5) {
				setSequence(0, 4);
				direcao = 5;
			}andando = true;
		}
		
		if(andando) {
			update();
			andando = false;
		}
	}
	/*Controle controle = new Controle(); 
	
	public void caminho(Scene cena) {
		Point min = new Point((int)this.x, (int)this.y);
		Point max = new Point((int)this.x + this.width, (int)this.y + this.height);
	
		Vector<?>tiles = cena.getTilesFromPosition(min, max);
		for (int i = 0; i < tiles.size(); i++) {
			TileInfo tile = (TileInfo)tiles.elementAt(i);
			
			if(controle.colisao(this, tile) == true) {
				if(colisaoVert(this, tile)) {
					if(tile.y + tile.height - 2 < this.y) {
						this.y = tile.y + tile.height; 
					}
					else if(tile.y > this.y + this.height - 2) {
						this.y = tile.y - this.height;
					}
				}
				if(colisaoHoriz(this, tile)) {
					if(tile.x > this.x + this.width) {
						this.x = tile.x - this.width;
					}
					else {
						this.x = tile.x + tile.width;
					}
				}
				
			}
		}
	}
	
	private boolean colisaoVert(GameObject obj, GameObject obj2) {
		if(obj2.x + obj2.width <= obj.x) {
			return false;
		}if(obj.x + obj.width <= obj2.x) {
			return false;
		}
		return true;
	}
	private boolean colisaoHoriz(GameObject obj, GameObject obj2) {
		if(obj2.y + obj2.height <= obj.y) {
			return false;
		}if(obj.y + obj.height <= obj2.y) {
			return false;
		}
		return true;
	  }*/
	
	

	
}