package FichaPraticaExtra1;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, biggest, smallest;

        System.out.print("Escolha um numero: ");
        choice = input.nextInt();

        smallest = choice;
        biggest = choice;

        while (choice != 0) {
            if (choice > biggest) {
                biggest = choice;
            } else if (choice < smallest) {
                smallest = choice;
            }

            System.out.print("Escolha outro numero: ");
            choice = input.nextInt();
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Biggest: " + biggest);


    }

}
