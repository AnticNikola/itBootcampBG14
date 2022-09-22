package drugaNedelja2;

import java.util.Scanner;

public class zastoJaPrzano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite neki broj od 1 do 10 :");
        int broj = scanner.nextInt();
        double nasumicniBroj = (int) (Math.random() * 10) + 1;
        if (broj==nasumicniBroj) {
            System.out.println("Cestitam dobili ste BINGO !!!" + nasumicniBroj);
        }
        else {
            System.out.println("Zao nam je,niste osvojili nagradu,pokusajte ponovo :(  dobitni broj je bio : " + nasumicniBroj);
        }

    }
}
