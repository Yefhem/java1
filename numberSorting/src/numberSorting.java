import java.util.Scanner;

public class numberSorting {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        a = input.nextInt();

        System.out.print("Second Number: ");
        b = input.nextInt();

        System.out.print("Third Number: ");
        c = input.nextInt();

        if (a == b) {
            if (a > c) {
                System.out.println("a = b > c");
            }else {
                System.out.println("c > a = b");
            }
            return;
        } else if (a == c) {
            if (a > b) {
                System.out.println("a = c > b");
            }else {
                System.out.println("b > a = c");
            }
            return;
        } else if (b == c) {
            if (b > a) {
                System.out.println("b = c > a");
            }else {
                System.out.println("a > b = c");
            }
            return;
        } else if (a > b && a > c) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
            return;
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
            return;
        } else {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
    }
}
