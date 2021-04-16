abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}

// ----------------------------------------
//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike extends CycleTrack{
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
abstract class CycleTrack{
    CycleTrack(){System.out.println("Am a Cycle Track");}
    abstract void run();
    void TrackChange(){
        System.out.println("Hello am a rack");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("running safely..");}
}

// ----------------------------------------

class AbstractClassWithConstructor{
    public static void main(String args[]){
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");

        // -------------
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();

        CycleTrack newObj = new Honda();
        newObj.run();
        newObj.TrackChange();
        // -------------
    }
}
