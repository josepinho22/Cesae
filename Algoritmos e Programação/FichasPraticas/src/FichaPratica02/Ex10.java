package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        String operation;
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.print("Introduza um numero: ");
        num2 = input.nextInt();

        System.out.print("Introduza o simbolo para a operacao desejada: ");
        operation = input.next();

        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case "-":
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case "/":
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case "*":
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            default:
                System.out.println("Erro. Operaçao invalida!");
        }
    }
}
