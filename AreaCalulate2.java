package newbasicjava;

import java.util.Scanner;

public class AreaCalulate2 {

	public static void main(String[] args) {
	
		System.out.println("Area for given ");
		Scanner scan = new Scanner(System.in);
		double Circle,Triangle,Rectangle,radius,base,height;
		int Rwidth,Rheight;
		
		System.out.println("Enter the radius: ");
		radius = scan.nextDouble();
		
		System.out.println("Enter the base:");
		base=scan.nextDouble();
		System.out.println("Enter the height");
		height=scan.nextDouble();
		
		System.out.println("Enter the width:");
		Rwidth=scan.nextInt();
		System.out.println("Enter the height:");
		Rheight=scan.nextInt();
		
		AreaCalulate2 area1 = new AreaCalulate2();
		Circle = area1.areaCircle(radius);
		Rectangle= area1.areaRectangel(Rwidth, Rheight);
		Triangle = area1.areaTriangle(base,height);	
		
		System.out.println("Area of Circle: "+Circle);
		System.out.println("Area of Triangle: "+Triangle);
		System.out.println("Area of Rectangle: "+Rectangle);
	}
	
	public double areaCircle (double radius)
	{
		double areaC1 = Math.PI*radius*radius;
		return areaC1;
	}
	public double areaTriangle (double base, double height)
	{
		double areaT1 = 0.5*base*height;
		return areaT1;
	}
	public double areaRectangel (int height, int width)
	{
		int areaR1 = width*height;
		return areaR1;
	}
}
