package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String message;

        System.out.print("Introduza um numero: ");
        choice = input.nextInt();

        System.out.print("Introduza uma mensagem: ");
        input.nextLine();
        message = input.nextLine();
         //Needs update because it's skipping line


        for (int i = 0; i < choice; i++) {
            System.out.println(message);
        }
    }
}
