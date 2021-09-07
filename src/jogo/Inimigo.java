package jogo;

import java.awt.Color;
import java.awt.Font;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Inimigo extends Ator{

	protected double   velocidade = 0.8;
	protected int      direcao    = 3;
	protected boolean  andando    = false;
	protected boolean  teste    = false;

	public int energia = 500;
	private double ataque = 1;
	
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
	public void morrer() {
		if(this.energia <= 0) {
			this.velocidade = 0;
			this.ataque = 0;
			this.direcao = 0;
			this.andando = false;
			this.x = 1_000_000;
		}
	}
	
	Font f = new Font("arial", Font.BOLD, 30);
	
	public void atacar(Player jogador) {
		if(this.collided(jogador)) {
			Player.energia -= this.ataque;	
		}
		if(Player.energia <= -0) {
			Window janela = new Window(800, 600);
			GameImage gameOver = new GameImage(URL.sprite("GameOver.jpg"));
			Keyboard teclado = janela.getKeyboard();
			while(true) {
				gameOver.draw();
				janela.drawText("Sua pontuação foi: " + ControleTiros.pontos, 270, 300, Color.WHITE, f);
				janela.update();
				if(teclado.keyDown(Keyboard.ESCAPE_KEY)) {
					System.exit(0);
				}
			}
		}
	}

	public void pontos(Window janela) {
		janela.drawText("Pontos: " + ControleTiros.pontos, 600, 30, Color.red, f);
		
		if(ControleTiros.pontos == 10) {
			Window janela1 = new Window(800, 600);
			GameImage win = new GameImage(URL.sprite("Win.jpg"));
			Keyboard teclado = janela1.getKeyboard();
			while(true) {
				win.draw();
				janela1.drawText("Sua pontuação foi: " + ControleTiros.pontos, 270, 250, Color.black, f);
				janela1.update();
				if(teclado.keyDown(Keyboard.ESCAPE_KEY)) {
					System.exit(0);
				}
			}
		}
		
	} 
	
}
