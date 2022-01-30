package Do10;//1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite pozitivan broj: ");
        int broj = s.nextInt();

        if(broj % 2 == 0){
            System.out.println("Broj koji ste uneli je paran.");
        }
        else{
            System.out.println("Broj koji ste uneli je neparan.");
        }

        System.out.print("Kraj programa.");

    }
}
