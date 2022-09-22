package drugaNedelja2;

import java.util.Scanner;

public class D_06_Antic_Nikola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double zbir = 0;
        for (; true; ) {
            System.out.print("Unesite broj ili 0 za kraj programa :");
            double broj = scanner.nextDouble();
            double pozitivanBroj = Math.abs(broj);
            if (broj == 0) {
                break;
            }
            if (pozitivanBroj == 4) {
                continue;
            }
            double kvadratBroja = Math.pow(pozitivanBroj, 2);
            zbir += kvadratBroja;

        }
        System.out.println("Zbir kvadratnih vrednosti je :" + zbir);


    }
}
