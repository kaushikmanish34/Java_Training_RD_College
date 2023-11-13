import java.util.Scanner;

public class Loopsodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the range of number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("no.is even "+i);
				
			}
			else {
				System.out.println(" no.is odd "+i);
			}
		}

	}

}