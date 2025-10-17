package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean primo = true;

        System.out.print("Escolha um numero : ");
        num = input.nextInt();


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // Deixa de ser primo
                primo = false;
            }
        }

        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }

    }
}
