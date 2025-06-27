//For Plane seat reservation

public class display {
    public void displaySeat(char[][] seat, int row, int column) {
        System.out.println();

        // Print column headers: A, B, C...
        System.out.printf("%-12s", " "); // Empty corner space
        for (int j = 0; j < column; j++) {
            System.out.printf("%-12c", (char) ('A' + j));
        }
        System.out.println();

        // Print seat grid row by row
        for (int i = 0; i < row; i++) {
            System.out.printf("%-12s", "Row " + (i + 1));
            for (int j = 0; j < column; j++) {
                System.out.printf("%-12c", seat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
