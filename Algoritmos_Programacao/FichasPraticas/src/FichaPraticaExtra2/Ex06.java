package FichaPraticaExtra2;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double year,

        System.out.print("Introduza o ano: ");
        year = input.nextInt();


        if (year % 4 == 0) {
            System.out.println("E bissexto");
        } else {
            System.out.println("Nao é bissexto");
        }
    }
}
