import java.util.Scanner;

public class BankingApplicationUsingWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Operations:");
        System.out.println("1: Put money in account");
        System.out.println("2: Take money from account");
        System.out.println("3: Exit");

        int operation = scanner.nextInt();


        while(true){
            if(operation == 1){
                System.out.print("Enter your balance: ");
                int balance = scanner.nextInt();
                System.out.print("How much money you want to put?: ");
                int put_money = scanner.nextInt();
                System.out.println("You Balance: " + ( balance + put_money ));
                break;
            }
            else if(operation == 2){
                System.out.print("Enter your balance: ");
                int balance = scanner.nextInt();
                System.out.print("How much money to withdraw?: ");
                int withdrawing_money = scanner.nextInt();
                if(balance<withdrawing_money){
                    System.out.println("Low Balance");
                }
                else{
                    System.out.println("You balance is: " + (balance-withdrawing_money));
                }
                break;
            }
            else if(operation == 3){

                System.out.println("Exiting from system...");
                break;
            }
        }
    }
}
