package Main;

import java.util.*;

public class CollectionLists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<Integer> linkedList = new LinkedList<Integer>();
        List<String> vector = new Vector<String>();
        Stack<Double> stack = new Stack<Double>();

        arrayList.add("Ajay");
        arrayList.add("Ajay");
        arrayList.add("Sanjay");
        arrayList.add("Vijay");

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);

        vector.add("Ayush");
        vector.add("Piyush");
        vector.add("Rajesh");
        vector.add("Mukesh");

        stack.push(1.2);
        stack.push(1.2);
        stack.push(1.3);
        stack.push(1.4);





        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        for (String s : arrayList) {
//            System.out.println(s);
//        }

        Iterator iterator1 = linkedList.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        Iterator<String> iterator2 = vector.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        Iterator<Double> iterator3 = stack.iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

    }
}