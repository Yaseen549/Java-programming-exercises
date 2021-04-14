public class Whileloop {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            // i++; // <-- write this statement to make it 10
            System.out.println("My Program");
            System.out.println(i);
            i++; // <-- will make upto 9
        }



        // infinite loop
//        while(true){
//            System.out.println("infinity...");
//        }
        // ignore this loop, it may crash your program, system's memory or application

        // Additional Examples
        boolean b = true;
        int c = 0;
        while(b){
//            c++; // --> will increament +1 and then execute
            if(c>5){
                b=false;
            }
            c++; //  --> will execute and the increment +1
            System.out.println(c);
//            c++; // --> will execute all and the will increment at last

        }
    }
}
