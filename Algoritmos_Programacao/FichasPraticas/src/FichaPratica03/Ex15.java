package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,
            total = 1;

        System.out.print("Introduza um numero inteiro positivo: ");
        number = input.nextInt();


        for (int i = number; i > 0;i--) {
            total *=i;
        }
        System.out.println(total);
    }
}
