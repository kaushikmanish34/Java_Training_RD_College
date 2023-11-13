
    import java.util.Scanner;

public class SdeRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(" ");
			}
		for(int k=0;k<=n;k++) {
			System.out.print("*");
		}
		System.out.println();
		}
		

	}

}