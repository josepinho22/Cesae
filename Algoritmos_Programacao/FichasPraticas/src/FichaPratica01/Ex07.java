package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2, num3, result;

        System.out.print("Introduza um artigo: ");
        num1 = input.nextDouble();

        System.out.print("Introduza outro artigo: ");
        num2 = input.nextDouble();

        System.out.print("Introduza outro artigo: ");
        num3 = input.nextDouble();

        result = (num1 +num2+num3)*0.9;
        System.out.println("O preço é: " + result);
    }
}