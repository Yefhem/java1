import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        int year, remainder;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        year = input.nextInt();

        remainder = year % 12;

        switch (remainder) {
            case 0:
                System.out.println("the monkey");
                break;
            case 1:
                System.out.println("Cockerel");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
        }
    }
}
