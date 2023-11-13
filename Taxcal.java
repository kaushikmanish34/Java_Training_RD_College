
import java.util.Scanner;

public class Taxcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your income");
		int income=sc.nextInt();
		double t=0;
		if(income<10000) {
			 t=0;
		}else if(income>=10000 && income<20000) {
			 t=income/10;
		}else if(income>=20000 && income<=30000) {
			 t=income*0.15;
		}else  {
			 t=income*0.25;
		}
		System.out.println("your total tax is " +t);	
			

	}

}