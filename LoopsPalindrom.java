import java.util.Scanner;

public class LoopsPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter any number");
		int n=sc.nextInt();
		int s=0;
		int temp=n;
		while(n!=0) {
			int r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(temp==s) {
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}