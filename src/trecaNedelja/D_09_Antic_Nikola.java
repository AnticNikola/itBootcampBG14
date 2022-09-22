package trecaNedelja;


import java.util.Arrays;
import java.util.Scanner;
/* ne radi mi ovaj kod, al eto da posaljem moju logiku pa cu ovih dana da nadjem gresku i resenje,
ne zelim da kopiram od drugih  resenje samo da bih ti poslao.

 */
public class D_09_Antic_Nikola {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Unesite prvu rec :");
        String prviUnos= scanner.nextLine();
        System.out.print("Unesite drugu rec :");
        String drugiUnos= scanner.nextLine();

    }
    public static void samoglasnici (String prviUnos,String drugiUnos){
        int duzinaPrvi=prviUnos.length();
        int duzinaDrugi=drugiUnos.length();
        String spojeniStringovi=prviUnos.toLowerCase()+drugiUnos.toLowerCase();
        int brojacSamoglasnika=0;
        if (duzinaPrvi==duzinaPrvi ){
            char[] niz=new char[duzinaPrvi*2];
            for(int i=0;i<duzinaPrvi*2;i++){
                if(spojeniStringovi.charAt(i)=='a' || spojeniStringovi.charAt(i)=='o'||spojeniStringovi.charAt(i)=='u'||
                spojeniStringovi.charAt(i)=='e' || spojeniStringovi.charAt(i)=='i' ) {
                    niz[i]=spojeniStringovi.charAt(i);
                    brojacSamoglasnika++;
                }
            }
            char[] finalni=new char[brojacSamoglasnika];
            for(int i=0;i<finalni.length;i++) {
                finalni[i]=niz[i];
            }
            System.out.println(Arrays.toString(finalni));
        }else {
            System.out.print("Stringovi nisu iste velicine.");
        }

    }

}