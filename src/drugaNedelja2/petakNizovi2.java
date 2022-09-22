package drugaNedelja2;

import java.util.Scanner;

public class petakNizovi2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mojNiz[]=new int[10];
        int i=0;
        while(true) {
            System.out.print("Unesite neki broj :");
            mojNiz[i]= scanner.nextInt();
            i++;
            if(i==mojNiz.length) {
                break;
            }
        }
        int min= mojNiz[0];
        for ( i=0;i< mojNiz.length;i++) {
            if(mojNiz[i]<min) {
                min=mojNiz[i];
            }



        }
        System.out.println("Najmanji broj u nizu je : " + min);
    }
}
