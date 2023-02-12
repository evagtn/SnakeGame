package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.Snake;
import timer.GameTimer;

public class Draw extends JLabel {

	Point p;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // konstruktor aufrufen
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

		// Hintergrund
		g.setColor(new Color(172, 216, 69));
		g.fillRect(0, 24, Gui.width, Gui.height);

		for (int i = 0; i < 720; i += 48) {
			for (int j = 24; j < 720; j += 48) {
				if (i % 24 == 0 && j % 24 == 0) {
					g.setColor(new Color(165, 209, 62));
					g.fillRect(i, j, 24, 24);
				}
			}
		}
		for (int i = 24; i < 720; i += 48) {
			for (int j = 48; j < 720; j += 48) {
				if (i % 24 == 0 && j % 24 == 0) {
					g.fillRect(i, j, 24, 24);
				}
			}
		}

		// snake tails
		g.setColor(new Color(51, 204, 51));
		for (int i = 0; i < Snake.tails.size(); i++) {
			p = Snake.ptc(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
			g.fillRect(p.x, p.y, 24, 24);
		}
		// snake head
		Image snakeHead;
		ImageIcon iconSnakeHead = new ImageIcon("hdm/ImageIcon/snakeHeadImage.JPG");
		snakeHead = iconSnakeHead.getImage();
		// g.setColor(new Color(0, 153, 0));
		p = Snake.ptc(Snake.head.getX(), Snake.head.getY());
		g.drawImage(snakeHead, p.x, p.y, 24, 24, labelFor);
		// g.fillRect(p.x, p.y, 24, 24);

		// apple

		Image apple;
		ImageIcon iconApple = new ImageIcon("hdm/ImageIcon/SnakeApfelBild.jpg");
		apple = iconApple.getImage();

		p = Snake.ptc(Snake.apple.getX(), Snake.apple.getY());
		g.drawImage(apple, p.x, p.y, 24, 24, labelFor);

		// snail

		Image snail;
		ImageIcon iconSnail = new ImageIcon("hdm/ImageIcon/snailImage.jpg");
		snail = iconSnail.getImage();

		Image snailRight;
		ImageIcon iconSnailRight = new ImageIcon("hdm/ImageIcon/snailImageRight.jpg");
		snailRight = iconSnailRight.getImage();

		p = Snake.ptc(Snake.snail1.getX(), Snake.snail1.getY());
		if (Snake.snail1.getDirection() == 1) {
			g.drawImage(snailRight, p.x, p.y, 24, 24, labelFor);
		} else {
			g.drawImage(snail, p.x, p.y, 24, 24, labelFor);
		}

		p = Snake.ptc(Snake.snail2.getX(), Snake.snail2.getY());
		if (Snake.snail2.getDirection() == 1) {
			g.drawImage(snailRight, p.x, p.y, 24, 24, labelFor);
		} else {
			g.drawImage(snail, p.x, p.y, 24, 24, labelFor);
		}

		p = Snake.ptc(Snake.snail3.getX(), Snake.snail3.getY());
		if (Snake.snail3.getDirection() == 1) {
			g.drawImage(snailRight, p.x, p.y, 24, 24, labelFor);
		} else {
			g.drawImage(snail, p.x, p.y, 24, 24, labelFor);
		}

		// ghostSnake

		Image ghostSnake;
		ImageIcon iconGhostSnake = new ImageIcon("hdm/ImageIcon/ghostSnakeImage.jpg");
		ghostSnake = iconGhostSnake.getImage();

		Image ghostSnakeRight;
		ImageIcon iconGhostSnakeRight = new ImageIcon("hdm/ImageIcon/ghostSnakeImageRight.jpg");
		ghostSnakeRight = iconGhostSnakeRight.getImage();

		p = Snake.ptc(Snake.ghostSnake1.getX(), Snake.ghostSnake1.getY());
		if (Snake.ghostSnake1.getDirection() == 1) {
			g.drawImage(ghostSnakeRight, p.x, p.y, 120, 24, labelFor);
		} else {
			g.drawImage(ghostSnake, p.x, p.y, 120, 24, labelFor);
		}

		p = Snake.ptc(Snake.ghostSnake2.getX(), Snake.ghostSnake2.getY());
		if (Snake.ghostSnake2.getDirection() == 1) {
			g.drawImage(ghostSnakeRight, p.x, p.y, 120, 24, labelFor);
		} else {
			g.drawImage(ghostSnake, p.x, p.y, 120, 24, labelFor);
		}

		p = Snake.ptc(Snake.ghostSnake3.getX(), Snake.ghostSnake3.getY());
		if (Snake.ghostSnake3.getDirection() == 1) {
			g.drawImage(ghostSnakeRight, p.x, p.y, 120, 24, labelFor);
		} else {
			g.drawImage(ghostSnake, p.x, p.y, 120, 24, labelFor);

		}

		// portale
		p = Snake.ptc(Snake.portal.getX(), Snake.portal.getY());
		Image portal1;
		ImageIcon iconPortal1 = new ImageIcon("hdm/ImageIcon/portalImage1.png");
		portal1 = iconPortal1.getImage();
		g.drawImage(portal1, p.x, p.y, 24, 24, labelFor);

		p = Snake.ptc(Snake.portal.getX2(), Snake.portal.getY2());
		Image portal2;
		ImageIcon iconPortal2 = new ImageIcon("hdm/ImageIcon/portalImage2.png");
		portal2 = iconPortal2.getImage();
		g.drawImage(portal2, p.x, p.y, 24, 24, labelFor);

		// pilze
		p = Snake.ptc(Snake.pilz.getX(), Snake.pilz.getY());
		Image roterPilz;
		ImageIcon iconRoterPilz = new ImageIcon("hdm/ImageIcon/roterPilz.png");
		roterPilz = iconRoterPilz.getImage();
		g.drawImage(roterPilz, p.x, p.y, 24, 24, labelFor);

		p = Snake.ptc(Snake.pilz.getX2(), Snake.pilz.getY2());
		Image schwarzerPilz;
		ImageIcon iconSchwarzerPilz = new ImageIcon("hdm/ImageIcon/schwarzerPilz.jpg");
		schwarzerPilz = iconSchwarzerPilz.getImage();
		g.drawImage(schwarzerPilz, p.x, p.y, 24, 24, labelFor);

		if (Snake.head.getX() == Snake.pilz.getX() && Snake.head.getY() == Snake.pilz.getY()) {
			for (int i = 0; i < 720; i += 48) {
				for (int j = 24; j < 720; j += 48) {
					if (i % 24 == 0 && j % 24 == 0) {
						g.setColor(new Color(254, 204, 255));
						g.fillRect(i, j, 24, 24);
					}
				}
			}
			for (int i = 24; i < 720; i += 48) {
				for (int j = 48; j < 720; j += 48) {
					if (i % 24 == 0 && j % 24 == 0) {
						g.setColor(new Color(255, 232, 255));
						g.fillRect(i, j, 24, 24);
					}
				}
			}
		}

		// gitter
		g.setColor(Color.GRAY);
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				g.drawRect(i * 24, j * 24 + Gui.yoff, 24, 24);
			}
		}

		// grenze
		g.setColor(Color.BLACK);
		g.drawRect(0, Gui.yoff, 720, 720);
		for (int i = 0; i < 720; i += 24) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(i, 0, 24, 25);
			g.fillRect(i, 24, 24, 25);
		}

		// score
		g.setColor(Color.GRAY);
		g.setFont(new Font("Arial", Font.BOLD, 18));
		g.drawString("0" + Snake.score, 10, 20);
		g.setColor(new Color(250, 0, 0));
		// g.drawString("Highscore : 0" + Snake.bestScore, 570, 20);

		// gameTitle

		Image gameTitle;
		ImageIcon iconGameTitle = new ImageIcon("hdm/ImageIcon/snakeGamaTitleImage.JPG");
		gameTitle = iconGameTitle.getImage();
		g.drawImage(gameTitle, 300, 0, 90, 48, labelFor);

		// gameTimer

		g.setColor(Color.BLACK);
		g.drawString("" + GameTimer.getTime(), 670, 20);

		repaint();

	}

}
