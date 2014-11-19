package Lesson5.tanks;

import java.awt.Color; // test
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ActionField extends JPanel {

	private boolean COLORDED_MODE = true;
	private BattleField battleField;
	private Tank deffender;
	private Tank aggressor;
	private Bullet bullet;

	public void runTheGame() throws Exception {

		while(true) {
			aggressor.fire();
		}

	}

	private boolean processInterception() {
		String coordinates = getQuadrant(bullet.getX(), bullet.getY());
		int y = Integer.parseInt(coordinates.split("_")[0]);
		int x = Integer.parseInt(coordinates.split("_")[1]);

		if (y >= 0 && y < 9 && x >= 0 && x < 9) {
			if (!battleField.scanQadrant(y, x).trim().isEmpty()) {
				battleField.updateQadrant(y, x, " ");
				;
				return true;
			}
			
			// check aggressor
//			if (checkInterception(getQuadrant(aggressor.getX(), aggressor.getY()), coordinates)){
//				aggressor.destroy();
//				return true;
//			}
//			
//			// check defender
//			if (checkInterception(getQuadrant(deffender.getX(), deffender.getY()), coordinates)){
//				deffender.destroy();
//				return true;
//			}
		}
		return false;

	}
	
	private boolean checkInterception(String object, String quadrant){
		int oy = Integer.parseInt(object.split("_")[0]);
		int ox = Integer.parseInt(object.split("_")[1]);
		
		int qy = Integer.parseInt(quadrant.split("_")[0]);
		int qx = Integer.parseInt(object.split("_")[1]);
		
		if (oy >= 0 && oy < 9 && ox >= 0 && ox < 9){
			if (oy == qy && ox == qx){
				return true;
			}
		}
		return false;
	}

	static String getQuadrant(int x, int y) {
		return y / 64 + "_" + x / 64;
	}

	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	public void processMove(Tank tank) throws Exception {
		//this.tank = tank;
		Direction direction = tank.getDirection();
		
		int step = 1;
		int covered = 0;
		
		
		int tankX = tank.getX();
		int tankY = tank.getY();
		// check limits x: 0, 513; y: 0, 513
		if ((direction.equals("UP") && tankY == 0) || (direction.equals("DOWN") && tankY >= 512)
				|| (direction.equals("LEFT") && tankX == 0)
				|| (direction.equals("RIGHT") && tankX >= 512)) {
			System.out.println("[illegal move] direction: " + direction
					+ " tankX: " + tankX + ", tankY: " + tankY);
			return;
		}

		tank.turn(direction);

		while (covered < 64) {
			// checkQuadrantIsClean();
			if (tank.getDirection() == Direction.UP) {
				tank.updateY(-step);
				//tankY -= step;
				 System.out.println("[move up] direction: " + tank.getDirection() + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			} else if (tank.getDirection() == Direction.DOWN) {
				tank.updateY(step); 
				//tankY += step;
				System.out.println("[move up] direction: " + tank.getDirection() + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			} else if (tank.getDirection() == Direction.LEFT) {
				tank.updateX(-step);
				//tankX -= step;
				System.out.println("[move up] direction: " + tank.getDirection() + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			} else {
				tank.updateX(step);
				//tankX += step;
				System.out.println("[move up] direction: " + tank.getDirection() + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
			}

			covered += step;

			repaint();
			Thread.sleep(tank.getSpeed());
		}
	}

	public void processTurn(Direction direction) throws Exception {
		// int tankDirection = tank.getDirection(); // temp
		// if (tankDirection != direction) {
		// tankDirection = direction;
		// repaint();
		// System.out.println("Tank changed direction");
		// System.out.println("=======================");
		// }
		repaint();
	}

	public void processFire(Bullet bullet) throws Exception {
		this.bullet = bullet;
		int bulletStep = 1;
			System.out.println("processFire");
		while ((bullet.getX() > -14 && bullet.getX() < 590)	&& (bullet.getY() > -14 && bullet.getY() < 590)) {
			if (bullet.getDirection().equals("UP")) {
				bullet.updateY(-bulletStep);
			} else if (bullet.getDirection().equals("DOWN")) {
				bullet.updateY(bulletStep);
			} else if (bullet.getDirection().equals("LEFT")) {
				bullet.updateX(-bulletStep);
			} else {
				bullet.updateX(bulletStep);
			}

			if (processInterception()) {
				//System.out.println("processInterception");
				bullet.destroy();
			}
			repaint();
			Thread.sleep(bullet.getSpeed());
		}
	}



	public ActionField() throws Exception {
		battleField = new BattleField();
		deffender = new Tank(this, battleField);
		bullet = new Bullet(-100, -100, Direction.NONE);
		String location = battleField.getAggressorLocation();
		aggressor = new Tank(this, battleField, Integer.parseInt(location.split("_")[1]), Integer.parseInt(location.split("_")[1]) , Direction.UP);

		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(battleField.getBF_WIDTH(),
				battleField.getBF_HEIGHT() + 22));
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

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQadrant(j, k).equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}
		// deffender
		g.setColor(new Color(255, 0, 0));
		g.fillRect(deffender.getX(), deffender.getY(), 64, 64);

		g.setColor(new Color(0, 255, 0));
		if (deffender.getDirection() == Direction.UP) {
			g.fillRect(deffender.getX() + 20, deffender.getY(), 24, 34);
		} else if (deffender.getDirection() == Direction.DOWN) {
			g.fillRect(deffender.getX() + 20, deffender.getY() + 30, 24, 34);
		} else if (deffender.getDirection() == Direction.LEFT) {
			g.fillRect(deffender.getX(), deffender.getY() + 20, 34, 24);
		} else {
			g.fillRect(deffender.getX() + 30, deffender.getY() + 20, 34, 24);
		}
		
		// aggressor
		g.setColor(new Color(255, 0, 0));
		g.fillRect(aggressor.getX(), aggressor.getY(), 64, 64);
		
		g.setColor(new Color(0, 255, 0));
		if (aggressor.getDirection() == Direction.UP){
			g.fillRect(aggressor.getX() + 20, aggressor.getY(), 24, 34);
		} else if (aggressor.getDirection() == Direction.DOWN){
			g.fillRect(aggressor.getX() + 20, aggressor.getY() + 30, 24, 34);
		} else if (aggressor.getDirection() == Direction.LEFT){
			g.fillRect(aggressor.getX(), aggressor.getY() + 20, 34, 24);
		} else {
			g.fillRect(aggressor.getX() + 30, aggressor.getY() + 20, 34, 24);
		}

		g.setColor(new Color(255, 255, 0));
		g.fillRect(bullet.getX(), bullet.getY(), 14, 14);
	}

}
