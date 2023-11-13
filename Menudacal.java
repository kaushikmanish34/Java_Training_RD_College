import java.util.Scanner;

public class Menudacal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice 1 to additon "+"enter 2 to perform substraction "+"enter 3 to perform multiplication "+"enter 4 to perform division "+"enter 5 to perform modulous");
		int x=sc.nextInt();
		System.out.println("enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(x) {
		case 1:{
			int sum=a+b;
			System.out.println(sum);
			break;
		}
		case 2:{
			int sub=a-b;
			System.out.println(sub);
			break;
		}case 3:{
			int mul=a*b;
			System.out.println(mul);
			break;
		}case 4:{
			int div=a/b;
			System.out.println(div);
			break;
		}case 5:{
			int mod=a%b;
			System.out.println(mod);
			break;
		}default:{
			System.out.println("wrong choice");
		}
		}

	}

}