package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary;
        double tax;

        System.out.print("Introduza um salario: ");
        salary = input.nextInt();

        if (salary <= 15000) {
            tax = salary * 0.2;
            System.out.println("Tax Paid 20%: " + tax);
        } else if (salary <= 20000) {
            tax = salary * 0.3;
            System.out.println("Tax Paid 30%: " + tax);
        } else if (salary <= 25000){
            tax = salary * 0.35;
            System.out.println("Tax Paid 35%: " + tax);
        }else {
            tax = salary * 0.4;
            System.out.println("Tax Paid 40%: " + tax);
        }
    }
}
