public class FizzBuzzWithPrime{

    public static boolean isPrime(int number) {
        if(number < 2){
            return false;
        }
        for(int a = 2; a < number; a++){
            if(number % a == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /* Fizz Buzz */
        for(int i = 1; i<=100; i++){
            if(isPrime(i)){
                System.out.println("prime");
            }
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}