package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Introduza um numero de inicio: ");
        number = input.nextInt();



        for (int i = number - 5; i <= number + 5; i++) {
            System.out.println(i);
        }
    }
}
