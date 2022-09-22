package drugaNedelja2;

import java.util.Scanner;

public class domaci3AnticNikola {
    public static void main(String[] args) {
        Scanner sccaner = new Scanner(System.in);
        System.out.print("Unesite neki broj od -10 do 10 : ");
        int x = sccaner.nextInt();
        int x1 = Math.abs(x);
        System.out.print("Unesite neki broj od -10 do 10 : ");
        int y= sccaner.nextInt();
        int y1=Math.abs(y);
        int brojac=1;
        int suma=0;
        while (brojac<=x1) {
            suma+=y1;
            brojac++;
        }
        if ((x<0) && (y<0) || (x>0)&&(y>0))
            System.out.println("Prozivod je :" + suma);
        else if ((x<0) && (y>0) || (x>0) && (y<0))
            System.out.println("Proizvod je : " + "-" + suma);
        else if ((x==0) || (y==0))
            System.out.println("Proizvod je : 0 ");



    }

}
