public class Student {
    private String name;
    private int[] grades;

    // Constructor
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Method to calculate average
    public double getAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? (double) sum / grades.length : 0;
    }

    // Method to display info
    public void displayInfo() {
        System.out.print("Name: " + name);
        for (int i = 0; i < grades.length; i++) {
            System.out.print(" | Subject " + (i + 1) + ": " + grades[i]);
        }
        System.out.printf(" | Average: %.2f\n", getAverage());
    }
}
