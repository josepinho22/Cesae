package FichaPraticaExtra1;

public class Ex05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println(

        );
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

}

