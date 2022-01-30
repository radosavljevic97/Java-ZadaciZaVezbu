package Do10;//7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

import java.util.Objects;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite mesec: ");
        String mesec = s.next();

        if(Objects.equals(mesec, "Januar")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 21){
                System.out.println("Vas horoskopski znak je jarac.");
            }
            else{
                System.out.println("Vas horoskopski znak je vodolija.");
            }
        }
        if(Objects.equals(mesec, "Februar")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 20){
                System.out.println("Vas horoskopski znak je vodolija.");
            }
            else{
                System.out.println("Vas horoskopski znak su ribe.");
            }
        }
        if(Objects.equals(mesec, "Mart")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 21){
                System.out.println("Vas horoskopski znak su ribe.");
            }
            else{
                System.out.println("Vas horoskopski znak je ovan.");
            }
        }
        if(Objects.equals(mesec, "April")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 21){
                System.out.println("Vas horoskopski znak je ovan.");
            }
            else{
                System.out.println("Vas horoskopski znak je bik.");
            }
        }
        if(Objects.equals(mesec, "Maj")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 22){
                System.out.println("Vas horoskopski znak je bik.");
            }
            else{
                System.out.println("Vas horoskopski znak su blizanci.");
            }
        }
        if(Objects.equals(mesec, "Jun")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 22){
                System.out.println("Vas horoskopski znak su blizanci.");
            }
            else{
                System.out.println("Vas horoskopski znak je rak.");
            }
        }
        if(Objects.equals(mesec, "Jul")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 23){
                System.out.println("Vas horoskopski znak je rak.");
            }
            else{
                System.out.println("Vas horoskopski znak je lav.");
            }
        }
        if(Objects.equals(mesec, "Avgust")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 23){
                System.out.println("Vas horoskopski znak je lav.");
            }
            else{
                System.out.println("Vas horoskopski znak je devica.");
            }
        }
        if(Objects.equals(mesec, "Septembar")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 23){
                System.out.println("Vas horoskopski znak je devica.");
            }
            else{
                System.out.println("Vas horoskopski znak je vaga.");
            }
        }
        if(Objects.equals(mesec, "Oktobar")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 24){
                System.out.println("Vas horoskopski znak je vaga.");
            }
            else{
                System.out.println("Vas horoskopski znak je skorpija.");
            }
        }  if(Objects.equals(mesec, "Novembar")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 23){
                System.out.println("Vas horoskopski znak je skorpija.");
            }
            else{
                System.out.println("Vas horoskopski znak je strelac.");
            }
        }
        if(Objects.equals(mesec, "Decembar")){
            System.out.print("Unesite dan kada ste rodjeni: ");
            int danRodjenja = s.nextInt();

            if(danRodjenja < 22){
                System.out.println("Vas horoskopski znak je strelac.");
            }
            else{
                System.out.println("Vas horoskopski znak je jarac.");
            }
        }









    }
}
