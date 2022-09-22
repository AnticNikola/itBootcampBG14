package trecaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class ubaciElementUNiz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Unesite element koji zelite da ubacite :");
        int element= scanner.nextInt();
        System.out.print("Unesite index na koji zelite da ubacite element :");
        int index= scanner.nextInt();
        System.out.println(Arrays.toString(ubacenElement(new int[] {1,2,3},element,index)));

    }
    public static int[] ubacenElement(int[] niz,int element,int index) {
        int[] niz1=new int[niz.length+1];
        for(int i=0,j=0;i<niz1.length;i++,j++){
            if(i==index){
                niz1[i]=element;
                j--;
                continue;
            }
            niz1[i]=niz[j];
        }

    return niz1;
    }
}
