package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours,minutes;

        System.out.print("Introduza horas: ");
        hours = input.nextInt();

        System.out.print("Introduza horas: ");
        minutes = input.nextInt();

        if (hours>=12){
            hours-=12;
            System.out.printf("%d : %d PM", hours, minutes);
        } else {
            System.out.printf("%d : %d AM", hours, minutes);
        }
    }
}
