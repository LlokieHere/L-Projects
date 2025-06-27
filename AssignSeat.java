import java.util.Scanner;

public class AssignSeat {
    public void assign(int startRow, int endRow, int columns, char[][] seatArr, Scanner scanner){
        System.out.println();

        // Print column headers: A, B, C...
        System.out.printf("%-12s", " "); // Empty corner space
        for (int j = 0; j < columns; j++) {
            System.out.printf("%-12c", (char) ('A' + j));
        }
        System.out.println();

        // Print seat grid row by row
        for (int i = startRow; i <= endRow; i++) {
            System.out.printf("%-12s", "Row " + (i + 1));
            for (int j = 0; j < columns; j++) {
                System.out.printf("%-12c", seatArr[i][j]);
            }
            System.out.println();
        }

        int row, column;
        boolean validity = false;

        do{
            System.out.print("Select row(1/2): ");
            row = scanner.nextInt();

            System.out.print("Select column(A/B/C...): ");
            column = Character.toUpperCase(scanner.next().charAt(0));

            int intColumn = column - 65;

    
            if(seatArr[row][intColumn] == 'X'){
                System.out.println("Seat is already taken." + "\n" +
                                    "Please choose another one" );
            } else {
                seatArr[row][intColumn] = 'X';
                validity = true;
                System.out.println();
            }

        }while(!validity);
    }
}
