import java.util.Scanner;

public class assignment_7 {
    public static void main(String[] args) {
        // Question 7 : To calculate Fibonacci Series up to n numbers.
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1, c = 0, count = 1;
        System.out.printf("%d, %d", a, b);
        while (n >= count) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
            count++;
        }
    }
}
