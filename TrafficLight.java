
import java.util.*;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("1 for Red");
        System.out.println("2 for Yellow");
        System.out.println("3 for Green");
        System.out.println("4 for Exit");
        System.out.println("Enter your choice ");
        int v=sc.nextInt();
    
        switch(v){
            case 1:{
            System.out.println("Light is Red");
            break;}
            case 2:{
            System.out.println("Llight is Yellow");
            break;}

            case 3:{
            System.out.println("Light is Green");
            break;}
            case 4:{
            System.exit(0);
            break;}
            default:
            System.out.println("Sorry,wrong operation");
        }
        }
    }

   

   
    
}