package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit, jump;

        System.out.print("Introduza um limite: ");
        limit = input.nextInt();

        System.out.print("Introduza um salto: ");
        jump = input.nextInt();


        for (int i = 0; i < limit;i+= jump) {
            System.out.println(i);
        }

    }
}
