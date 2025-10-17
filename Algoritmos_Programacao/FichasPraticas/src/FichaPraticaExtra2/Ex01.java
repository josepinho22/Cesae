package FichaPraticaExtra2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userAge ;

        System.out.print("Indique a sua idade: ");
        userAge = input.nextInt();


        if (userAge >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
