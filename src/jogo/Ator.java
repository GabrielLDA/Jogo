package jogo;

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