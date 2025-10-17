package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Introduza um numero de inicio: ");
        number = input.nextInt();

        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0){
            System.out.println(i);
            }
        }
    }
}
