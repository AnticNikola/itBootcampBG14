package drugaNedelja2;

import java.util.Scanner;

public class nestoNovoForPetlja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite vasu rec :");
        String rec = scanner.nextLine();
        int index = 0;
        int brojKaraktera=0;
        char slovoO = 'o';
        int x = rec.length();

        while (index < x) {
            char karakterUReci = rec.charAt(index);
            if (karakterUReci == slovoO) {
                brojKaraktera += 1;
            }
            index += 1;


        }
        System.out.println("Broj karaktera " + slovoO + " je :" + brojKaraktera);


    }


}

