public class SimpleBankingApplication{

    public static void main(String[] args) {

        Account accountOne = new Account("Sam", "Anderson", "sam@gmail.com", 2000, 123456789, "987654321");

        System.out.println(accountOne.getName());

        accountOne.depositMoney(500);
        accountOne.withdrawMoney(250);


    }
}