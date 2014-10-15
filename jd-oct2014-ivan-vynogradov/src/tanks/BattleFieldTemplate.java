/*
 * Copyright (c) 2014 kademika.com
 */
package tanks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 10;
	int tankDirection = 1;
	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {
//		int i = 0;
//		int direction = 0;
//		while(true){
//			if (direction == 0 && i < 8){
//				tankX += 64;
//				i++;
//			}else {
//				tankX -= 64;
//				i--;
//			}
//			if(i == 8){
//				direction = 1;
//			} else if (i == 0) {
//				direction = 0;
//			}
//			repaint();
//			Thread.sleep(speed);
//		}
		//moveRandom();
		moveToQuadrant(1, 2);
		Thread.sleep(2000);
		moveToQuadrant(5, 8);
		Thread.sleep(2000);
		moveToQuadrant(7, 7);
		Thread.sleep(2000);
		moveToQuadrant(2, 1);
	}
	
	void moveRandom() throws Exception {
		Random r = new Random();
		int i;
		while(true){
			i = r.nextInt(5);
			if (i > 0){
				move(i);
			}
		}
	}
	
	void moveToQuadrant(int v, int h) throws Exception {
		String coordinates = getQuadrant(v, h);
		int separator = coordinates.indexOf("_");
		int x = Integer.parseInt(coordinates.substring(0, separator));
		int y = Integer.parseInt(coordinates.substring(separator+1));
		
		if(tankX < x){
			while(tankX != x){
				move(4);
			}
		} else {
			while(tankX != x){
				move(3);
			}
		}
		
		if(tankY < y){
			while(tankY != y){
				move(2);
			}
		}else {
			while (tankY != y){
				move(1);
			}
		}
	}	
	
	
	void move(int direction) throws Exception {
		int step = 1;
		int covered = 0;
		if((direction == 1 && tankY == 0) || (direction == 2 && tankY >= 512)
				|| (direction == 3 && tankX == 0) || (direction == 4 && tankX >= 512)){
			System.out.println("wrong move direction" + direction + " tankX: " + tankX + "tankY " + tankY);
			return;
		}
		
		turn(direction);
		
		while(covered < 64) {
			if(direction == 1){
				tankY -= step;
				System.out.println("move up " + direction + " tankX: " + tankX + " tankY " + tankY );
			} else if (direction == 2) {
				tankY += step;
				System.out.println("move down " + direction + " tankX: " + tankX + " tankY " + tankY );
			} else if (direction == 3) {
				tankX -= step;
				System.out.println("move left " + direction + " tankX: " + tankX + " tankY " + tankY);
			} else {
				tankX += step;
				System.out.println("move right " + direction + " tankX: " + tankX + " tankY " + tankY);
			}
				covered +=step;
				repaint();
				Thread.sleep(speed);
			}
		
	}

	static String getQuadrant(int v, int h){		
		return (v - 1)*64 + "_" + (h - 1)*64; 
	}
	
	void turn(int direction){
		tankDirection = direction;
	}
	
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
	}

	public BattleFieldTemplate() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}

}
