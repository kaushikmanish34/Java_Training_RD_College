import java.util.Scanner;

public class Reverse_Func {
	static void rev( int n) {
		int rev=0;
		 while(n!=0) {
			    
				int r=n%10;
				 rev=rev*10+r;
				 n=n/10;
				 
			 }
		 System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		rev(x);
	}

}