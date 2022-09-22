package cetvrtaNedelja;


import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(4);
        niz.add(9);
        niz.add(3);
        niz.add(1);
        niz.add(6);
        niz.add(5);
        niz.add(8);
        niz.add(0);
        niz.add(7);
        //Collections.sort(niz);
        //System.out.println(niz);

        for (int i = 0; i < niz.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < niz.size(); j++) {
                if (niz.get(j) > niz.get(minIndex))
                    minIndex = j;
            }
                    int temp = niz.get(minIndex);
                    niz.set(minIndex,niz.get(i));
                    niz.set(i,temp);
                }
        System.out.println(niz);
    }

}