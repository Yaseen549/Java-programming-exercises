import java.util.Scanner;

public class RegistrationApplication{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to registration");

        String username = "EnterYourNameHere";
        String password = "EnterYourOwnPasswordHere";

        String default_username = "mike";
        String default_password = "1234";
        int pass = 3;

        System.out.println("For sample");
        System.out.println("-------------------");
        System.out.println("Username: mike");
        System.out.println("Password: 1234");
        System.out.println("-------------------");

        /*enable below code when you are ready to implement your own modified inputs/outputs */
        /*
        while (true) {

            System.out.println("Enter your UserName: ");
            String uname = scanner.nextLine();
            System.out.println("Enter your Password: ");
            String pwd = scanner.nextLine();

            if (username.equals(uname) && password.equals(pwd)) {
                System.out.println("Welcome");
                break;
            } else if (!(username.equals(uname)) && password.equals(pwd)) {
                System.out.println("Username is Error");
                pass -= 1;
            } else if (username.equals(uname)) {
                System.out.println("Wrong Password");
                pass -= 1;
            } else {
                System.out.println("User Not Exist");
                pass -= 1;
            }

            if(pass == 0){
                System.out.println("You have attempted 3 Wrong passwords!");
                break;
            }
        }

 */

        /* default email and password */
        // Disable below code and enable the above code for original codes.
        while (true) {

            System.out.println("Enter your UserName: ");
            String uname = scanner.nextLine();
            System.out.println("Enter your Password: ");
            String pwd = scanner.nextLine();

            if (default_username.equals(uname) && default_password.equals(pwd)) {
                System.out.println("Welcome");
                break;
            } else if (!(default_username.equals(uname)) && default_password.equals(pwd)) {
                System.out.println("Username is Error");
                pass -= 1;
            } else if (default_username.equals(uname)) {
                System.out.println("Wrong Password");
                pass -= 1;
            } else {
                System.out.println("User Not Exist");
                pass -= 1;
            }

            if(pass == 0){
                System.out.println("You have attempted 3 Wrong passwords!");
                break;
            }
        }
    }
}
