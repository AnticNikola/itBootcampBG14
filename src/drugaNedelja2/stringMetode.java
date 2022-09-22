package drugaNedelja2;


import java.util.Scanner;

public class stringMetode {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj od 1 do 10 :");
        int y = scanner.nextInt();


        int suma = 0;

        for (int i = 1; i <= y; i++) {
            if (i % 2 != 0) {
                suma += i;
            }


        }
        System.out.println("suma je : " + suma);


    }

}



