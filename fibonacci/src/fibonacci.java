import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int num, a = 0, b = 1, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the value: ");

        num = inp.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= (num - 2); i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
