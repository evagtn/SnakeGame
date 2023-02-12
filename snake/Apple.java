package game;

import java.util.concurrent.ThreadLocalRandom;

public class Apple {

	int x;
	int y;
	
	public Apple() {
		this.x = ThreadLocalRandom.current().nextInt(0,24);
		this.y = ThreadLocalRandom.current().nextInt(0, 24);
	}
	
	public void reset() {
		this.x = ThreadLocalRandom.current().nextInt(0,24);
		this.y = ThreadLocalRandom.current().nextInt(0, 24);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
