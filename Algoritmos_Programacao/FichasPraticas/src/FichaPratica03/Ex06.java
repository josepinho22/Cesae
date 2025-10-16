package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end;

        System.out.print("Introduza um numero de inicio: ");
        start = input.nextInt();

        System.out.print("Introduza um numero de fim: ");
        end = input.nextInt();


        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
