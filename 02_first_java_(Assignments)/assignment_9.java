import java.util.Scanner;

public class assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check if it is Amstrong Number or Not ? ");
        int num = sc.nextInt();
        int copyNum1 = num;
        int copyNum2 = num;
        sc.close();
        int digitCount = 0, ans = 0;
        while (copyNum1 != 0) {
            copyNum1 = copyNum1 / 10;
            digitCount++;
        }
        while (copyNum2 != 0) {
            int digit = copyNum2 % 10;
            int digitPow = 1;
            for (int i = 1; i <= digitCount; i++) {
                digitPow = digitPow * digit;
            }
            ans = ans + digitPow;

            copyNum2 = copyNum2 / 10;
        }
        if (ans == num)
            System.out.printf("Yes, %d is an Amstrong Number", num);
        else
            System.out.printf("No, %d is not an Amstrong Number", num);
    }
}