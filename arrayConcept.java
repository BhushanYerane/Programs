package newbasicjava;

import java.util.Scanner;

public class arrayConcept {
	static int x[];
	
	static int min = x[0];
    static int max = x[0];
	
	public static int maxelement(int[] x)
	{
		for (int ele:x) {
			if (ele>max)
			{
				max=ele;
			}
		}
		return max;
	}
	public static int minelement(int[] x)
	{
		for (int ele:x) {
			if (ele<min)
			{
				min=ele;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [] x = new int[5];
		int y[] = {1,12,123,1234,12345,123456,1234567};
		
		System.out.println("Enter the Array Element");
		for(int i=0; i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("The elements of the array are:");
		for(int element :x )
		{
			System.out.print(element+"\t");
		}
		maxelement(x);
		minelement(x);
		
		minelement(y);
		minelement(y);
	}

}
