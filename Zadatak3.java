package Do10;//3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite pozitivan ceo broj: ");
        int broj = s.nextInt();

        for(int i = 0; i <= broj; i++){
            System.out.println(i);
        }

        System.out.println("Kraj programa.");

    }
}
