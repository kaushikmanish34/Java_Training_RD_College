import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Month Name ");
		String Month=sc.next();
		System.out.println("Enter 1 to check winter ");
		System.out.println("Enter 2 to check spring ");
		System.out.println("Enter 3 to check summer ");
		System.out.println("Enter 4 to check  fall(autumn)");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			Month="march";
			break;
		case 2:
			Month="april";
			break;
		case 3:
			Month="may";
			break;
		case 4:
			Month="june";
			break;
		case 5:
			Month="july";
			break;
		case 6:
			Month="auagust";
			break;
		case 7:
			Month="september";
			break;
		case 8:
			Month="october";
			break;
		case 9:
			Month="november";
			break;
		case 10:
			Month="december";
			break;
		case 11:
			Month="janurary";
			break;
		case 12:
			Month="februray";
			break;
		default:
			Month="invalid";
		
		}
	switch(n) {
	case 1:
	case 2:
	case 3:
		System.out.println("spring season");
		break;
	case 4:
	case 5:
	case 6:
		System.out.println("summer season");
		break;
	case 7:
	case 8:
	case 9:
		System.out.println("autum season");
		break;
	case 10:
	case 11:
	case 12:
		System.out.println("winter season");
		break;
	default:
		System.out.println("invalid");
	}


	}

}