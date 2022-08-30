import java.util.Scanner;
public class assignment_2 {
    public static void main(String[] args) {
        // Question 2 : Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner (System.in);
        String name;
        System.out.println("Enter your name , please : ");
        name = sc.nextLine();
        sc.close();
        System.out.println("Happy Birthday "+ name);
    }
}
