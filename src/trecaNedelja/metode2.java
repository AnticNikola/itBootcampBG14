package trecaNedelja;

public class metode2 {
    public static void main(String[] args) {
        String s="abrakadabra";
        System.out.println(obrniRec(s));

    }

    public static String obrniRec (String s) {
        String obrnutaRec="";

        for(int i = s.length()-1;i>=0;i--) {
            obrnutaRec=obrnutaRec+s.charAt(i);


        }
         return   obrnutaRec ;
    }


}



