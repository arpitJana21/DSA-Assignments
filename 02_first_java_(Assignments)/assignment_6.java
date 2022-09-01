import java.util.Scanner;

public class assignment_6 {
    public static void main(String[] args) {
        // Question 6 : Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Currency in Rs. : ");
        double currRS = sc.nextDouble();
        sc.close();
        double currUSD = currRS * 0.013;
        String newCurrUSD = String.format("%.2f", currUSD);
        System.out.print("Currency in USD : " + newCurrUSD);
    }
}
