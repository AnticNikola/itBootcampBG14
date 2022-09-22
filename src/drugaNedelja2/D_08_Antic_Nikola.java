package drugaNedelja2;

import java.util.Scanner;

public class D_08_Antic_Nikola {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] niz=new String[5];
        for(int i=0;i<niz.length;i++) {
            System.out.print("Unesite ime :");
            niz[i]= scanner.next().toLowerCase();
        }
        for(int i = 0;i<niz.length;i++) {
            if (niz[i].charAt(0) == 'm') {
                System.out.println("reci koje pocinju na slovo'm' su :" + niz[i]);
            }
        }
    }
}
