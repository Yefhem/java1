import java.util.Scanner;

public class loopExam08 {
    public static void main(String[] args) {
        int number, i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        number = inp.nextInt(); // 10

        while (i <= number) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = (number * 2); k >= (i + i); k--){
                System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }




    }
}
