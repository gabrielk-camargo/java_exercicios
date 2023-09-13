import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int number = 0;
        int number2 = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("""
                ========================================
                        Calculadora em Java
                         
                         +       =      1
                         -       =      2
                         X       =      3
                         /       =      4
                         
                ========================================
                """);
        System.out.print("Escolha: ");
        int mathematicalExpressions = input.nextInt();

        switch (mathematicalExpressions) {
            case 1 -> {
                number = getUserInput(input, "Primeiro número: ");
                number2 = getUserInput(input, "Segundo número: ");
                result = number + number2;
                System.out.printf(" A soma de %d + %d = %d%n", number, number2, result);
            }
            case 2 -> {
                number = getUserInput(input, "Primeiro número: ");
                number2 = getUserInput(input, "Segundo número: ");
                result = number - number2;
                System.out.printf("A subtração de  %d - %d = %d %n", number, number2, result);
            }
            case 3 -> {
                number = getUserInput(input, "Primeiro número: ");
                number2 = getUserInput(input, "Segundo número: ");
                result = number * number2;
                System.out.printf("A multiplicação de  %d * %d = %d %n", number, number2, result);
            }
            case 4 -> {
                number = getUserInput(input, "Primeiro número: ");
                number2 = getUserInput(input, "Segundo número: ");
                result = number / number2;
                System.out.printf("A divisão de  %d / %d = %d %n", number, number2, result);
            }
            default -> System.out.println("Escolha inválida.");
        }
    }

    public static int getUserInput(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }
}




