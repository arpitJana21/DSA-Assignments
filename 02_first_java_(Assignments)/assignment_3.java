import java.util.Scanner;
public class assignment_3 {
    public static void main(String[] args) {
        // Question 2 : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Princile Amount (Rs.) : ");
        int P = sc.nextInt();
        System.out.print("Enter time (year): ");
        int T = sc.nextInt();
        System.out.print("Enter rate of interest (%) ");
        int R = sc.nextInt();
        sc.close();
        System.out.print("Simple rate of Interest : ");
        int si = (P*R*T)/100;
        System.out.println("Simple Interest : " + si);
    }
}
