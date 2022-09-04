
// Questiion :: Check if the Number is prime or not ?
import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        String ans = "Prime";
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                ans = "Not Prime";
        }
        System.out.printf("%d is %s number", num, ans);
    }
}
