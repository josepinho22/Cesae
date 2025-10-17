package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limit, prev, current;
        boolean rising = true;

        System.out.print("Quantos numeros deseja inserir: ");
        limit = input.nextInt();


        System.out.print("Insira um numero: ");
        prev = input.nextInt();

        for (int i = 0; i < limit - 1; i++) {
            System.out.print("Insira um numero: ");
            current = input.nextInt();

            if (current <= prev) {
                rising = false;
            }

            prev = current;
        }

        if (rising) {
            System.out.println("Crescente");
        } else {
            System.out.println("Nao Crescente");
        }
    }
}
