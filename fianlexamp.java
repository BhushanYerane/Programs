package javaPrograms;

public class fianlexamp {
	
	int speedlimit = 90;
	void run()
	{
		speedlimit = 400;
	}
	
	final void run1()
	{
		System.out.println("runnung");
	}
	
	class honda extends fianlexamp
	{
		void run()
		{
			System.out.println("runnung safely");
		}
	
	
	public static void main(String[] args) {
		
		fianlexamp obj = new fianlexamp();
		obj.run();

		//-----------/
		
		honda hon= new honda;
		hon.run();
	}
}}

 