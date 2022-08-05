import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        year = input.nextInt();

        Boolean isLeapYear = ((year % 4 == 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " isn't a leap year");
        }

    }
}
