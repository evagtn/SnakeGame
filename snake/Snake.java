package game;

import java.awt.Point;
import java.util.ArrayList;

import gui.Gui;

public class Snake {

	public static int score = 0;
	public static int bestScore = 0;

	public static boolean waitToMove = false;

	public static Head head = new Head(7, 7);

	public static ArrayList<Tail> tails = new ArrayList<>();

	public static Apple apple = new Apple();

	public static Snail snail1 = new Snail();
	public static Snail snail2 = new Snail();
	public static Snail snail3 = new Snail();

	public static GhostSnake ghostSnake1 = new GhostSnake();
	public static GhostSnake ghostSnake2 = new GhostSnake();
	public static GhostSnake ghostSnake3 = new GhostSnake();

	public static Portal portal = new Portal();

	public static Pilz pilz = new Pilz();

	public static void moveGhostSnail() {
		if (ghostSnake1.getDirection() == 1) {
			ghostSnake1.setX(ghostSnake1.getX() + 1);
		}

		if (ghostSnake1.getDirection() == 2) {
			ghostSnake1.setX(ghostSnake1.getX() - 1);
		}

		if (ghostSnake2.getDirection() == 1) {
			ghostSnake2.setX(ghostSnake2.getX() + 1);
		}

		if (ghostSnake2.getDirection() == 2) {
			ghostSnake2.setX(ghostSnake2.getX() - 1);
		}

		if (ghostSnake3.getDirection() == 1) {
			ghostSnake3.setX(ghostSnake3.getX() + 1);
		}

		if (ghostSnake3.getDirection() == 2) {
			ghostSnake3.setX(ghostSnake3.getX() - 1);
		}

	}

	public static void moveSnail() {
		if (snail1.getDirection() == 1) {
			snail1.setX(snail1.getX() + 1);
			;
		}
		if (snail1.getDirection() == 2) {
			snail1.setY(snail1.getY() - 1);
			;
		}
		if (snail1.getDirection() == 3) {
			snail1.setX(snail1.getX() - 1);
			;
		}
		if (snail1.getDirection() == 4) {
			snail1.setY(snail1.getY() + 1);
			;
		}

		if (snail2.getDirection() == 1) {
			snail2.setX(snail2.getX() + 1);
			;
		}
		if (snail2.getDirection() == 2) {
			snail2.setY(snail2.getY() - 1);
			;
		}
		if (snail2.getDirection() == 3) {
			snail2.setX(snail2.getX() - 1);
			;
		}
		if (snail2.getDirection() == 4) {
			snail2.setY(snail2.getY() + 1);
			;
		}

		if (snail3.getDirection() == 1) {
			snail3.setX(snail3.getX() + 1);
			;
		}
		if (snail3.getDirection() == 2) {
			snail3.setY(snail3.getY() - 1);
			;
		}
		if (snail3.getDirection() == 3) {
			snail3.setX(snail3.getX() - 1);
			;
		}
		if (snail3.getDirection() == 4) {
			snail3.setY(snail3.getY() + 1);
			;
		}
	}

	public static void addTail() {

		if (tails.size() < 1) {
			tails.add(new Tail(head.getX(), head.getY()));
		} else {
			tails.add(new Tail(tails.get(tails.size() - 1).x, tails.get(tails.size() - 1).y));
		}
	}

	public static void move() {
		// tails bewegen
		if (tails.size() >= 2) {
			for (int i = tails.size() - 1; i >= 1; i--) {
				if (tails.get(i).isWait()) {
					tails.get(i).setWait(false);
				} else {
					tails.get(i).setX(tails.get(i - 1).getX());
					tails.get(i).setY(tails.get(i - 1).getY());
				}
			}
		}

		// ersten tail zum head bewegen
		if (tails.size() >= 1) {
			if (tails.get(0).isWait()) {
				tails.get(0).setWait(false);
			} else {
				tails.get(0).setX(head.getX());
				tails.get(0).setY(head.getY());
			}
		}

		// head bewegen
		switch (head.getDir()) {
		case RIGHT:
			head.setX(head.getX() + 1);
			break;
		case UP:
			head.setY(head.getY() - 1);
			break;
		case LEFT:
			head.setX(head.getX() - 1);
			break;
		case DOWN:
			head.setY(head.getY() + 1);
			break;

		}

	}

	// positionen zu den koordinaten
	public static Point ptc(int x, int y) {
		Point p = new Point(0, 0);

		p.x = x * 24;
		p.y = y * 24 + Gui.yoff;

		return p;
	}

}
