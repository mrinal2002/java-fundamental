import java.util.*;
class PerimeterOfRectangle{
	static int calculatePerimeter(int length,int width){
	 
	 int perimeter=2*(length+width);
	 return perimeter;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle :" );
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle :" );
		int width=sc.nextInt();
		int perimeter=calculatePerimeter(length,width);
		
		System.out.println("perimeter of rectangle will be :"+ perimeter);
		
	}
}