
import java.util.Scanner;

public class Weekcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any number between 1 to 7");
		Scanner sc= new Scanner(System.in);
		int day=sc.nextInt();
		if(day==1) {
			System.out.println("sunday");
		}if(day==2) {
			System.out.println("monday");
		}if(day==3) {
			System.out.println("tuesday");
		}if(day==4) {
			System.out.println("wednesdy");
		}if(day==5) {
			System.out.println("thuresday");
		}if(day==6) {
			System.out.println("friday");
		}if(day==7) {
			System.out.println("wednesday");
		}

	}

}