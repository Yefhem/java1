import java.util.Scanner;

public class circleCalculater {
    public static void main(String[] args) {
        int radius, centerAngle;
        double pi = 3.14, area, perimeter, result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("radius : ");
        radius = input.nextInt();

        area = pi * (radius * radius);
        perimeter = 2 * pi * radius;

        System.out.print("center angle : ");
        centerAngle = input.nextInt();

        result = (pi * (radius * radius) * centerAngle) / 360;

        System.out.println("All area: "+area);
        System.out.println("perimeter: "+perimeter);
        System.out.println("area of center angle: "+result);
    }
}
