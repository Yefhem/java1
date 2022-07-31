import java.util.Scanner;

public class gradeAvarage {
    public static void main(String[] args) {
        int math,physics,chemical,turkish,history,music,total;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("your math grade: ");
        math = input.nextInt();

        System.out.print("your physics grade: ");
        physics = input.nextInt();

        System.out.print("your chemical grade: ");
        chemical = input.nextInt();

        System.out.print("your turkish grade: ");
        turkish = input.nextInt();

        System.out.print("your history grade: ");
        history = input.nextInt();

        System.out.print("your music grade: ");
        music = input.nextInt();

        total = math + physics + chemical + turkish + history + music;
        result = total / 6.0;

        System.out.println("your average: "+result);

        String status = result > 60 ? "Pass" : "Fail";

        System.out.println(status);
    }
}
