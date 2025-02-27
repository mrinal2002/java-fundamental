import java.util.*;
class CalculateSimpleInterest{
	static double calculateInterest(int principle,int rate,int time){
	 
	 double interest=((double)principle*(double)rate*(double)time)/100;
	 return interest;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle :" );
		int principle=sc.nextInt();
		System.out.println("Enter rate :" );
		int rate=sc.nextInt();
		System.out.println("Enter time :" );
		int time=sc.nextInt();
		double interest=calculateInterest(principle,rate,time);
		System.out.println("simple interest will be :"+ interest );
		
	}
}