package trecaNedelja;


import java.util.Arrays;
import java.util.Scanner;

public class presekDvaNiza {
    public static void main(String[] args) {
        //region mainSkraceno
        Scanner scanner = new Scanner(System.in);

        int[] prvi = {1, 2, 3, 4};
        int[] drugi = {3, 4, 5, 6};

        System.out.println(Arrays.toString(presek(new int []{1, 2, 3, 4},new int[]{3,4,5,6})));

        //endregion
    }

    public static int[] presek(int[] prvi, int[] drugi) {
        int brojac = 0;
        int[] treci = new int[prvi.length];
        for (int i = 0; i < prvi.length; i++) {
            for (int j = 0; j < drugi.length; j++) {
                if (prvi[i] == drugi[j]) {
                    treci[brojac] = prvi[i];
                    brojac++;

                }
            }
        }
        return Arrays.copyOf(treci,brojac);
    }
}
