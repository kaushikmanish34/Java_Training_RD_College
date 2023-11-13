import java.util.Scanner;

public class Leap_Func {
	static void leap(int x) {
		if(x%4==0||x%400==0&&x%100!=0) {
			System.out.println("year is leap year");
		}else {
			System.out.println("not a leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		leap(year);

	}

}