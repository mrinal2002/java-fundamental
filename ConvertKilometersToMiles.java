import java.util.*;
class ConvertKilometersToMiles{
	static double calculateMiles(int kilometers){
	 
	 double miles=(double)kilometers * 0.621371;
	 return miles;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometers in numbers which you want to convert into miles :" );
		int kilometers=sc.nextInt();
		
		double miles=calculateMiles(kilometers);
		
		System.out.println(kilometers+" in miles = "+miles);
		
	}
}