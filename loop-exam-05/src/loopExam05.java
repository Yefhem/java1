import java.util.Scanner;

public class loopExam05 {
    public static void main(String[] args) {

        int number,base, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        number = input.nextInt();

        System.out.print("Enter the base: ");

        base = input.nextInt();

        for (int i = 0; i < base; i++) {
            total = (total * number);
        }

        System.out.println("Result: "+total);
    }
}
