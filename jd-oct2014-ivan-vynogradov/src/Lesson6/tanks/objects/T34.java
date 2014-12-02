package Lesson6.tanks.objects;

import java.awt.Color;

import Lesson6.tanks.ActionField;
import Lesson6.tanks.BattleField;
import Lesson6.tanks.abstractobjects.AbstractTank;
import Lesson6.tanks.enums.Direction;

public class T34 extends AbstractTank {
	
	public T34(ActionField af, BattleField bf){
		super(af, bf, 128, 512, true, Direction.UP);
		tankColor = new Color(0, 255, 0);
		towerColor = new Color(255, 0, 0);
	}
	
	public T34(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction){
		super(af, bf, x, y, tankType, direction);
		tankColor = new Color(0, 255, 0);
		towerColor = new Color(255, 0, 0);
	}
	
	
}
