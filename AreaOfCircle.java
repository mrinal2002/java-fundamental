import java.util.*;
class AreaOfCircle{
	static int calculateAreaOfCircle(int radius){
	 int area=2*(int)Math.PI*radius;
	 return area;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :" );
		int radius=sc.nextInt();
		int area=calculateAreaOfCircle(radius);
		System.out.println("Circle of area will be :"+ area );
		
	}
}