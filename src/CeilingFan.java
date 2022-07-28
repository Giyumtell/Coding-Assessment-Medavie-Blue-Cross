
public class CeilingFan {
	enum Direction {
		CLOCKWISE,
		COUNTERCLOCKWISE
	}
	private int curSpeed = 0;
	private Direction curDirection = Direction.CLOCKWISE;
	public void speedCord() {
		curSpeed = ++curSpeed % 4;
	}
	public void directionCord() {
		curDirection = (curDirection.equals(Direction.CLOCKWISE))?Direction.COUNTERCLOCKWISE:Direction.CLOCKWISE;
	}
	public int getSpeed(){
		return curSpeed;
	}
	public String getDirection(){
		return (curDirection.equals(Direction.CLOCKWISE))?"ClockWise":"Counter ClockWise";
	}
	public String toString() {
		String temp;
		if (curSpeed == 0) {
			temp = String.format("The Fan State is OFF and Direction Settings is %s",getDirection());
		}
		else {
			temp = String.format("The Fan State is ON, with Speed of [%d] and Direction Settings is %s",getSpeed(),getDirection());
		}
		return temp;
	}
}
