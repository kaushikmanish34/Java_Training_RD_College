import java.util.Scanner;

public class FunctionGrosSal {
	static int HRA(int x) {
		double hra=(0.3*x);
		System.out.println("your hra is:-"+hra);
		return x;
	}
	static int da(int x) {
		double da=(20*x)/100;
		System.out.println("your da is:-"+da);
		return x;
	}
	static int ta() {
		int ta=2000;
		return ta;
		}
	static int tax(int x)
	{
		double tax=0;
		if(x<10000) {
			 tax=0.1*x;
		}
		else if(x>10000&&x<25000) {
			 tax=0.2*x;
		}
		else if(x>=25000&&x<35000) {
			 tax=0.3*x;
		}
		else {
			 tax=0.4*x;
			
		}
		System.out.println("your tax is:-"+tax);
			return x;
		}
	static int grosssalary(int x) {
	    double gross= HRA(x) + da(x) + ta() ;
		System.out.println("your gross salary is :-"+gross);
        return x;
	}
	static int net(int x) {
		double netsalary=grosssalary(x)-tax(x);
		System.out.println("your net salary is:-"+netsalary);
		return x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your employee name");
		String name=sc.next();
		System.out.println("enter your basic salary");
		int x=sc.nextInt();
		grosssalary(x);
		net(x);

	}

}