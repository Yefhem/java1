import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        int distance, age, type;
        double discount = 0, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance(KM): ");
        distance = input.nextInt();

        if (distance <= 0) {
            System.out.println("there's a mistake");
            return;
        }

        System.out.print("Enter the age: ");
        age = input.nextInt();

        if (age <= 0) {
            System.out.println("there's a mistake");
            return;
        }

        System.out.println("1-one direction\n2-Two-Way");
        System.out.print("Enter the type: ");
        type = input.nextInt();

        if (!(type < 3 && type > 0)) {
            System.out.println("there's a mistake");
            return;
        }

        total = distance * 0.10;

        if (age < 12) {
            total -= (total * 0.50);
        } else if (age >= 12 && age <= 24) {
            total -= (total * 0.10);
        } else if (age >= 65){
            total -= (total * 0.30);
        }

        if (type == 2) {
            total -= (total * 0.20);
            total *= 2;
        }

        System.out.println("Total: "+total);
    }
}
