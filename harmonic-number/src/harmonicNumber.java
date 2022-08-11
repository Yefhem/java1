import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        int n;
        double total = 0, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = input.nextInt();

//        for (double i = 1; i <= n; i++) {
//            total += (1/i);
//        }

        while (i <= n){
            total += (1/i);
            i++;
        }

        System.out.println(total);
    }
}
