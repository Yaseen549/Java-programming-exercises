public class SubClass2 extends AbstractClass{

    @Override
    void sayHello() {
        System.out.println("I override sayHello method from Abstract class and am a sub class 2");
    }

    @Override
    void prints() {
        super.prints();
        System.out.println("and I am subclass 2 method");
    }
}
