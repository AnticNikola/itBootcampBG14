package prvaNedelja1;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite godinu kada ste se zaposlili : ");
        int godinaZaposljenja = scanner.nextInt();
        int trenutnaGodina=2022;
        int radnoIskustvo=trenutnaGodina-godinaZaposljenja;

        if (radnoIskustvo > 8) {
            System.out.println("Vi ste Direktor firme .");
        } else if (radnoIskustvo > 4) {
            System.out.println("Ti si Senior programer .");
        } else {
            System.out.println("Ti si Junior programer .");

        }
    }
}










