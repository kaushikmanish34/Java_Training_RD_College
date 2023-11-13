import java.util.Scanner;

public class FunctionSI {
	
	public static float simpleinterest(float a,float b,float c) {
		
		float z=(a*b*c)/100;
		System.out.print(z);
		return z;
	    
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount");
		float p=sc.nextFloat();
		System.out.println("enter the rate percent");
		float r=sc.nextFloat();
		System.out.println("enter the time in year");
		float t=sc.nextFloat();
		FunctionSI obj=new FunctionSI();
		obj.simpleinterest(p, r, t);
		
		

	}



}