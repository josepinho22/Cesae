package FichaPraticaExtra2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double userWeight, moonWeight;

        System.out.print("Indique o seu peso ( Kg ): ");
        userWeight = input.nextInt();


        if (userWeight > 0) {
            moonWeight = userWeight * 0.16;
            System.out.println("Peso na lua: " + moonWeight + " Kg");
        } else {
            System.out.println("Peso Incorrecto");
        }
    }
}
