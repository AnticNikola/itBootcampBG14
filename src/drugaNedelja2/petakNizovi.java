package drugaNedelja2;

public class petakNizovi {
    public static void main(String[] args) {
        int[] niz = {1, 3, 44, 23, 45, 65, 77, 12, 14, 16, 18, 92};

        for (int i = 0; i < niz.length; i++) {

            if ((i % 2 != 0)&&(niz[i] % 2 == 0)) {

                    System.out.println("Parni brojevi na neparnim indexima su : " + niz[i]);
                }

            }
        }
    }


