public class Student {

    public String name;
    public String surname;
    public String email;
    public int age;

    /* static and non static classes and methods */

    /*
     * Note:
     *  1. static is used for class and it is owned by class
     *  2. non static is for object
     */

    public static void create(){
        System.out.println("am a static method access via classes");
    }

    public void put(){
        System.out.println("Am a non static methods can be accessible only from objects");
    }


}
