import java.util.Scanner;

public class StringMethods{

    public static void main(String[] args) {
        /* String Methods
        * .toUpperCase, .toLowerCase, .trim, .equals, .equalsIgnoreCase()
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender:");
        String gender = sc.nextLine();
        if (gender.equalsIgnoreCase("male")){
            System.out.println("You are male!");
        }
        else {
            System.out.println("You are female");
        }

    }
}