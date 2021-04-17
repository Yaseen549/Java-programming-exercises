public class EmployeeApplicaitonMain{

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Yaseen", "Sheriff", 22, "Java");
        programmer.showInfo();
        programmer.work();

        CEO ceo = new CEO("Yaseen", "Sheriff", 22, 1000);
        ceo.showInfo();
        ceo.work();


    }
}