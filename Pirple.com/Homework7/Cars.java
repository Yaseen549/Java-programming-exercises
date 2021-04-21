public class Cars extends vehicle{

    boolean isDriving;

    public Cars(String name, String model, String year, double weight) {
        super(name, model, year, weight);
    }

    boolean Drive(){
        boolean isDriving = true;
        return isDriving;
    }

    boolean Stop(){
        boolean isDriving = false;
        return isDriving;
    }

}
