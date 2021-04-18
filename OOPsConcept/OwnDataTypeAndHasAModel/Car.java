public class Car {

    private String name;
    private Engine engine;
    private Model model;

    public Car(String name, Engine engine, Model model) {
        this.name = name;
        this.engine = engine;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
