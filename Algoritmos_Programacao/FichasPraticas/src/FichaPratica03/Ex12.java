package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,
                firstQuarter = 0,
                secondQuarter = 0,
                thirdQuarter = 0,
                fourthQuarter = 0;


        do {
            System.out.print("Introduza um numero: ");
            number = input.nextInt();
            if (number < 0) {
                System.out.println("Fechar linha de comandos");
            } else if (number <= 25) {
                firstQuarter++;
            } else if (number <= 50) {
                secondQuarter++;
            } else if (number <= 75) {
                thirdQuarter++;
            } else if (number <= 100) {
                fourthQuarter++;
            }

        }
        while (number > 0);


        System.out.println("- [00,25]: " + firstQuarter);
        System.out.println("- [26,50]: " + secondQuarter);
        System.out.println("- [51,75]: " + thirdQuarter);
        System.out.println("- [76,100]: " + fourthQuarter);


    }
}

