package FichaPraticaExtra2;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = 31, userGuess, userTry;

        System.out.print("Adivinhe o numero (1-100): ");
        userGuess = input.nextInt();

        if (userGuess == number) {
            System.out.println("Boa! Ganhaste o jogo!");

        } else if (userGuess < number) {
            System.out.println("Muito baixo");
            System.out.print("Adivinhe o numero (1-100): ");
            userGuess = input.nextInt();

            if (userGuess != number) {
                System.out.println("Ficaste sem tentativas: ");
            } else {
                System.out.println("Boa! Ganhaste o jogo!");
            }

        } else {
            System.out.println("Muito alto");
            System.out.print("Adivinhe o numero (1-100): ");
            userGuess = input.nextInt();

            if (userGuess != number) {
                System.out.println("Ficaste sem tentativas: ");
            } else {
                System.out.println("Boa! Ganhaste o jogo!");
            }
        }
    }
}
