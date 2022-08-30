import java.util.Scanner;
public class assignment_4 {
    public static void main(String[] args) {
        // Question 4 : Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+ or - or * or /) : ");
        char opr = sc.next().charAt(0);
        sc.close();
        int ans = 0;
        if(opr == '+') ans = (num1 + num2);
        if(opr == '-') ans = (num1 - num2);
        if(opr == '*') ans = (num1 * num2);
        if(opr == '/') ans = (num1 / num2);
        System.out.println("Answer : " + ans);
    }
    
}
