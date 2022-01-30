package Do10;//4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite negativan ceo broj: ");
        int broj = s.nextInt();

        for(int i = broj; i <= 0; i++){
            System.out.println(i);
        }

    }
}
