public class Main {
    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void sayHello() {
                System.out.println("Hello there!");
            }
        };

        abstractClass.prints();
        abstractClass.sayHello();

        SubClass subClass = new SubClass();
        subClass.sayHello();
        subClass.prints();

        SubClass2 subClass2 = new SubClass2();
        subClass2.sayHello();
        subClass2.prints();


    }
}

/*
* Abstract class  is like between inheritance and interface
* we can declare both body and non body methods
* Atleast we have to have one method without body
*
* */