import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int num1, num2, i, ebob = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = inp.nextInt();

        System.out.print("Enter the second number: ");
        num2 = inp.nextInt();

        i = num1;

        while (i >= 1) {
            if ((num2 % i == 0) && (num1 % i == 0)) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+(num1*num2)/ebob);



    }
}
