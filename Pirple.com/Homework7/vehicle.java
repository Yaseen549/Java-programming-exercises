public class vehicle {

    String name;
    String model;
    String year;
    double weight;

    public vehicle(String name, String model, String year, double weight) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isNeedMaintenance() {
        return needMaintenance;
    }

    public void setNeedMaintenance(boolean needMaintenance) {
        this.needMaintenance = needMaintenance;
    }

    public int getTripsSinceMaintenance() {
        return tripsSinceMaintenance;
    }

    public void setTripsSinceMaintenance(int tripsSinceMaintenance) {
        this.tripsSinceMaintenance = tripsSinceMaintenance;
    }

    boolean needMaintenance = false;
    int tripsSinceMaintenance = 0;

    void Make(){
        System.out.println("Making " + name);
    }

    void Model(){
        System.out.println("Model: " + model);
    }

    void Year(){
        System.out.println("Year " + year);
    }

    void Weight(){
        System.out.println(weight + " Pounds");
    }

}
