import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Name");
        list1.add("Name");
        list1.add("Name2");

        Iterator<String> itr=list1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
            System.out.println("!");
        }
    }
}