import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        double a, b, hypotenuse = 0, area = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("first edge: ");
        a = input.nextDouble();

        System.out.print("second edge: ");
        b = input.nextDouble();

        hypotenuse = Math.sqrt((a*a) + (b*b));
        area = (a * b) / 2;

        System.out.println("area: " + area);
        System.out.println("perimeter: "+ (a + b + hypotenuse));
        System.out.println("hypotenuse: "+ hypotenuse);

    }
}
