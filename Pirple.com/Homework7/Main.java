public class Main {
    public static void main(String[] args) {

        Cars cars = new Cars("Maruthi", "M1","2021",250 );
        Cars cars1 = new Cars("Suzuki", "1-1-5","2020",356 );
        Cars cars2 = new Cars("BMW", "class-1","2020",430 );
        Cars cars3 = new Cars("Audi", "000","2021",280 );
        boolean a = cars.Drive();
        boolean isTrue = false;

        for(int i=0; i<=100; i++){
            cars.tripsSinceMaintenance++;
            a = true;
        }

        if(a){
            isTrue = cars.needMaintenance;
        }
        System.out.println(isTrue);

        System.out.println(cars.name);
        System.out.println(cars.year);
        System.out.println(cars.model);
        System.out.println(cars.weight + "\n");

        System.out.println(cars1.name);
        System.out.println(cars1.year);
        System.out.println(cars1.model);
        System.out.println(cars1.weight + "\n");

        System.out.println(cars2.name);
        System.out.println(cars2.year);
        System.out.println(cars2.model);
        System.out.println(cars2.weight + "\n");

        System.out.println(cars3.name);
        System.out.println(cars3.year);
        System.out.println(cars3.model);
        System.out.println(cars3.weight + "\n");



    }
}
