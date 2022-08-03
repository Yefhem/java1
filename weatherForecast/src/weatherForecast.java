import java.util.Scanner;

public class weatherForecast {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("you should ski");
        } else if (heat < 10) {
            System.out.println("You should go to cinema");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("You should go to picnic and cinema");
        } else if (heat > 15 && heat < 25) {
            System.out.println("You should go to picnic");
        } else {
            System.out.println("You should swim");
        }

    }
}
