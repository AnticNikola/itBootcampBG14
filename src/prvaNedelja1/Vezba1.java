package prvaNedelja1;


import java.util.Scanner;

public class Vezba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brojacCool = 0;
        String trazenaRec = "cool";
        for (int i = 0; true; i++) {
            System.out.println("Unesite string koji sadrzi bar jednom 'cool': ");
            String text = scanner.next().toLowerCase();
            if (text.contains(trazenaRec)) {
                brojacCool++;
            } else if (text.contains("cao")) {
                System.out.println("Program je prekinut!");
                break;
            }
        }
        System.out.println("Broj ponavljanja reci 'cool' je: " + brojacCool);
    }
}



