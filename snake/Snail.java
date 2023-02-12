package game;

import java.util.concurrent.ThreadLocalRandom;

public class Snail {

	int x;
	int y;
	int direction;

	public Snail() {
		this.x = ThreadLocalRandom.current().nextInt(0, 30);
		this.y = ThreadLocalRandom.current().nextInt(0, 30);
		this.direction = ThreadLocalRandom.current().nextInt(1, 5);

	}

	public void reset() {
		this.x = ThreadLocalRandom.current().nextInt(0, 30);
		this.y = ThreadLocalRandom.current().nextInt(0, 30);

	}

	public int resetDirection() {
		this.direction = ThreadLocalRandom.current().nextInt(0, 30);
		return direction;
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

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
