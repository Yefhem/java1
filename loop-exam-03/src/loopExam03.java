import java.util.Scanner;

public class loopExam03 {
    public static void main(String[] args) {
        int x, a = 4, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        x = input.nextInt();

        for (i = 1; i <= x; i *= a) {
            System.out.println(i);
        }

        for (i = 1; i <= x; i *= a + 1) {
            System.out.println(i);
        }
    }
}
