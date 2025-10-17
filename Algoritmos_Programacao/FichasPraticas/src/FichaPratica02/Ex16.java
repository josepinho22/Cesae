package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor em euros (múltiplo de 5): ");
        int choice = input.nextInt();
        int bill200 = 0, bill100 = 0, bill50 = 0, bill20 = 0, bill10 = 0, bill5 = 0;

        System.out.println(choice);

        if (choice >= 200) {
            bill200 = choice / 200;
            choice = choice % 200;
            System.out.println("Notas de 200€: " + bill200);
        }
        if (choice >= 100) {
            bill100 = choice / 100;
            choice = choice % 100;
            System.out.println("Notas de 100€: " + bill100);
        }
        if (choice >= 50) {
            bill50 = choice / 50;
            choice = choice % 50;
            System.out.println("Notas de 50€: " + bill50);

        }
        if (choice >= 20) {
            bill20 = choice / 20;
            choice = choice % 20;
            System.out.println("Notas de 20€: " + bill20);

        }
        if (choice >= 10) {
            bill10 = choice / 10;
            choice = choice % 10;
            System.out.println("Notas de 10€: " + bill10);

        }
        if (choice >= 5) {
            bill5 = choice / 5;
            choice = choice % 5;
            System.out.println("Notas de 5€: " + bill5);
        }
    }
}
