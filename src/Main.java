import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float operand1 = (float) scanner.nextInt();
        while (true) {
            operand1 = Calculator.calOperation(scanner, operand1);
     
        }
    }
}


