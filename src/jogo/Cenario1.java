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
	private Inimigo[] inimigo;

	public Cenario1(Window window) {
		
		janela = window;
		cena= new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));
		jogador = new Player(540, 260);
		teclado = janela.getKeyboard();
		inimigo = new Inimigo[10];
		run();
	}	
	
	private void run() {
		for (int i = 0; i < inimigo.length; i++) {
			inimigo[i] = new Inimigo(100 * i, 100 * i);
		}
		
		while(true) {
			jogador.andar(janela, teclado);			
			cena.moveScene(jogador);
			jogador.draw();
			jogador.caminho(cena);
		
			for (int i = 0; i < inimigo.length; i++) {
				inimigo[i].caminho(cena);
				inimigo[i].draw();			
				
				jogador.atirar(janela, cena, teclado, inimigo[i]);
				inimigo[i].rastrear(jogador.x, jogador.y); 
				inimigo[i].morrer();
				inimigo[i].atacar(jogador);
				inimigo[i].pontos(janela);
			}       
                        

			
			
			jogador.energia(janela);
			janela.update();
		}
		
	}
	
}