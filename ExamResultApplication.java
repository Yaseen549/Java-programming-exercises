import java.util.Scanner;

public class ExamResultApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Exam Result Application!");

        System.out.println("Enter your 1st exam result: "); // eg: 50
        int first_result = scanner.nextInt();

        System.out.println("Enter your 2nd exam result: ");  // eg: 90
        int second_result = scanner.nextInt();

        if(first_result>50 && second_result >50){
            System.out.println("You got best college degree!");
        }
        // first_result = 55
        // second_result = 40
        else if(first_result>50 || second_result>50){
            System.out.println("You got normal college degree!");
        }
        else{
            System.out.println("You can not have college degree!");
        }

    }
}
