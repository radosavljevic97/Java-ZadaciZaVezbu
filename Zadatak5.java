package Do10;//5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite pozitivan ceo broj: ");
        int broj = s.nextInt();

        for(int i = -14; i <= (broj * 2); i++){
            System.out.println(i);
        }

        System.out.println("Kraj programa.");

    }
}
