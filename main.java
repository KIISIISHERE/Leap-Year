import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int febDays = input.nextInt();   // year to check

        // Leap year logic using ternary operator
        String result = ((febDays % 4 == 0 && febDays % 100 != 0) || (febDays % 400 == 0))
                ? febDays + " is a leap year"
                : febDays + " is NOT a leap year";

        System.out.println(result);
    }
}