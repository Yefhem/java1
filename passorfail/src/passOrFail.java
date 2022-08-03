import java.util.Scanner;

public class passOrFail {
    public static void main(String[] args) {
        int math, physics, turkish, chemical, music;

        Scanner input = new Scanner(System.in);

        System.out.print("your math grade: ");
        math = input.nextInt();

        if (!(0 <= math && math <= 100)) {
            System.out.println("Please, choose a number from 0-100!");
            return;
        }

        System.out.print("your physics grade: ");
        physics = input.nextInt();

        if (!(0 <= physics && physics <= 100)) {
            System.out.println("Please, choose a number from 0-100!");
            return;
        }

        System.out.print("your turkish grade: ");
        turkish = input.nextInt();

        if (!(0 <= turkish && turkish <= 100)) {
            System.out.println("Please, choose a number from 0-100!");
            return;
        }

        System.out.print("your chemical grade: ");
        chemical = input.nextInt();

        if (!(0 <= chemical && chemical <= 100)) {
            System.out.println("Please, choose a number from 0-100!");
            return;
        }

        System.out.print("your music grade: ");
        music = input.nextInt();

        if (!(0 <= music && music <= 100)) {
            System.out.println("Please, choose a number from 0-100!");
            return;
        }

        double avarage = (math + physics + turkish + chemical + music) / 5;

        if (avarage <= 55) {
            System.out.println("Failed, See you next year!");
        } else {
            System.out.println("Successful");
        }


        System.out.println("Your Avarage: " + avarage);
    }
}
