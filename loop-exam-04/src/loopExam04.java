import java.util.Scanner;

public class loopExam04 {
    public static void main(String[] args) {

        int facNum, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        facNum = input.nextInt();

        while (facNum > 1) {
            total *= facNum;
            facNum--;
        }

        System.out.print("Factorial number: "+total);
    }
}
