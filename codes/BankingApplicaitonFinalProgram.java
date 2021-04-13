import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Banking Application!");
        System.out.println("Our operations:");
        System.out.println("Click 1 for exiting from system");
        System.out.println("Click 2 for money transfer!");
        System.out.println("Click 3 to get money!");

        int operation = scanner.nextInt();

        if(operation == 1){
            System.out.println("Exiting from system... ");
        }
        else if(operation == 2){
            System.out.println("Please enter your balance: ");
            int balance = scanner.nextInt();
            System.out.println("Please enter how much money you want to transfer: ");
            int transfer_amount = scanner.nextInt();
            if(balance<transfer_amount){
                System.out.println("you can not do this operation");
            }
            else{
                System.out.println("Your new balance: " + (balance-transfer_amount));
            }
        }
        else if(operation == 3){
            System.out.println("Enter your balance: ");
            int balance = scanner.nextInt();
            System.out.println("How much money you want to get: ");
            int get_amount = scanner.nextInt();
            if(balance > get_amount){
                System.out.println("You cannot do this right now!");
            }
            else{
                System.out.println("Your new balance: " + (balance - get_amount));
            }


        }
        else{
            System.out.println("Invalid Operation!");
        }



    }
}
