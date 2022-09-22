package drugaNedelja2;

import java.util.Arrays;

public class nizSamoglasnici {
    public static void main(String[] args) {
        char[] slova={'i','p','b','o','e','r','t','y'};
        char[]samoglasnici = new char[slova.length];
        int brojacZaSamoglasnike=0;
        for(int i=0;i< slova.length;i++) {
            if(slova[i]=='i'||slova[i]=='u'||slova[i]=='a'||slova[i]=='o'||slova[i]=='e') {
                samoglasnici[brojacZaSamoglasnike]=slova[i];
                brojacZaSamoglasnike++;

            }
        }
        char[] samoglasniciTrimovani=new char[brojacZaSamoglasnike];
        for(int i=0;i<brojacZaSamoglasnike;i++) {
            samoglasniciTrimovani[i]=samoglasnici[i];
        }
        System.out.println(Arrays.toString(samoglasniciTrimovani));
    }
}
