import java.util.Scanner;

public class Calculator {
    static Float calOperation(Scanner scanner, Float operand1) {
        int i;
        int user1;
        char operation = scanner.next().charAt(0);
        Float operand2 = (float) 0;
        switch (operation) {
            case '+':
                operand2 = (float) (operand1 + scanner.nextInt());
                break;
            case '-':
                operand2 = (float) (operand1 - scanner.nextInt());
                break;
            case '*':
                operand2 = (float) (operand1 * scanner.nextInt());
                break;
            case '/':
                operand2 = ((float) operand1 / scanner.nextInt());
                break;
            default:
                System.out.println("Nedopustimui simvol");
                return (float) operand1;
        }
        System.out.println(Float.toString(operand2));
        return operand2;
    }
}

