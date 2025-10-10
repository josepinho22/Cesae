package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int minutes, seconds, hours;

        System.out.print("Introduza minutos da musica 1: ");
        minutes = input.nextInt();

        System.out.print("Introduza segundos da musica 1: ");
        seconds = input.nextInt();

        System.out.print("Introduza minutos da musica 2: ");
        minutes += input.nextInt();

        System.out.print("Introduza segundos da musica 2: ");
        seconds = input.nextInt();

        System.out.print("Introduza minutos da musica 3: ");
        minutes += input.nextInt();

        System.out.print("Introduza segundos da musica 3: ");
        seconds = input.nextInt();

        minutes += seconds / 60;
        seconds = seconds % 60;
        hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println("Total Do Album: " + hours + " h " + minutes + " min " + seconds + " sec");

    }
}
