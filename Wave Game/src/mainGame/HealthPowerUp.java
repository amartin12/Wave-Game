package mainGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class HealthPowerUp extends Pickup {

	private Handler handler;
	private int timer;
	private int sizeX;
	private int sizeY;
	
	public HealthPowerUp(ID id, Handler handler) {
		super((Game.WIDTH - 70)*Math.random(), (Game.HEIGHT - 120)*Math.random(), id);
		this.handler = handler;
		this.timer = 60;
		this.sizeX = 50;
		this.sizeY = 50;
	}

	@Override
	public void tick() {
		
		if(timer > 0) {
			this.updateSize();
			timer --;
		}
		
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.PINK);
		g.drawImage(img, (int) this.x, (int) this.y, 50, 50, null);
		g.fillRect((int) this.x, (int) this.y, 50, 50);
		
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) this.x, (int) this.y, 50, 50);
	}
	
	public void updateSize() {
		this.sizeX--;
		this.sizeY--;

		if (sizeX <= 0) {
			handler.removePickup(this);
		}
	}

}