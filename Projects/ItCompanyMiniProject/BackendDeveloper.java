public class BackendDeveloper implements ItCompany{

    private String name;
    private String language;
    private int age;

    public BackendDeveloper(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void writeCode() {
        System.out.println(name + " is a backend dev");

    }

    @Override
    public void comeEarly() {

        System.out.println(name+ " will come early for backend dev at this age, " + age);

    }

    @Override
    public void testCode() {

        System.out.println(name + " testing backend codes");
    }
}
