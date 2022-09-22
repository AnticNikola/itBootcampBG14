package drugaNedelja2;

import java.util.Scanner;

public class niz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mojNiz=new int[10];
        for(int i=0;i<mojNiz.length;i++) {
            System.out.print("Unesite broj : ");
            mojNiz[i]= scanner.nextInt();
        }
        for(int i=0;i< mojNiz.length;i++) {
            if(i== mojNiz.length-1) {
                System.out.print(mojNiz[i]);
            }
            else {
                System.out.print(mojNiz[i] + ", ");
            }
        }
        }


    }


