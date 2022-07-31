import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        double length, weight, result;

        Scanner input = new Scanner(System.in);

        System.out.print("length : ");
        length = input.nextDouble();

        System.out.print("weight : ");
        weight = input.nextDouble();

        result = weight / (length * length);

        System.out.print("Your body mass index: "+ result);
    }
}
