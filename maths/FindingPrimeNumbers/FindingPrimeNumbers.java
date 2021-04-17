public class FindingPrimeNumbers{

    public static boolean isPrime(int number) {
        for(int a = 2; a < number; a++){
            if(number % a == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        for(int b = 2; b<100;b++){
            if(isPrime(b)){
                System.out.println(b);
            }
        }

    }
}