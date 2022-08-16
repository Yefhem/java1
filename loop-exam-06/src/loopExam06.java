import java.util.Scanner;

public class loopExam06 {
    public static void main(String[] args) {

        int count, number, max = 1, min = 1, a;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers do u wanna enter: ");
        count = inp.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + " number: ");
            number = inp.nextInt();

            if (number > max) {
                min = max;
                max = number;
            }else {
                if (min > number) {
                    min = number;
                }
            }
        }

        System.out.println("Max Number: " + max);
        System.out.println("Min Number: " + min);
    }
}
