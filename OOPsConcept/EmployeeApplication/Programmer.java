public class Programmer extends Employee{

    private String language;
    public Programmer (String name, String surname, int age, String language){
        super(name, surname, age);
        this.language = language;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Language: " + language);
    }
}
