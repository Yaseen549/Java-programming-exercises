import java.util.Scanner;

public class AgeControlApplication {
    public static void main(String[] args) {

//        and &&
//        not equal !=

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Age Control Application!");
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age>18 && age <50){
            System.out.println("You are an adult");
        }
        else if(age>13 && age<18){
            System.out.println("You are teenager");
        }
        else if(age>50 && age<100){
            System.out.println("You are so old!");
        }

    }
}


// psvm means our main method
// sout means I want to print something


// byte (numeric, 1 byte)
// short(number, 2 bytes)
// int(number, 4 bytes)
// long(number, 8 bytes)
// float(float number, 4 bytes)
// double(decimal number, 8 bytes)
// char (character, 2 bytes)
// char c = 65 stores ASCII Values
// boolean(True or False, 1 byte)

// Widening Casting (Automatically)- Converting a smaller type to a larger type size
//    byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (Manually) - Converting a larger type to a smaller type size
//    double -> float -> long -> int -> char -> short -> byte
//      Will lose data eg; int b = (int)4.5;


