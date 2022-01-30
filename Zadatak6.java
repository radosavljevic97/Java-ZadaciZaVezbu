package Do10;//6. Ispisati proizvod prvih n celih brojeva [1, n].

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = s.nextInt();
        int a = 1;

        for (int i = 1; i <= broj; i++) {
            a = a * i;
        }
        System.out.println("Proizvod brojeva do tog broja je " + a + ".");

    }
}
