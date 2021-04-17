public class Student {
    private String name;
    private String surname;
    private String email;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }


    // constructors are not static and without return type
    /* --- Default Constructor --- */
    // Default constructors will run automatically
//    public Student(){
//        System.out.println("I am a default constructor");
//    }
}
