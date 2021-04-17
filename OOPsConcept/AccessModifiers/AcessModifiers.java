public class AcessModifiers{

    public static void main(String[] args) {

        Student student = new Student();
        Student studentObject = new Student();

        student.name = "John";
        student.age = 22;
        student.email = "john1234@gmail.com";

        Student secondStudent = new Student();
        secondStudent.name = "Marko";

        Student thirdStudent = new Student();
        thirdStudent.name = "Henry";

        System.out.println(student.name + ", " + secondStudent.name + ", " + thirdStudent.name);

        Student.create();
        studentObject.put();

    }
}