package trecaNedelja;

public class D_10_Antic_Nikola {
    public static void main(String[] args) {
        int x=5;
        faktorijal(x);

}
public static int faktorijal (int x){
        int rezultat=0;
        int i=1;
        while(i<=x) {
            rezultat+=i*x;
            i++;
        }
    System.out.println("fAktorijal broja " + x + " je: " +rezultat );
        return rezultat;
    }

}