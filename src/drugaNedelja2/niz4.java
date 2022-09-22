package drugaNedelja2;

import java.util.Scanner;

public class niz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mojNiz = new int[5];
        String unos;
        int j = 0;
        while (true) {
            System.out.println("Unesite broj :");
            mojNiz[j] = scanner.nextInt();
            j++;
            if (j == mojNiz.length) {
                System.out.print("Uesite bilo sta za nastavak ili 'kraj' za zavrsetak programa :");
                unos = scanner.next();
                if (unos.equalsIgnoreCase("kraj")) {
                    break;
                } else {
                    int[] noviNiz = new int[mojNiz.length * 2];
                    for (int i = 0; i < mojNiz.length; i++) {
                        noviNiz[i] = mojNiz[i];
                    }
                    mojNiz = noviNiz;

                }
            }
        }
                for (int i = 0; i < mojNiz.length; i++) {
                    if (i == mojNiz.length - 1) {
                        System.out.print(mojNiz[i]);
                    } else {
                        System.out.print(mojNiz[i] + " ,");
                    }
                }

            }
        }


