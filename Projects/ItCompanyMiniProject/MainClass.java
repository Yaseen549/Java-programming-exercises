public class MainClass {
    public static void main(String[] args) {

        GameDeveloper gameDeveloper = new GameDeveloper("John", "Python", 25);
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper("Risk", "Java", 30);

        System.out.println(gameDeveloper);
        System.out.println(frontendDeveloper);

        System.out.println("----------------");

        gameDeveloper.writeCode();
        gameDeveloper.testCode();
        gameDeveloper.comeEarly();
        System.out.println("*----*----*----*----*----*----*----*");
        frontendDeveloper.writeCode();
        frontendDeveloper.testCode();
        frontendDeveloper.comeEarly();




    }
}


// Interfaces cannot have private keyword
// you cannot return empty return;, you can return null.x