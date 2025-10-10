package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        System.out.print("Introduza outro numero: ");
        num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
