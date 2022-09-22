package drugaNedelja2;


import java.util.Scanner;

public class kolaNiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mojNiz = new String[5];

        for (int i = 0; i < mojNiz.length; i++) {
            System.out.print("Unesite marku automobila :");
            mojNiz[i] = scanner.next();
        }
        for (int i = 0; i < mojNiz.length; i++) {
            System.out.print("Unesite marku automobila koju zelite da proverite :");
            String marka = scanner.next();
            if (marka.equalsIgnoreCase(mojNiz[i])) {
                System.out.print(marka + "je dostupan u radnji.");
                break;
            } else {
                System.out.println("Zao nam je nemamo taj auto na lageru.");
                break;
            }


        }
        for (int i = 0; i < mojNiz.length; i++) {
            if (i == mojNiz.length - 1) {
                System.out.print(mojNiz[i] + "."+ "Trenutna kola na lageru.");
            } else {
                System.out.print(mojNiz[i] + ", ");
            }
        }
    }
}


