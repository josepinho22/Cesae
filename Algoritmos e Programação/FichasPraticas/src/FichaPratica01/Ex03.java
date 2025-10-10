package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sideA, sideB, area, perimeter;

        System.out.print("Introduza o comprimento do retangulo: ");
        sideA = input.nextInt();

        System.out.print("Introduza o largura do retangulo: ");
        sideB = input.nextInt();

        area = sideA * sideB;

        System.out.println("A area é: " + area);

        perimeter = sideA * 2 + sideB * 2;

        System.out.println("O perimetro é: " + perimeter);

    }
}
