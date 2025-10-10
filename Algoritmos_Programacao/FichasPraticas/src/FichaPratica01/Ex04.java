package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ray, area;

        System.out.println("Introduza o raio da circunferência");
        ray = input.nextInt();

        area = ray * ray * Math.PI;

        System.out.println("A area da circunferência é: " + area);
    }
}
