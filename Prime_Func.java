import java.util.Scanner;

public class Prime_Func {
	static void prime(int n) {
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0)
			{
			System.out.println(" not prime number");
			break;
			}
			else
			{
				System.out.println("prime number");
			 break;
			}
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int x=sc.nextInt();
	prime(x);
	
	}

}