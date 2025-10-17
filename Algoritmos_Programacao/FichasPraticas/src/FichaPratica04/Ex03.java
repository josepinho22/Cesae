package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player1, player2, counter = 1;

        System.out.print("Player 2 Escolha um numero (1-100): ");
        player1 = input.nextInt();

        System.out.print("Player 2 Adivinhe o numero: ");
        player2 = input.nextInt();

        do {
            if (player2 < player1) {
                System.out.println("O seu numero é inferior ao esperado. ");
                System.out.print("Player 2 Tente outro numero: ");
                System.out.println();
                player2 = input.nextInt();
            } else {
                System.out.println("O seu numero é superior ao esperado. ");
                System.out.print("Player 2 Tente outro numero: ");
                System.out.println();
                player2 = input.nextInt();
            }
            counter++;
        }
            while (player1 != player2) ;

        System.out.println("Player 2 acertou no numero do Player 1: " + player1);
        System.out.println("Tentativas necessarias: " + counter);
    }
}
