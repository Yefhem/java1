import java.util.Scanner;

public class loopExam01 {
    public static void main(String[] args) {

        int x, counter = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if ((i%3 == 0) && (i%5 == 0)){
                total += i;
                counter++;
            }
        }

        System.out.println("Result: "+(total/counter));
    }
}
