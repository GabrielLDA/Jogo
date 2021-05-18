package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

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
	private Inimigo inimigo1;
	private Inimigo inimigo2;
	private Inimigo inimigo3;
	private Inimigo inimigo4;
	private Inimigo inimigo5;
	private Inimigo inimigo6;
	private Inimigo inimigo7;
	private Inimigo inimigo8;
	private Inimigo inimigo9;
	private Inimigo inimigo10;
	
	public Cenario1(Window window) {
		
		janela = window;
		cena= new Scene();
		cena.loadFromFile(URL.scenario("Cenario1.scn"));
		jogador = new Player(40, 260);
		teclado = janela.getKeyboard();
		inimigo = new Inimigo(85, 60);
		inimigo1 = new Inimigo(135, 60);
		inimigo2 = new Inimigo(360, 525);
		inimigo3 = new Inimigo(360, 490);
		inimigo4 = new Inimigo(645, 525);
		inimigo5 = new Inimigo(690, 490);
		inimigo6 = new Inimigo(645, 450);
		inimigo7 = new Inimigo(645, 60);
		inimigo8 = new Inimigo(710, 60);
		inimigo9 = new Inimigo(680, 210);
		inimigo10 = new Inimigo(660, 280);
		
		
		run();
	}	
	
	private void run() {
		while(true) {
	//--------- O que está comentado é pra implementar assim que arrumar o código das tiles----
			cena.draw();
			jogador.draw();
			jogador.andar(janela, teclado);
			inimigo.draw();
			inimigo1.draw();
			inimigo2.draw();
			inimigo3.draw();
		    inimigo4.draw();
			inimigo5.draw();
			inimigo6.draw();
			inimigo7.draw();
			inimigo8.draw();
			inimigo9.draw();
			inimigo10.draw();
			
			inimigo.rastrear(jogador.x, jogador.y); 
			inimigo1.rastrear(jogador.x, jogador.y); 
			inimigo2.rastrear(jogador.x, jogador.y); 
			inimigo3.rastrear(jogador.x, jogador.y); 
			inimigo4.rastrear(jogador.x, jogador.y); 
			inimigo5.rastrear(jogador.x, jogador.y); 
			inimigo6.rastrear(jogador.x, jogador.y); 
			inimigo7.rastrear(jogador.x, jogador.y); 
			inimigo8.rastrear(jogador.x, jogador.y); 
			inimigo9.rastrear(jogador.x, jogador.y); 
			inimigo10.rastrear(jogador.x, jogador.y); 
			
			
			jogador.atirar(janela, cena, teclado);
			//jogador.caminho(cena);
			//cena.moveScene(jogador);
			//inimigo.caminho(cena);
			/*List listaInimigos = new ArrayList(); --lista para armazenar objetos de inimigos
			-----Temporizador para crias inimigos em intervalos
			int delay = 1000;   // tempo de espera antes da 1ª execução da tarefa.
			int interval = 20000;  // intervalo no qual a tarefa será executada.
			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {
			  public void run() {
				  Random random = new Random();---GERAR NUMEROS ALEATORIOS PARA INDICE DO PERSONAGEM
				  int indice = random. nextInt(600);//Número aleatório de 0 à 100.
				  int indice1 = random. nextInt(600);
				  listaInimigos.add(new Inimigo(indice, indice1));
				  inimigo.draw();
				  inimigo.rastrear(jogador.x, jogador.y); 
				  
			      
			  }
			}, delay, interval);
			
		*/
			//jogador.x += cena.getXOffset();
			//jogador.y += cena.getYOffset();		
			//inimigo.x += cena.getXOffset();
			//inimigo.y += cena.getYOffset();		
			
			
			
			
			janela.update(); //aula 6, 7:18minutos
		}
		
	}
	
}