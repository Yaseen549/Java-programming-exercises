import java.util.Stack;
import java.util.Iterator;

public class StackinList {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.add("Name");
        stack.add("Name");
        stack.add("Name2");

        stack.push("Push Name");
        stack.push("Push Name");
        stack.push("Push Name2");


        Iterator<String> itr=stack.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove(); //
            System.out.println("!");
        }
    }
}
