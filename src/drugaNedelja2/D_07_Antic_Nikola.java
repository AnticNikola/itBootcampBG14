package drugaNedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class D_07_Antic_Nikola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite velicinu niza :");
        int velicinaNiza = scanner.nextInt();
        int[] niz = new int[velicinaNiza];
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite element niza :");
            niz[i] = scanner.nextInt();
        }
        int[] noviNiz = new int[niz.length];
        for (int i = niz.length - 1; i >= 0; i--) {
            noviNiz[i] = niz[i];
        }
        for (int i = niz.length - 1; i >= 0; i--) {
            if (i == 0) {
               System.out.print(noviNiz[i]);
            } else {
                System.out.print(noviNiz[i] + " ,");
            }
        }
   }
}








