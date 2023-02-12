package lab;

import Gui;
import timer.GameClock;

public class SnakeGame {

	public static void main(String[] args) {

		Gui g = new Gui();
		GameClock gt = new GameClock();

		g.create();
		gt.start();

	}

}
