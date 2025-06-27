import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        int num1, num2;
        char operator;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input 2 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.print("Choose an operation(/, *, +, -): ");
        operator = sc.next().charAt(0);

        if(num2 == 0 && operator == '/'){
            System.out.println("Error cannot be multplied by zero.");
            return;
        }

        switch (operator) {
            case '+':
                 operator addition = new operator(num1, num2);
                System.out.println(addition.add());
                break;
            case '-':
                 operator subtraction = new operator(num1, num2);
                System.out.println(subtraction.minus());
                break;
            case '*':
                operator multiplication = new operator(num1, num2);
                System.out.println(multiplication.multiply());
                break;
            case '/':
                operator division = new operator(num1, num2);
                System.out.println(division.divide());
                break;
            default:
                break;
        }
    }
}
