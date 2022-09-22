package trecaNedelja;

import java.util.Scanner;

public class metoda3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("unesite donju granicu: ");
        int donjaGranica=scanner.nextInt();
        System.out.println("unesite gornju granicu: ");
        int gornjaGranica= scanner.nextInt();
        fizzBuzz(donjaGranica,gornjaGranica);
    }
    public static void fizzBuzz(int donjaGranica, int gornjaGranica) {

        for(int i= donjaGranica;i<gornjaGranica;i++){
            if (i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }

    }
}

