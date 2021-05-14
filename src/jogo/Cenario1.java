package jogo;

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
		jogador = new Player(500, 350);
		teclado = janela.getKeyboard();
		inimigo = new Inimigo(300, 300);//colocar de acordo com a tela
		run();
	}	
	
	private void run() {
		while(true) {
	//--------- O que está comentado é pra implementar assim que arrumar o código das tiles----
			cena.draw();
			jogador.draw();
			jogador.andar(janela, teclado);
			inimigo.draw();
			//jogador.caminho(cena);
			//cena.moveScene(jogador);
			//inimigo.caminho(cena);
			inimigo.rastrear(jogador.x, jogador.y);
			
			
			//jogador.x += cena.getXOffset();
			//jogador.y += cena.getYOffset();		
			//inimigo.x += cena.getXOffset();
			//inimigo.y += cena.getYOffset();		
			
			
			
			
			janela.update(); //aula 6, 7:18minutos
		}
		
	}
	
}