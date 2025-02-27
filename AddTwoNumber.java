import java.util.*;
class AddTwoNumber{
	static int calculate(int first,int second){
	 int result=first+second;
	 return result;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number :" );
		int first=sc.nextInt();
		System.out.println("Enter a second number :" );
		int second=sc.nextInt();
		int result=calculate(first,second);
		System.out.println("After adding two number result is : "+result);
		
	}
}