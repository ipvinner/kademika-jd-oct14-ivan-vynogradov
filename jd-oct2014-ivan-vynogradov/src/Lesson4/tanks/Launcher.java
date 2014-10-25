package Lesson4.tanks;

public class Launcher {

	public static void main(String[] args) throws Exception {

//		BattleField bf = new BattleField();
		// bf.runTheGame();

		// System.out.println(bf.scanQadrant(2, 2));
		// System.out.println(bf.battleField[1][1]);
		// bf.updateQadrant(2, 2, "B");
		// System.out.println(bf.battleField[1][1]);
//		System.out.println(bf.getDimentionX());
		
		ActionField af = new ActionField();
		System.out.println("created Action field");
		af.runTheGame();
	}

}
