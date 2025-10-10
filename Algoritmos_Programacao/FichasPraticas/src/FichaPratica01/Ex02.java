package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;

        System.out.print("Introduza um numero: ");
        num1 = input.nextDouble();

        System.out.print("Introduza outro numero: ");
        num2 = input.nextDouble();

        //Soma

        result = num1 + num2;
        System.out.println("Soma: " + result);

        //Subtraçao
        result = num1 - num2;
        System.out.println("Subtraçao: " + result);

        //Multiplicaçao
        result = num1 * num2;
        System.out.println("Multiplicaçao: " + result);

        //Divisao
        result = num1 / num2;
        System.out.println("Divisao: " + result);
    }
}
