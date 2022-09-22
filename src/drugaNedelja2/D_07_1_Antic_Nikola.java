package drugaNedelja2;

import java.util.Arrays;
import java.util.Scanner;

public class D_07_1_Antic_Nikola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite velicinu niza :");
        int velicinaNiza = scanner.nextInt();
        int[] niz = new int[velicinaNiza];
        int brojacNeparnih = 0;
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite element niza :");
            niz[i] = scanner.nextInt();
        }
        int[] noviNiz = new int[niz.length];
        for (int i = niz.length - 1,j=0; i >= 0; i--) {
            noviNiz[j] = niz[i];
            j++;
        }
        int[] samoParni = new int[niz.length];
        for (int i = niz.length-1,j=0; i >=0; i--) {
            if (noviNiz[i] % 2 != 0) {
                brojacNeparnih += 1;
                samoParni[j] = noviNiz[i];
                j++;
            }
        }
        int[] poslednjiNiz = new int[brojacNeparnih];
        for (int i = niz.length-1, j = 0; i >=0; i--) {
            if (samoParni[i] != 0) {
                poslednjiNiz[j] = samoParni[i];
                j++;
            }
        }
        System.out.print(Arrays.toString(poslednjiNiz));
    }
}

