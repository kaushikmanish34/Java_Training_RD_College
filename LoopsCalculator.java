
import java.util.Scanner;
public class LoopsCalculator {
	public static void main(String[] args) {
		int a,b,choice;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first number");
		a=obj.nextInt();
		System.out.println("enter the second number");
		b=obj.nextInt();
		System.out.println("enter 1 for addition"+"enter 2 for substration"+"enter 3 for multiplication"
		+"enter 4 for division");
		choice=obj.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition of two number is "+(a+b));
			break;
		case 2:
			System.out.println("substraction of two number is "+(a-b));
			break;
		case 3:
			System.out.println("multiplication of two number is "+(a*b));
			break;
		case 4:
			System.out.println("Division of two number is "+(a/b));
			break;
		default:
			System.out.println("Invalid input");
		}
		obj.close();
	}

}