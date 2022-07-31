import java.util.Scanner;

public class kdvCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double withoutKDVPrice, KDVPrice, result, percentage = 0.18;

        System.out.print("Please enter the price: ");
        withoutKDVPrice = input.nextDouble();

        KDVPrice = withoutKDVPrice * percentage;

        result = withoutKDVPrice + KDVPrice;

        System.out.println("witout KDV: "+withoutKDVPrice);
        System.out.println("KDV: "+KDVPrice);
        System.out.println("Result: "+result);
    }
}
