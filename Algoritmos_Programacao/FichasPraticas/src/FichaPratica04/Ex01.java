package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value1, value2;
        double result;
        String operation, resume;

        do {
            System.out.print("Introduza um numero: ");
            value1 = input.nextInt();
            System.out.print("Introduza outro numero: ");
            value2 = input.nextInt();

            System.out.print("Indica qual das operacoes aritmeticas deseja efetuar (+, -, *, /): ");
            operation = input.next();


            switch (operation) {
                case "+":
                    result = value1 + value2;
                    System.out.println("Resultado: " + result);
                    break;
                case "-":
                    result = value1 - value2;
                    System.out.println("Resultado: " + result);
                    break;
                case "/":
                    result = value1 / value2;
                    System.out.println("Resultado: " + result);
                    break;
                case "*":
                    result = value1 * value2;
                    System.out.println("Resultado: " + result);
                    break;
                default:
                    System.out.println("Erro. Operaçao invalida!");
            }


            System.out.print("Deseja Continuar?(s/n): ");
            resume = input.next();

        } while (resume.equals("s"));
    }
}
