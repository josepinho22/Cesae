package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cashAmount, movement;

        System.out.print("Introduza o seu saldo: ");
        cashAmount = input.nextInt();

        System.out.print("Introduza o valor a movimentar: ");
        movement = input.nextInt();

        if (movement + cashAmount < 0) {
            System.out.println("Operaçao invalida. Saldo insuficiente");
            System.out.println("Saldo atual: " + cashAmount);
        } else {
            cashAmount += movement;
            System.out.println("Saldo Atual: " + cashAmount);
        }

    }
}
