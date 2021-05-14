package jogo;

public class rascunho {
	
	//----------------CLASSE PARA DEIXAR OS CÓDIGOS DE INIMIGO E ATOR PARA SEREM IMPLMENTADOS
	/*package jogo;

	import java.awt.Point;
	import java.util.Vector;

	import jplay.GameObject;
	import jplay.Scene;
	import jplay.Sprite;
	import jplay.TileInfo;

	public class Ator extends Sprite{

		

		protected double   velocidade = 1;
		protected int      direcao    = 3;
		protected boolean  andando    = false;
		
		public Ator(String fileName, int numFrames) {
			super(fileName, numFrames);
			
		}
		
		
		Controle control = new Controle();
		
		public void caminho(Scene cena) {
			Point min = new Point((int)this.x, (int)this.y);
			Point max = new Point((int)this.x + this.width,(int)this.y + this.height);
			
			Vector<?>tiles = cena.getTilesFromPosition(min, max);
			
			for (int i = 0; i < tiles.size(); i++) {
				TileInfo tile = (TileInfo)tiles.elementAt(i);
				
				if(control.colisao(this, tile) == true) {
					if(colisaoVert(this, tile)) {
						if(tile.y + tile.height - 3 < this.y) {
							this.y = tile.y + this.height;
						}
						else if(tile.y > this.y + this.height - 3) {
							this.y = tile.y - tile.height;
					    }
					}
				
					if (colisaoHoriz(this, tile)) {
						if(tile.x > this.x + this.width - 3) {
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
			if(obj2.x + obj2.width <= obj.x)
				return false;
			if(obj.x + obj.width <= obj2.x )
				return false;
			return true;
		}
		
		private boolean colisaoHoriz(GameObject obj, GameObject obj2) {
			if(obj2.y + obj2.height <= obj.y)
				return false;
			if(obj.y + obj.height <= obj2.y)
				return false;
			return true;
			
		}
		

	}
*/
	/*package jogo;

import jplay.URL;

public class Inimigo extends Ator{

	public Inimigo(int x, int y) {
		super(URL.sprite(""), 10);
		this.x = x;
		this.y = y;
		this.setTotalDuration(2000);
		this.velocidade = 0.3;
	}
	
	public void rastrear(double x, double y) {
		
		if(this.x > x && this.y <= y + 50 && this.y >= y - 50) {
			moveTo(x, y, velocidade);
			if(direcao != 1) {
				setSequence(5, 8);
				direcao = 1;
			}andando = true;
			
		}else if(this.x < x && this.y <= y + 50 && this.y >= y -50) {
			moveTo(x, y, velocidade);
			if(direcao != 2) {
				setSequence(9, 12);
				direcao = 2;
			}andando = true;
			
		}else if(this.y > y) {
			moveTo(x, y, velocidade);
			if(direcao != 4) {
				setSequence(13, 16);
				direcao = 4;
			}andando = true;
		
		}else if(this.y < y) {
			moveTo(x, y, velocidade);
			if(direcao != 5) {
				setSequence(1, 4);
				direcao = 5;
			}andando = true;
		}
		if(andando) {
			update();
			andando = false;
		}
	}
	
}
*/
	
	/*package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 {

	private Window janela;
	private Scene cena;
	private Player jogador;
	private Keyboard teclado;
	private Inimigo inimigo;
	
	public Cenario1(Window window) {
		
		janela = window;
		cena= new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));
		jogador = new Player(620, 340);
		teclado = janela.getKeyboard();
		inimigo = new Inimigo(300, 300);//colocar de acordo com a tela
		run();
	}	
	
	private void run() {
		while(true) {
			
			jogador.andar(janela, teclado);
			jogador.caminho(cena);
			inimigo.caminho(cena);
			inimigo.rastrear(jogador.x, jogador.y);
			cena.moveScene(jogador);
			
			jogador.x += cena.getXOffset();
			jogador.y += cena.getYOffset();		
			inimigo.x += cena.getXOffset();
			inimigo.y += cena.getYOffset();		
			
			jogador.draw();	
			inimigo.draw();
			janela.update(); //aula 6, 7:18minutos
		}
		
	}
	
}*/
	
}
