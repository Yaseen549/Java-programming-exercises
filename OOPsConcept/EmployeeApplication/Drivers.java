public class Drivers extends Employee{

    private int cars;
    public Drivers(String name, String surname, int age, int cars) {
        super(name, surname, age);
        this.cars = cars;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cars: " + cars);
    }
}
