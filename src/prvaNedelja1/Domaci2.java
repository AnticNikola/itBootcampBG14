package prvaNedelja1;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.print("Unesite velicinu majice u cm : ");
        int velicinaMajice = mojSkener.nextInt();

        switch (velicinaMajice) {
            case 24:
                System.out.println("S velicina.");
                break;
            case 30:
                System.out.println("M velicina.");
                break;
            case 36:
                System.out.println("L velicina.");
                break;
            case 42:
                System.out.println("XL velicina.");
                break;
            case 48:
                System.out.println("XXL velicina.");
                break;
            case 54:
                System.out.println("XXXL velicina.");
                break;
            //Posto u stvarnosti imam problema sa kupovinom odece, ovde to barem mogu promeniti :) //
            default:
                System.out.println("Uneli ste nepostojecu velicinu.");

        }
    }
}