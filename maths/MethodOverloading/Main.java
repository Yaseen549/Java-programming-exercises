public class Main{
    public static void main(String[] args) {
        
        /* Arithmetic operations */
        int add = Maths.addition(10,5);
        int sub = Maths.subtraction(10,5);
        int mul = Maths.multiplication(10,5);
        int div = Maths.division(10,5);
        int rem = Maths.reminder(10,5);

        /* Method Overloading */
        double add1 = Maths.addition(10,5, 2);
        double sub1 = Maths.subtraction(10,5,2);
        double mul1 = Maths.multiplication(10,5,2);
        double div1 = Maths.division(10,5,2);
        double rem1 = Maths.reminder(10,5,2);

        /* Arithmetic operations of two variables */
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);

        /* Arithmetic operations of three variables */
        System.out.println(add1);
        System.out.println(sub1);
        System.out.println(mul1);
        System.out.println(div1);
        System.out.println(rem1);

    }
}