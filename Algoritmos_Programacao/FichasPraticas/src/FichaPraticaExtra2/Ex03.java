package FichaPraticaExtra2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            double price, finalPrice;

        System.out.print("Introduza o preço: ");
        price = input.nextInt();


        if (price > 100) {
            finalPrice = price * 0.9;
            System.out.println("Preço final: " + finalPrice + " ( 10% de Desconto )");
        } else {
            System.out.println("Preço final: " + price + " ( Sem Desconto )");
        }
    }
}
