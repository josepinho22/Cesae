package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();
        if (num1<num2){
            System.out.print(num1 + " " + num2);
        } else {
            System.out.println( num2 + " " + num1);
        }
    }
}
