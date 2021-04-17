public class CEO extends Employee{

    private int workers;

    public CEO(String name, String surname, int age, int workers) {
        super(name, surname, age);
        this.workers = workers;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("No of workers: " + workers);
    }
}
