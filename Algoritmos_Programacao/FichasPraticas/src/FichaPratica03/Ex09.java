package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, counter = 0;
        double mean;
        System.out.print("Introduza um numero: ");
        number = input.nextInt();


        while (number != -1) {
            System.out.print("Introduza um numero: ");
            number = input.nextInt();
            sum += number;
            counter++;
        }

        mean = sum / counter;
        System.out.println("Media = " + mean);

    }
}
