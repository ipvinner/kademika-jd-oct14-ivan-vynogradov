package Lesson6.tanks;

public class Tiger extends Tank{
	
	private int armor;
	
	public Tiger(ActionField af, BattleField bf){
		super(af, bf);
		armor = 1;
	}
	
	public Tiger(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction){
		super(af, bf, x, y, tankType, direction);
		armor = 1;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		if (armor > 0){
			armor = 0;
		}else{
			super.destroy();
		}
	}
	
	
}
