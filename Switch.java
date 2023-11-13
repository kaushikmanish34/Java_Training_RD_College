import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" press 1 to see bollywood movie ");
        System.out.println(" press 2 to see hollywood movie ");
        System.out.println(" press 3 to see tollywood movie ");
        System.out.println(" press 4 to see anime movie ");
        int x = sc.nextInt();
        switch (x)
        {
            case 1: {
                System.out.println("you want to see bollywood movie ");
                break;
            }
            case 2:
            {
                System.out.println(" you want to see hollywood movie ");
                break;
            }
            case 3:
            {
                System.out.println(" you want to see tollywood movie ");
                break;
            }
            case 4:
            {
                System.out.println(" you want to see anime movie ");
                break;
            }
            default:
            {
                System.out.println(" oops! something went wrong ");
            }
        }
    }
}