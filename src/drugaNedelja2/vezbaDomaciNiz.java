package drugaNedelja2;

import java.util.Arrays;

public class vezbaDomaciNiz {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5};
        int[] noviNiz = new int[niz.length];
        for (int i = niz.length - 1; i >= 0; i--) {
            noviNiz[i] = niz[i];
        }
        for (int i = niz.length - 1; i >= 0; i--) {
            System.out.print(noviNiz[i]);
        }
    }
}


