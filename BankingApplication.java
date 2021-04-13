import java.util.Scanner;

public class BankingApplication {
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
            System.out.println("You choose money transferring, you can transfer money");
        }
        else if(operation == 3){
            System.out.println("you can get money...");
        }



    }
}
