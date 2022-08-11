import java.util.Scanner;

public class star {
    public static void main(String[] args) {

        int i = 1, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        while (i <= number) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }

        b = number;

        while (b >= 0) {
            for (int j = 1; j <= (number-b); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * b - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            b--;
        }
    }
}
