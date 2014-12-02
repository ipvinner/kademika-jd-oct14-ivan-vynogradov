package Lesson6.tanks.objects.tanks;

import java.awt.Color;

import Lesson6.tanks.enums.Direction;
import Lesson6.tanks.objects.abstractobjects.AbstractTank;
import Lesson6.tanks.objects.fields.ActionField;
import Lesson6.tanks.objects.fields.BattleField;

public class BT7 extends AbstractTank {
	private int speed = super.getSpeed()*2;
	
	public BT7(ActionField af, BattleField bf){
		super(af, bf);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
		
	}
	
	public BT7(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction){
		super(af, bf, x, y, tankType, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
}
