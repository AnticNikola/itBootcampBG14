package drugaNedelja2;

import javax.swing.*;
import java.util.Scanner;

public class hoceLiOvoRaditi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite broj od 1 do 10 : ");
        int number = scanner.nextInt();
        double randomNumber = (int)(Math.random()*10)+1;
        if (number==randomNumber) {
            System.out.println("Dobili ste na lutriji!!!");
        }
        else {
            System.out.println("Zao nam je ,niste pogodili,dobitni broj je : " + randomNumber);
        }
    }
}
