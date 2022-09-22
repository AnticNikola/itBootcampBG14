package trecaNedelja;

public class piramideMetode {
    public static void main(String[] args) {
        int visina=5;

        for (int i = 0; i < visina; i++) {
            for (int j = 0; j <=i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
