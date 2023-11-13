
import java.util.Scanner;

public class Swap_Func {
	void swap(  int a,int b)
	{
		a=a+b;
		b=a-b;
	    a=a-b;
	    System.out.println("after swapping"+a+b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int x=sc.nextInt();
	    int y=sc.nextInt();
	    Swap_Func r=new Swap_Func();
	    r.swap(x,y);

	}

}