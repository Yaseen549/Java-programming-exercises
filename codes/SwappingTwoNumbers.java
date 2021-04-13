import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Swapping Application");
        System.out.println("Enter you first number");
        int first_number = scanner.nextInt();
        System.out.println("Enter you second number");
        int second_number = scanner.nextInt();

        System.out.println("Number before swapping");
        System.out.println("First Number: " + first_number);
        System.out.println("Second Number: " + second_number);

        int temp;
        temp = first_number;
        first_number = second_number;
        second_number = temp;

        System.out.println("Number After swapping");
        System.out.println("First Number: " + first_number);
        System.out.println("Second Number: " + second_number);



    }
}
