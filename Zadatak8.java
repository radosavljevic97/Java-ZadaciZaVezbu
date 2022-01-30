package Do10;/*
* 8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
*
*	"Dobrodosao u {x}. razred, {ime} {prezime}",
*	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
*   poruku od:
*	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje" */

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.nextLine();

        System.out.print("Unesite prezime: ");
        String prezime = s.nextLine();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        int trenutnaGodina = 2021;

        int godine = trenutnaGodina - godinaRodjenja;
        int razred;

        switch (godine){
            case(7):
                razred = 1;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(8):
                razred = 2;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(9):
                razred = 3;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(10):
                razred = 4;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(11):
                razred = 5;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(12):
                razred = 6;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(13):
                razred = 7;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(14):
                razred = 8;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(15):
                razred = 9;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(16):
                razred = 10;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(17):
                razred = 11;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
            case(18):
                razred = 12;
                System.out.println("Dobrodosao u " + razred + ". razred" + " " + ime + " " + prezime);
                break;
        }

        if(godine < 7 || godine > 18){
            System.out.println(ime + " " +  prezime + " je zavrsio skolu ili tek treba da zapocne obrazovanje.");
        }




    }
}
