import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter  first word ");
        String w1 = sc.next().toUpperCase();
        System.out.println(" enter second word ");
        String w2 = sc.next().toUpperCase();
        int sum1 = 0;
        int sum2 = 0;
        if(w1.length()==w2.length())
        {
            for (int i = 0; i < w1.length(); i++) {

                sum1 = sum1 + w1.charAt(i);
            }
            for (int j = 0; j < w2.length(); j++) {

                sum2 = sum2 + w2.charAt(j);
            }
            if (sum1 == sum2) {
                System.out.println(" anagram ");
            } else {
                System.out.println(" no anagram ");
            }
        }
        else
        {
            System.out.println(" cant possible ");
        }
    }
}