package keywords;

public class Car {
	
	static int carsize = 10;
	static String color = "green";
	
	public void setCarSize(int carSize){
		Car.carsize = carSize;
	}
	
	public int getCarSize(){
		return carsize;
	}
	
	public static void carProperty(){
		System.out.println("Car size: " + carsize +" "+"Car color : "+color );
	}
	

}
