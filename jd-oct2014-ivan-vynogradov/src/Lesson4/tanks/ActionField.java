package Lesson4.tanks;

public class ActionField {

	final boolean COLORDED_MODE = true;
	private BattleField bf = new BattleField();
	private Tank tank = new Tank();
	private Bullet bullet = new Bullet();

	void runTheGame() throws Exception {

	}

	boolean processInterception() {
		String coordinates = getQuadrant(bullet.getX(), bullet.getY());
		int y = Integer.parseInt(coordinates.split("_")[0]);
		int x = Integer.parseInt(coordinates.split("_")[1]);
			
			String[][] battleField = bf.getBattleField();
		if (y >= 0 && y < 9 && x >= 0 && x < 9) {
			if (!battleField[y][x].trim().isEmpty()) {
				battleField[y][x] = " ";
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
	
	
	

}
