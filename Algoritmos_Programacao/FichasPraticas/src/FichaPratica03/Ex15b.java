package FichaPratica03;

import java.util.Scanner;

public class Ex15b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,
                total=1;

        System.out.print("Introduza um numero inteiro positivo: ");
        number = input.nextInt();


        for (int i = 2; i <= number; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += total;
            }
            total = sum;
        }
        System.out.println(total);
    }
}
