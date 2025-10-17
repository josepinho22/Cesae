package FichaPraticaExtra1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, reversed= 0, digit;

        System.out.print("Escolha um numero: ");
        number = input.nextInt();


        while (number != 0) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.print("Numero invertido: " + reversed);
    }
}
