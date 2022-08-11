import java.util.Scanner;

public class totalNumber {
    public static void main(String[] args) {
        int number, value, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        number = input.nextInt();

        while (number != 0) {
            value = number % 10;

            total += value;

            System.out.println(value);

            number /= 10;
        }

        System.out.println("total: "+ total);
    }
}
