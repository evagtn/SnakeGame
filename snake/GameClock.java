package timer;

import game.Snake;
import lab.Collision;

public class GameClock extends Thread {

	public static boolean running = true;

	public void run() {
		while (running) {
			try {
				sleep(200);
				Snake.move();

				Snake.moveSnail();
				Snake.moveGhostSnail();

				Snake.waitToMove = false;
				Collision.collidePortal();
				Collision.collideApple();
				Collision.collideSnail();
				Collision.snailCollideWall();
				Collision.ghostSnakeCollideWall();

				if (Collision.collidePilz()) {
					Snake.pilz.reset();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();

					Snake.score += 3;

				}

				if (Collision.collideGhostSnake()) {
					Snake.tails.clear();
					Snake.head.setX(10);
					Snake.head.setY(10);
					GameTimer.resetTimer();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();

					// score
					Snake.score = 0;
				}

				if (Collision.collideSelf()) {
					Snake.tails.clear();
					GameTimer.resetTimer();
					// score
					Snake.score = 0;
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
				}
				if (Collision.collideWall()) {
					Snake.tails.clear();
					Snake.head.setX(10);
					Snake.head.setY(10);
					GameTimer.resetTimer();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();
					Snake.addTail();

					// score
					Snake.score = 0;
				}
				// Collision.collideSnail();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
