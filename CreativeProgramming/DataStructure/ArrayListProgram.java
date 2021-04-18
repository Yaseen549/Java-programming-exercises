import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();

        System.out.println("Enter Strings: ");

        while(true){
            memory.add(reader.nextLine());

            if((memory.get(memory.size() - 1)).equals("clear"))
                memory.clear();
            else{
                if((memory.get(memory.size() - 1)).equals("end"))
                    break;
            }

            System.out.println(memory.toString());
        }

    }
} 
