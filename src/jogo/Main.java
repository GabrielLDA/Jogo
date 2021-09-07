package jogo;


import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Main {

	public static void main(String[] args) {

		Window janela = new Window(800, 600);
		GameImage plano = new GameImage(URL.sprite("menu.jpg"));
		GameImage historia = new GameImage(URL.sprite("historia.jpg"));
		Keyboard teclado = janela.getKeyboard();
		plano.draw();
		janela.update();
		
		while(true) {

			if(teclado.keyDown(Keyboard.ENTER_KEY)) {
				historia.draw();
				janela.update();
			}
			if(teclado.keyDown(Keyboard.A_KEY)) {
				new Cenario1(janela);
				
			}
		}
		
		
		
	}

}