import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args) {
        String username, pass, existPass = "1234";

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Password: ");
        pass = input.nextLine();

        if (username.equals("java") && pass.equals(existPass)) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Failed! Do you want to reset your password?");
            System.out.println("1-Yes\n2-No");

            System.out.print("your answer: ");
            byte answer = input.nextByte();

            if (answer == 1) {
                Scanner input2 = new Scanner(System.in);

                System.out.print("Please enter the new password: ");
                String newPass = input2.nextLine();

                System.out.println(newPass.equals(existPass));

                if (newPass.equals(existPass)) {
                    System.out.println("Failed");
                }else {
                    System.out.print("Success! You new password: "+ newPass);
                }
            } else if (answer == 2) {
                System.out.print("See you again");
            } else {
                System.out.println("Please, choose 1 or 2");
            }

        }
    }
}
