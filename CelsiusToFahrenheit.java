import java.util.*;
class CelsiusToFahrenheit{
	static int calculate(int temperatureInCelsius){
	 int fahrenheit=(temperatureInCelsius*9/5) + 32;
	 return fahrenheit;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius :" );
		int temperatureInCelsius=sc.nextInt();
		int fahrenheit=calculate(temperatureInCelsius);
		System.out.println("your temperature in fahrenheit is :"+ fahrenheit );
		
	}
}