import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter three number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println((a>b)&&(a>c)?"a is grater":(b>c)&&(b>a)?"b is grater":"c is greater");
	}

}