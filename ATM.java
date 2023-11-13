
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int bal=40000;
		System.out.println("click 1 to check balance");
		System.out.println("click 2 to check withdral");
		System.out.println("click 3 to check deposit");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Total Balance"+bal);
			break;
		case 2:
			System.out.println("Enter The Withdral Amount");
			int m=sc.nextInt();
			System.out.println("Withraw Amount =>"+m);
			int totalbalance=bal-m;
			System.out.println("Your Total Balance Remaining => "+totalbalance);
			break;
		case 3:
			System.out.println("Enter Deposit Amount");
			int d=sc.nextInt();
			System.out.println("Deposit =>"+d);
			int totalbalanc=bal+d;
			System.out.println("Your Total Balnce now  =>"+totalbalanc);
			break;
		default:
			System.out.println("you have press wrong key please press the valid key");
		}
        sc.close();

	}

}