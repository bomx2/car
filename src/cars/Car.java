package cars;

class Car {
	String name;
	int speed;
	static int numberOfCars;

	public Car() {
				name = "MyCar";
				speed = 0;
				numberOfCars++;
	}	

   public void setName(String name) {
				name = name;
	}
	public void setSpeed(int s) {
				speed = s;
	}
	public int getSpeed() {
				return speed;
	}
}