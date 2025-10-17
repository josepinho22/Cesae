package FichaPraticaExtra1;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseNumber, powerNumber, result = 1;

        System.out.print("Insira o primeiro numero: ");
        baseNumber = input.nextInt();

        System.out.print("Insira o segundo numero: ");
        powerNumber = input.nextInt();

        for (int i = 0; i < powerNumber; i++) {
            result *= baseNumber;
        }

        System.out.println("Primeiro numero: " + baseNumber);
        System.out.println("Segundo numero: " + powerNumber);
        System.out.println("Resultado: " + result);




    }
}
