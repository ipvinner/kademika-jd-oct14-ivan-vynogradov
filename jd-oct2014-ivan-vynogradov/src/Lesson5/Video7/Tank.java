package Lesson5.Video7;

public class Tank {
	
	private int maxSpeed;
	private int crew;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getCrew() {
		return crew;
	}
	public void setCrew(int crew) {
		this.crew = crew;
	}
	
	public void move(){
		System.out.println("Tank move");
	}
	
}
