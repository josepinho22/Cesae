package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("Introduza o simbolo para a operacao desejada: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Criar");
                break;
            case 2:
                System.out.println("2. Atualizar");
                break;
            case 3:
                System.out.println("3. Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("Erro. Operaçao invalida!");
        }
    }
}
