package lab;

import game.Snake;

public class Collision {

	public static boolean collideSelf() {
		for (int i = 0; i < Snake.tails.size(); i++) {
			if (Snake.head.getX() == Snake.tails.get(i).getX() && Snake.head.getY() == Snake.tails.get(i).getY()
					&& !Snake.tails.get(i).isWait()) {
				return true;
			}
		}
		return false;
	}

	public static boolean collideWall() {

		return (Snake.head.getX() < 0 || Snake.head.getY() >= 30 || Snake.head.getY() < 0 || Snake.head.getX() >= 30);
	}

	public static void collideApple() {
		if (Snake.head.getX() == Snake.apple.getX() && Snake.head.getY() == Snake.apple.getY()) {
			Snake.apple.reset();
			Snake.addTail();

			// score
			Snake.score += 1;

		}

	}

	public static boolean collidePilz() {
		if ((Snake.head.getX() == Snake.pilz.getX() && Snake.head.getY() == Snake.pilz.getY())
				|| (Snake.head.getX() == Snake.pilz.getX2() && Snake.head.getY() == Snake.pilz.getY2())) {
			return true;
		} else
			return false;
	}

	public static boolean collideGhostSnake() {
		if ((Snake.head.getX() == Snake.ghostSnake1.getX() && Snake.head.getY() == Snake.ghostSnake1.getY())
				|| (Snake.head.getX() == Snake.ghostSnake2.getX() && Snake.head.getY() == Snake.ghostSnake2.getY())
				|| (Snake.head.getX() == Snake.ghostSnake3.getX() && Snake.head.getY() == Snake.ghostSnake3.getY())) {
			return true;
		} else
			return false;

	}

	public static void collideSnail() {
		if (Snake.head.getX() == Snake.snail1.getX() && Snake.head.getY() == Snake.snail1.getY()) {
			Snake.snail1.reset();

			Snake.addTail();

			// score
			Snake.score += 1;
		}

		if (Snake.head.getX() == Snake.snail2.getX() && Snake.head.getY() == Snake.snail2.getY()) {
			Snake.snail2.reset();

			Snake.addTail();

			// score
			Snake.score += 1;
		}

		if (Snake.head.getX() == Snake.snail3.getX() && Snake.head.getY() == Snake.snail3.getY()) {
			Snake.snail3.reset();

			Snake.addTail();

			// score
			Snake.score += 1;
		}
	}

	public static void ghostSnakeCollideWall() {
		if (Snake.ghostSnake1.getX() == 0) {
			Snake.ghostSnake1.setDirection(1);
		}
		if (Snake.ghostSnake1.getX() == 29) {
			Snake.ghostSnake1.setDirection(2);
		}

		if (Snake.ghostSnake2.getX() == 0) {
			Snake.ghostSnake2.setDirection(1);
		}
		if (Snake.ghostSnake2.getX() == 29) {
			Snake.ghostSnake2.setDirection(2);
		}

		if (Snake.ghostSnake3.getX() == 0) {
			Snake.ghostSnake3.setDirection(1);
		}
		if (Snake.ghostSnake3.getX() == 29) {
			Snake.ghostSnake3.setDirection(2);
		}
	}

	public static void snailCollideWall() {
		if (Snake.snail1.getX() == 0) {
			Snake.snail1.setDirection(1);
		}
		if (Snake.snail1.getX() == 29) {
			Snake.snail1.setDirection(3);
		}
		if (Snake.snail1.getY() == 0) {
			Snake.snail1.setDirection(4);
		}
		if (Snake.snail1.getY() == 29) {
			Snake.snail1.setDirection(2);
		}

		if (Snake.snail2.getX() == 0) {
			Snake.snail2.setDirection(1);
		}
		if (Snake.snail2.getX() == 29) {
			Snake.snail2.setDirection(3);
		}
		if (Snake.snail2.getY() == 0) {
			Snake.snail2.setDirection(4);
		}
		if (Snake.snail2.getY() == 29) {
			Snake.snail2.setDirection(2);
		}

		if (Snake.snail3.getX() == 0) {
			Snake.snail3.setDirection(1);
		}
		if (Snake.snail3.getX() == 29) {
			Snake.snail3.setDirection(3);
		}
		if (Snake.snail3.getY() == 0) {
			Snake.snail3.setDirection(4);
		}
		if (Snake.snail3.getY() == 29) {
			Snake.snail3.setDirection(2);
		}
	}

	public static void collidePortal() {
		if (Snake.head.getX() == Snake.portal.getX() && Snake.head.getY() == Snake.portal.getY()) {
			Snake.head.setX(Snake.portal.getX2());
			Snake.head.setY(Snake.portal.getY2());
		} else if (Snake.head.getX() == Snake.portal.getX2() && Snake.head.getY() == Snake.portal.getY2()) {
			Snake.head.setX(Snake.portal.getX());
			Snake.head.setY(Snake.portal.getY());
		}

	}

}
