import java.util.Scanner;

public class AirplaneSeat {
    static final int ROWS = 13; // Number of rows in the airplane
    static final int COLUMNS = 6; // Number of columns in the airplane
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] seats = new char[ROWS][COLUMNS];
        char choice = ' ' , type = ' ';
        int startRow = 0, endRow = 0;

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
            seats[i][j] = '*';

            }
        }
        do {
            System.out.println("-----------WELCOME TO OUR SEAT MANAGEMENT AIRLINE!-----------");
            System.out.println("1. View available seat" + "\n" 
                                +"2. Choose Ticket Type(" + "\n"
                                +"3. Desired seat" + "\n"
                                +"4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    display seat = new display();
                    seat.displaySeat(seats, ROWS, COLUMNS);
                    break;
                case '2':
                    System.out.println();
                    System.out.print("Choose a class(F/B/E): ");
                    type = Character.toUpperCase(scanner.next().charAt(0)); // Fix casing
                    System.out.println();

                    if (type == 'F'){ 
                        System.out.println("You chose first class!");
                        startRow = 0;
                        endRow = 1;
                        System.out.println();
                    }else if (type == 'B') {
                        System.out.println("You chose Business Class!");
                        startRow = 2;
                        endRow = 6; 
                        System.out.println();
                    }else if(type == 'E'){
                        startRow = 7; 
                        endRow = 12; 
                    }else{
                        System.out.println();
                        System.out.println("Invalid Input!");
                        System.out.println();
                    }
                    break;
                case '3':
                if (type == ' ') {
                    System.out.println("Please select a class type first");
                    break;
                }
                    AssignSeat assign = new AssignSeat();
                    assign.assign(startRow, endRow, COLUMNS, seats, scanner);
                    break;
                default:
                    break;
            }
        } while (choice != 4);
    }
}
