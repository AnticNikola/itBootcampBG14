package drugaNedelja2;


import java.util.Scanner;

public class DoWhilePetljaVezba1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite vas budzet : ");
        int budzet = scanner.nextInt();

        System.out.println("1. Pleskavica 200din");
        System.out.println("2. Pilece belo meso 300din");
        System.out.println("3. Punjena pljeskavi 280din");
                System.out.println("Unesite broj koji odgovara Vasem zeljenom jelu : ");
        int broj= scanner.nextInt();
        switch (broj) {
            case 1:
                int pljeskavica = 200;
                if (pljeskavica <= budzet) {
                    System.out.println("Narucili ste pleskavicu,prijatno .");
                } else {
                    System.out.println("Zao nam je nemate dovoljno sredstava za ovo jelo .");
                }
                break;
            case 2:
                int pilece = 300;
                if (pilece<= budzet) {
                    System.out.println("Narucili ste pilece belo meso,prijatno .");
                } else {
                    System.out.println("Zao nam je nemate dovoljno sredstava za ovo jelo .");
                }
                break;
            case 3:
                int punjena = 280;
                if (punjena <= budzet) {
                    System.out.println("Narucili ste punjenu pleskavicu,prijatno .");
                } else {
                    System.out.println("Zao nam je nemate dovoljno sredstava za ovo jelo .");
                }
                break;
            default:
                System.out.println("Uneli ste pogresan unos .");
        }
    }
}