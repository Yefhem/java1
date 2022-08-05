import java.util.Scanner;

public class loopExam02 {
    public static void main(String[] args) {
        int x, total=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter the number: ");
            x = input.nextInt();

            if ((x%2==0) && (x%4==0)){
                total += x;
            }

        }while (x%2==0);

        System.out.println("Total: "+total);

    }
}
