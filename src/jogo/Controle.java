package jogo;


import jplay.GameObject;
import jplay.TileInfo;

public class Controle {

		public boolean colisao(GameObject obj, TileInfo tile) {
			if((tile.id >= 7) && obj.collided(tile)){ //não é 7 tem que ver o cenario dps
				return true;
			}
			return false; 	
		}
		
	
}
