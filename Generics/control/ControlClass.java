package control;

public class ControlClass {

    // E means I can give parameter whatever I want
    public static <E> void printArray(E[] arr){
        for (E a:arr) {
            System.out.println(a);

        }
    }
//    public static void printArray(double[] arr){
//        for (double a:arr) {
//            System.out.println(a);
//
//        }
//    }
//    public static void printArray(String[] arr){
//        for (String a:arr) {
//            System.out.println(a);
//
//        }
//    }
}
