import java.util.Scanner;

public class StudentGrade {
    static final int MAX_STUDENTS = 50;
    static Student[] students = new Student[MAX_STUDENTS];
    static int studentCount = 0;
    static final int SUBJECTS = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Grades");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // clear newline

            switch (choice) {
                case '1' -> addStudent();
                case '2' -> showStudents();
                case '3' -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != '3');
    }

    // Add a student and store them as an object
    static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Roster full!");
            return;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] grades = new int[SUBJECTS];
        for (int i = 0; i < SUBJECTS; i++) {
            System.out.print("Enter grade for Subject " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        sc.nextLine(); // clear newline

        students[studentCount] = new Student(name, grades); // create object
        studentCount++;
        System.out.println("✓ Student added.");
    }

    // Show all students and their grades
    static void showStudents() {
        if (studentCount == 0) {
            System.out.println("No students yet.");
            return;
        }

        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo(); // call method from Student class
        }
    }
}
