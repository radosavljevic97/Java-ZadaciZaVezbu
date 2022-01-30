package Do10;//10. Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
// koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja
// (dakle 1 + 2 + 3 + ... + t). [Ovaj zadatak je dosta komplikovan!]

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite pozitivan broj: ");
        int broj = s.nextInt();

        int suma = 0;

        for(int i = 1; i < broj; i++){
            suma = suma + i;
        }
        System.out.print("Suma do untetog broja je: " + suma);



    }
}
