import java.util.Scanner;

public class greengrocer {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5, result = 0;
        int pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        Scanner input = new Scanner(System.in);

        System.out.print("how many kilos pear: ");
        pearKg = input.nextInt();

        System.out.print("how many kilos apple: ");
        appleKg = input.nextInt();

        System.out.print("how many kilos tomato: ");
        tomatoKg = input.nextInt();

        System.out.print("how many kilos banana: ");
        bananaKg = input.nextInt();

        System.out.print("how many kilos aggplant: ");
        eggplantKg = input.nextInt();

        result = (pearKg * pearPrice) + (appleKg * applePrice) + (tomatoKg * tomatoesPrice) + (bananaKg * bananaPrice) + (eggplantKg * eggplantPrice);

        System.out.println("result: "+result);
    }
}
