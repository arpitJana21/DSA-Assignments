import java.util.Scanner;

public class assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        boolean check = true;
        char left = str.charAt(0);
        char right = str.charAt(str.length() - 1);
        while (left < right) {
            if (left != right)
                check = false;
            left++;
            right--;
        }
        System.out.println(check);
    }
}