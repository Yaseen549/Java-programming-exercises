public class HasAComparison {
    public static void main(String[] args) {

        Model model = new Model("A-Class");
        Engine engine = new Engine("Mercedes-AMG");

        Car car = new Car("Benz", engine, model);

        System.out.println(car.getName());
        System.out.println(car.getEngine());
        System.out.println(car.getModel());

        System.out.println(car);

        System.out.println("\n");

        System.out.println(model.getModel());
        System.out.println(engine.getEngine());

        System.out.println(model);
        System.out.println(engine);


    }
} 
