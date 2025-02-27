import java.util.*;
class VolumeOfCylinder{
	static int calculateVolumeOfCylinder(int radius,int height){
	 
	 int volume=(int)Math.PI*radius*radius*height;
	 return volume;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :" );
		int radius=sc.nextInt();
		System.out.println("Enter height :" );
		int height=sc.nextInt();
		int volume=calculateVolumeOfCylinder(radius,height);
		System.out.println("volume of cylinder is  :"+ volume );
		
	}
}