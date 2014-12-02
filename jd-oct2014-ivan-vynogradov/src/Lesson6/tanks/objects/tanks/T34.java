package Lesson6.tanks.objects.tanks;

import java.awt.Color;

import Lesson6.tanks.enums.Direction;
import Lesson6.tanks.objects.abstractobjects.AbstractTank;
import Lesson6.tanks.objects.fields.ActionField;
import Lesson6.tanks.objects.fields.BattleField;

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
