import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Name");
        list1.add("Name");
        list1.add("Name2");

        Iterator itr=list1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
            System.out.println(itr.next());
            System.out.println("!");
        }


    }
}
