package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value1, value2, value3;
        double mean,weightedAverage;
        System.out.print("Introduza o primeiro valor: ");
        value1 = input.nextInt();

        System.out.print("Introduza o segundo valor: ");
        value2 = input.nextInt();


        System.out.print("Introduza o terceiro valor: ");
        value3 = input.nextInt();

        mean = (value1 + value2 + value3) / 3;
        System.out.println("A média é: " + mean);

        weightedAverage = value1*0.2 +value2*0.3+ value3*0.5;
        System.out.println("A média ponderada é: " + weightedAverage);
    }
}
