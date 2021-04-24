import java.util.Iterator;
import java.util.Vector;

public class Vector {
    public static void main(String[] args) {

        Vector<String> stack = new Vector<>();

        stack.add("Name");
        stack.add("Name");
        stack.add("Name2");

        /* Not able to push, only add
            stack.push("Push Name");
            stack.push("Push Name");
            stack.push("Push Name2"); */


        Iterator<String> itr=stack.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove(); //
            System.out.println("!");
        }
    }
}
