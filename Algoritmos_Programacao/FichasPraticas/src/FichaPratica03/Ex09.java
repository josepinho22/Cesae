package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, counter = 0;
        double mean;


        do {
            System.out.print("Introduza um numero: ");
            number = input.nextInt();
            if (number != -1) {
                sum += number;
                counter++;
            }

        }
        while (number != -1);


        mean = (double) sum / counter;
        System.out.println("Media = " + mean);

    }
}
