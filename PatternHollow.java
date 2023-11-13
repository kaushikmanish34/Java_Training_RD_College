import java.util.Scanner;

public class PatternHollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||i==n||j==0||j==n) {
					System.out.print("*"+"");
				}
					else {
						System.out.print(" ");
					}
				}
			System.out.println();	
			}
		}

	}

