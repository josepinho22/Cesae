package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza o seu lugar na corrida: ");
        int position = input.nextInt();
        switch (position){
            case 1:
                System.out.println("Ganhou 10 Pontos");
                break;
            case 2:
                System.out.println("Ganhou 8 Pontos");
                break;
            case 3:
                System.out.println("Ganhou 6 Pontos");
                break;
            case 4:
                System.out.println("Ganhou 5 Pontos");
                break;
            case 5:
                System.out.println("Ganhou 4 Pontos");
                break;
            case 6:
                System.out.println("Ganhou 3 Pontos");
                break;
            case 7:
                System.out.println("Ganhou 2 Pontos");
                break;
            case 8:
                System.out.println("Ganhou 1 Ponto");
                break;
            default:
                System.out.println("Nao ganhou pontos");
        }
    }
}
