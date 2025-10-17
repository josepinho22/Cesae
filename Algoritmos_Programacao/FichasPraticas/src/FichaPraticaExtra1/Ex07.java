package FichaPraticaExtra1;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, positive = 0, negative = 0;

        System.out.print("Escolha um numero: ");
        choice = input.nextInt();


        while (choice != 0) {
            if (choice > 0) {
                positive++;
            } else {
                negative++;
            }

            System.out.print("Escolha outro numero: ");
            choice = input.nextInt();
        }

        System.out.println("Negative numbers: " + negative);
        System.out.println("Positive numbers: " + positive);


    }
}

