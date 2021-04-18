import java.util.Arrays;

public class DataStructureArrays {
    public static void main(String[] args) {

        char[] alpha = new char[26];

        for (int i=0;i<26; i++){

            alpha[i] = (char)(65+i);
        }

        System.out.println(Arrays.toString(alpha));

    }
} 
