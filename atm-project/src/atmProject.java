import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        String username, password;
        int right = 3;
        int total = 2000;
        int select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Enter the username: ");
            username = input.nextLine();
            System.out.print("Enter the password: ");
            password = input.nextLine();

            if (username.equals("apple") && password.equals("123")){
                System.out.println("Login successful");
                System.out.println("Welcome " + username + " what do you want?");
                do {
                    System.out.println("Options:\n1-Add Money\n2-Withdraw\n3-Balance Inquiry\n4-Exit");
                    System.out.print("Your Value: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Price: ");
                            int price = input.nextInt();
                            total += price;
                            System.out.println("Your Balance: "+total);
                            break;
                        case 2:
                            System.out.print("Price: ");
                            price = input.nextInt();
                            if (price > total) {
                                System.out.println("Insufficient Balance");
                            }else {
                                total -= price;
                                System.out.println("Your Balance: "+total);
                            }
                            break;
                        case 3:
                            System.out.println("Your Balance: "+total);
                            break;
                    }

                }while (select != 4);
                System.out.println("See you later");
                break;
            }else {
                right--;
                System.out.println("Login failed");
                if (right == 0) {
                    System.out.println("Account is blocked!");
                }else {
                    System.out.println("The trial you have: " + right);
                }
            }
        }
    }
}
