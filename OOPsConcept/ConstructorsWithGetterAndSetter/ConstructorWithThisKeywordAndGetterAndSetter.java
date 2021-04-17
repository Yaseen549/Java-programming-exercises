public class ConstructorWithThisKeywordAndGetterAndSetter{

    public static void main(String[] args) {

        Student name = new Student();
        name.setName("FirstName");
        name.setSurname("SurName");

        String myName = name.getName();

        System.out.println(myName);
        System.out.println(name.getSurname());



    }
}