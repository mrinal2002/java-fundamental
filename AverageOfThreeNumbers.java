import java.util.*;
class AverageOfThreeNumbers{
	static double calculateAverageOfThreeNumber(int firstNumber,int secondNumber,int thirdNumber){
	 
	 double average=(double)(firstNumber+secondNumber+thirdNumber)/3;
	 return average;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :" );
		int firstNumber=sc.nextInt();
		System.out.println("Enter second number :" );
		int secondNumber=sc.nextInt();
		System.out.println("Enter third number :" );
		int thirdNumber=sc.nextInt();
		double average=calculateAverageOfThreeNumber(firstNumber,secondNumber,thirdNumber);
		
		System.out.println("average of "+firstNumber +" and "+secondNumber+" and "+thirdNumber +" is :" + average);
		
	}
}