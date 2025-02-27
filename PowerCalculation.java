import java.util.*;
class PowerCalculation{
	static int calculatePower(int firstNumber,int secondNumber){
	 
	 int power=(int)Math.pow(firstNumber,secondNumber);
	 return power;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :" );
		int firstNumber=sc.nextInt();
		System.out.println("Enter second number :" );
		int secondNumber=sc.nextInt();
		int power=calculatePower(firstNumber,secondNumber);
		
		System.out.println("power of "+firstNumber +" and "+secondNumber+" is : " + power);
		
	}
}