package FichaPraticaExtra1;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice, sum = 0;

        System.out.print("Escolha um numero: ");
        choice = input.nextInt();

        while (choice != 0) {
            sum += choice % 10;

            choice /= 10;
        }

        System.out.println("Soma dos numeros= :" + sum);
    }
}
