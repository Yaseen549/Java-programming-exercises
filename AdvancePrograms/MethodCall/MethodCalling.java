public class MethodCalling {
    public static void main(String[] args) {

        String rev = reverseString("ABC");
        boolean palindrome = isPalindrome("ABA");
        int randomNumbers = randBetween(10,20);

        System.out.println(rev);
        System.out.println(palindrome);
        System.out.println(randomNumbers);

    }

    static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static boolean isPalindrome(String str){
        String original;  // Objects of String class
        StringBuilder reverse = new StringBuilder();
        original = str;
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(original.charAt(i));
        return original.equals(reverse.toString());
    }

    static int randBetween(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

}
