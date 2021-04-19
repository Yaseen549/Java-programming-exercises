import java.util.Scanner;

public class MiniElevatorProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String elevatorA = "A";
        String elevatorB = "B";

        int current_elevator_no = 0;
        int seconds = 0;

        String[] list = {"Enter 11 to exit\n","-1","0","1","2","3","4","5","6","7","8","9","10", "\nEnter '00' for emergency exit"};

        System.out.println("Enter elevator Name: (A or B)");
        String elevator_name;


        boolean isTrue= false;

        while(true){
            elevator_name = scanner.nextLine();
            if(elevator_name.equals("A") || elevator_name.equals("B")){
                isTrue = true;
                break;
            }else{
                System.out.println("Please enter into correct elevator: ");
            }

        }

        while(isTrue){

            System.out.println( "-------------------------\n"+"1. Move to a different floor\n" + "2. Open doors\n" + "3. Close doors");

            System.out.println("Current elevator Number: " + current_elevator_no);

            int buttonNumber = scanner.nextInt();

            if(buttonNumber == 2){
                System.out.println(elevator_name + ": open doors");
            }else if(buttonNumber == 3){
                System.out.println(elevator_name + ": close doors");
            }else if(buttonNumber == 1){
                for (String i:list) {
                    System.out.print(i + " ");
                }
                System.out.println("\nfloor no:");
                int floor_no = scanner.nextInt();

                if(floor_no == 00){
                    System.out.println("Emergency, get out of the elevator!");
                    break;
                }else if(floor_no == 11){
                    System.out.println("Elevator door opened!");
                    break;
                }
                else if(current_elevator_no == floor_no){
                    System.out.println(elevator_name + ": close doors");
                    System.out.println(elevator_name + ": Current floor 🚫");
                    System.out.println(elevator_name + ": open doors");
                }else if(floor_no == 10 && elevator_name.equals(elevatorA)){
                        System.out.println("You cannot go to floor 10, reach out to elevator B");
                }
                else if(floor_no == -1 && elevator_name.equals(elevatorB)){
                    System.out.println("You cannot go to basement floor, reach out to elevator A");
                }else if(floor_no < current_elevator_no){

                    seconds = current_elevator_no - floor_no;
                    current_elevator_no = floor_no;
                    System.out.println(elevator_name + ": move to " + current_elevator_no + " (" + seconds + " seconds)");

                }else if(floor_no > current_elevator_no){

                    seconds = floor_no - current_elevator_no;
                    current_elevator_no = floor_no;
                    System.out.println(elevator_name + ": move to " + current_elevator_no + " (" + seconds + " seconds)");
                    System.out.println(elevator_name + ": open doors");

                }
            }
        }
    }
}

