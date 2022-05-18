class car{
	private int year;
	private String make;
	private double speed;
	
	car (int y, String x, double z){
		this.year = y;
		this.make = x;
		this.speed = z;
	}
	
	public int getyear(){
		return year;
	}
	
	public String getmake(){
		return make;
	}
	
	public double getspeed (){
		System.out.println("your speed is"+this.speed+"mph");
		return speed;
	}
	
	void accelerate (){
		speed = speed +1;
	}
}
	class RaceTrack {
		public static void main(String[] args){
			
			car c = new car(2021,"Mercedes maybach",190.0);
			
			System.out.println("Current speed :"+c.getspeed());
			System.out.println("Current year :"+c.getyear());
			System.out.println("Current make :"+c.getmake());
			
			c.accelerate();
			System.out.println("Current speed :"+c.getspeed());
			
		}
	}

/*
Output: 

D:\DBDA\Java\src\exam>javac exam1.java

D:\DBDA\Java\src\exam>java RaceTrack
your speed is190.0mph
Current speed :190.0
Current year :2021
Current make :Mercedes maybach
your speed is191.0mph
Current speed :191.0

*/