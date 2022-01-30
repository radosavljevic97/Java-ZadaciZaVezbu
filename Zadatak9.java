package Do10;/*9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
*"Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije
*  ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
*/

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = s.nextInt();

        for(int i = 1; i <= broj; i++){
            if(i % 7 == 0 && i % 5 == 0){
                System.out.println(i + ": ZuzzBuzz");
            }
            else if(i % 7 == 0 && i % 3 == 0){
                System.out.println(i + ": ZuzzFizz");
            }
            else if(i % 5 == 0 && i % 3 == 0){
                System.out.println(i + ": BuzzFizz");
            }
            else if(i % 7 == 0){
                System.out.println(i + ": Zuzz");
            }
            else if(i % 5 == 0){
                System.out.println(i + ": Buzz");
            }
            else if(i % 3 == 0){
                System.out.println(i + ": Fizz");
            }
            else {
                System.out.println(i + ":");
            }
        }

    }
}
