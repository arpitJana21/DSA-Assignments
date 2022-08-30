import java.util.Scanner;
public class assignment_1 {
public static void main(String[] args) {
    // Question 1 : Write a program to print whether a number is even or odd, also take input from the user.
    Scanner sc = new Scanner (System.in);
    int num;
    System.out.println("Enter a number to check it is even or odd ? : ");
    num = sc.nextInt();
    if(num % 2 == 0)
        System.out.println(num + " is even ");
    else System.out.println(num + " is odd ");
}
    
}