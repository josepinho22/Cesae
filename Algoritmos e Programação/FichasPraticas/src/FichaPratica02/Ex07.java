package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        if(num1%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
