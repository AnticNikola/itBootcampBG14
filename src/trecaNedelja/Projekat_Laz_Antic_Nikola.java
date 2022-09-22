package trecaNedelja;

import java.util.Scanner;

public class Projekat_Laz_Antic_Nikola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String unos;

        do {
            System.out.println("Unesite broj od 1 do 10 :");
            int x = scanner.nextInt();
            int random = (int) (Math.random() * 10 + 1);
            if (x == random) {
                System.out.println("pogodili ste broj!!!");
            }else{
                System.out.println("Dobitni bro je bio :"+random+"za nastavak unesite bilo sta ili 'kraj' za zavrsetak programa :");
            }
            unos= scanner.next();
            if(unos.equalsIgnoreCase("kraj")){
                System.out.println("Igra je zavrena.");
            }else{
                System.out.println("Nastavljamo igru!!!");
            }


        }while(!unos.equalsIgnoreCase("kraj"));


    }
}






