package game;

import java.util.concurrent.ThreadLocalRandom;

public class Pilz {
	int x;
	int y;
	int x2;
	int y2;

	public Pilz() {
		this.x = ThreadLocalRandom.current().nextInt(0, 30);
		this.y = ThreadLocalRandom.current().nextInt(0, 30);
		this.x2 = ThreadLocalRandom.current().nextInt(0, 30);
		this.y2 = ThreadLocalRandom.current().nextInt(0, 30);
	}

	public void reset() {
		this.x = ThreadLocalRandom.current().nextInt(0, 30);
		this.y = ThreadLocalRandom.current().nextInt(0, 30);
		this.x2 = ThreadLocalRandom.current().nextInt(0, 30);
		this.y2 = ThreadLocalRandom.current().nextInt(0, 30);
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

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
}
