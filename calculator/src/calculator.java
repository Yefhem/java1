import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        number2 = input.nextInt();

        System.out.println("1-addition\n2-subtraction\n3-multiplication\n4-division");
        System.out.print("Please chosee the process number : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Result "+number1 + " + " + number2 + " = " + (number1+number2));
                break;
            case 2:
                System.out.print("Result "+number1 + " - " + number2 + " = " + (number1-number2));
                break;
            case 3:
                System.out.print("Result "+number1 + " x " + number2 + " = " + (number1*number2));
                break;
            case 4:
                switch (number2) {
                    case 0:
                        System.out.println("second number cannot be zero");
                        break;
                    default:
                        System.out.print("Result "+number1 + " / " + number2 + " = " + (number1/number2));
                }
                break;
            default:
                System.out.println("Please, choose a number from 1-4!");
        }


    }
}
