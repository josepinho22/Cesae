package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value1, value2, x;
        System.out.print("Introduza o primeiro valor: ");
        value1 = input.nextInt();

        System.out.print("Introduza o segundo valor: ");
        value2 = input.nextInt();

        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;

        System.out.println("Valor 1: " + value1);
        System.out.println("Valor 2: " + value2);
    }

}
