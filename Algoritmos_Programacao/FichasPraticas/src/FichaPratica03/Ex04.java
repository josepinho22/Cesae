package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.print("Introduza um numero: ");
        choice = input.nextInt();

        for (int i = 0; i <= choice; i++) {
            System.out.println(i);
        }
    }
}
