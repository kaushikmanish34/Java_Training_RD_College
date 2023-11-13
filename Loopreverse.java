import java.util.Scanner;

public class Loopreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.you want reverse");
		int n=sc.nextInt();
		 int rev=0;
		 while(n!=0) {
			int r=n%10;
			 rev=rev*10+r;
			 n=n/10;
			 
		 }
		 System.out.println("reverse nuber="+rev);

	}

}