package Do10;/*2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0,
 "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0. */

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = s.nextInt();

        if(broj < 0){
            System.out.println("Broj koji ste uneli je negativan.");
        }
        else if(broj > 0){
            System.out.println("Broj koji ste uneli je pozitivan.");
        }
        else{
            System.out.println("Broj koji ste uneli ne neutralan.");
        }

        System.out.println("Kraj programa.");


    }
}
