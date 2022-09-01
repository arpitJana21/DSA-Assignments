import java.util.Scanner;

public class assignment_5 {
    public static void main(String[] args) {
        // Question 5 : Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();
        sc.close();
        int bigNum = 0;
        if (num1 < num2)
            bigNum = num2;
        else
            bigNum = num1;
        System.out.println(bigNum);
    }

}
