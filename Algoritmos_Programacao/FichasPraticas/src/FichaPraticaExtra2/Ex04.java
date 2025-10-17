package FichaPraticaExtra2;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choice;

        System.out.print("Insira uma letra do alfabeto: ");
        choice = input.next();

        switch (choice) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println("E uma vogal");
                break;

            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println("E uma consoante");
                break;
            default:
                System.out.println("Nao é uma letra");
                break;
        }
    }
}
