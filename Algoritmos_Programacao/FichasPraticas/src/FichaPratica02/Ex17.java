package FichaPratica02;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance, credit = 0;
        System.out.print("Introduza um salario: ");
        balance = input.nextInt();

        if (balance <= 2000) {
            System.out.println("Saldo médio: " + balance + " €");
            System.out.println("Crédito especial: " + credit + " €");
        } else if (balance <= 4000) {
            credit = balance * 0.2;
            System.out.println("Saldo médio: " + balance + " €");
            System.out.println("Crédito especial: " + credit + " €");
        } else if (balance <= 6000) {
            credit = balance * 0.3;
            System.out.println("Saldo médio: " + balance + " €");
            System.out.println("Crédito especial: " + credit + " €");
        } else {
            credit = balance * 0.4;
            System.out.println("Saldo médio: " + balance + " €");
            System.out.println("Crédito especial: " + credit + " €");
        }
    }
}
