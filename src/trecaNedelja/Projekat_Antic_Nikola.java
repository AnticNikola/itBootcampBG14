package trecaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class Projekat_Antic_Nikola {
    public static void main(String[] args) {
        //1.System.out.println(zbirCifara(556));
        //2.System.out.println(stepenBroja(125, 5));
        //3.System.out.println(Arrays.toString(zbirIndexaNizaMeta(new int[]{2,3,10,-2},5)));
        //6.System.out.println(Arrays.toString(pomeriNule(new int[]{1,0,0,2,3})));
        //7.System.out.println(Arrays.toString(izbaciDuplikate(new int[]{3, 4, 3, 4,3,4,5})));
        //5.System.out.println(brojPonavljanja("cao", "cao kako si cao"));
        //4.System.out.println(toBinary(100));
    }
    public static char[] nizChar(int x) {
        Scanner scanner = new Scanner(System.in);
        char[] nizChar = new char[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Unesite " + (i + 1) + ". clan niza: ");
            nizChar[i] = scanner.nextLine().charAt(0);
        }
        return nizChar;
    }
    public static String[] nizString(int x) {
        Scanner scanner = new Scanner(System.in);
        String[] nizString = new String[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Unesite " + (i + 1) + ". clan niza: ");
            nizString[i] = scanner.nextLine();
        }
        return nizString;
    }
    public static int[] nizInt(int x) {
        Scanner scanner = new Scanner(System.in);
        int[] nizInt = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Unesite " + (i + 1) + ". clan niza: ");
            nizInt[i] = scanner.nextInt();
        }
        return nizInt;
    }
    public static int zbirCifara(int n) {
        int zbir = 0;
        while (n > 0) {
            zbir += n % 10;
            n = n / 10;
            if (n == 0 && zbir > 9) {
                n = zbir;
                zbir=0;
            }
        }
    return zbir;
    }

    public static boolean stepenBroja(int n, int m) {
        boolean stepen = true;
        for (int i = 1; i < 10; i++) {
            if (Math.pow(m, i) == n) {
                stepen = true;
                break;
            } else {
                stepen = false;
            }
        }
        return stepen;
    }

    public static int[] zbirIndexaNizaMeta(int[] niz, int meta) {
        int[] niz1 = new int[niz.length];
        int k = 0;
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (niz[i] + niz[j] == meta) {
                    niz1[k] = i;
                    k++;
                }
            }
        }
        return Arrays.copyOf(niz1, k);
    }

    public static int[] pomeriNule(int[] niz) {
        int[] niz1 = new int[niz.length];
        int j = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != 0) {
                niz1[j] = niz[i];
                j++;
            }
        }
        return niz1;
    }

    public static int[] izbaciDuplikate(int[] niz) {
        int[] niz1 = new int[niz.length];
        int brojacRazlicitih = 0;

        for (int i = 0; i < niz.length; i++) {
            boolean razliciti = true;
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    razliciti = false;
                    break;
                }
            }
            if (razliciti) {
                niz1[brojacRazlicitih] = niz[i];
                brojacRazlicitih++;
            }
        }
        return Arrays.copyOf(niz1, brojacRazlicitih);
    }

    public static int brojPonavljanja(String s, String recenica) {
        int brojacPonavljanja=0;
        String[] razlozena = recenica.split(" ");
        for(int i =0;i<razlozena.length;i++) {
            if(razlozena[i].equalsIgnoreCase(s)){
               brojacPonavljanja++;
            }
        }
        return brojacPonavljanja;
    }
    public static String toBinary(int n){
        String intBinary=null;
        intBinary=Integer.toBinaryString(Math.abs(n));
        return intBinary;
//region
        //int brojac=0;          Pesacki nacin !!!
        //int n = 100;
        //int n1=n;

        //while (n1 > 0 ) {
            //System.out.print(n1%2);
            //n1 =n1/2 ;
            //brojac++;
        //}
        //System.out.println();
        //int[] niz=new int[brojac];
        //while (n>0) {
            //for(int i=niz.length-1;i>=0;i--){
                //niz[i]=n%2;
                //n=n/2;
           // }
        //}
//endregion
    }
}



