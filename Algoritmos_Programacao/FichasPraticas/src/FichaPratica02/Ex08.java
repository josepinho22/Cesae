package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double value1, value2, value3;
        double mean, weightedAverage;
        System.out.print("Introduza o primeiro valor (1-20): ");
        value1 = input.nextDouble();

        System.out.print("Introduza o segundo valor (1-20): ");
        value2 = input.nextDouble();


        System.out.print("Introduza o terceiro valor (1-20): ");
        value3 = input.nextDouble();

        weightedAverage = value1 * 0.25 + value2 * 0.35 + value3 * 0.4;
        System.out.println("A média ponderada é: " + weightedAverage);
        if (weightedAverage > 9.5) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
    }
}
