import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {

        double distance, perKM = 2.20, price = 10, minimum = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("how far is it: ");
        distance = input.nextInt();

        price += (distance * perKM);

        System.out.println(price);

        price = (20 <= price) ? price : minimum;

        System.out.println("amount you have to pay: " + price);


    }
}
