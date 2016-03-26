package Homework;

public class Sweets { 
	static int numberofSweet = 1000;
	static String typesofSweet= "20";
	static String designsofSweets="Unique";
	
	public void setnumberofSweet(int numberofSweet){
		this.numberofSweet=numberofSweet;
		
	}
	
	public int getnumberofSweet(){
		return numberofSweet;
	}
	public static void cookInfo(){
		System.out.println("numberofSweet: " + numberofSweet);
		System.out.println("typeofSweet:  "  + typeofSweet);
		System.out.println("designsofSweet:" + designsofSweet);
		
	}
}