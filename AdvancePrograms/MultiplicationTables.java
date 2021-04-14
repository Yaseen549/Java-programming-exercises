public class MultiplicationTables {
    public static void main(String[] args) {

        System.out.println("Multiplication Table");
        for(int i=1;i<=10;i++){
            System.out.println("----------");
            for(int j=1; j<=10;j++){
                System.out.println(i + " X " + j + " = " + (i*j));
            }
        }

    }
}
