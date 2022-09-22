package trecaNedelja;

public class petljaUpetljiMetode {
    public static void main(String[] args) {
        int[] nizz1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nizz2= {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<nizz1.length;i++){
            int proizvod=0;
            for(int j =0;j<nizz2.length;j++){
                proizvod=nizz1[i]*nizz2[j];
                System.out.println(proizvod);

            }
            System.out.println("Proizvod brojeva u " + (i + 1) + " redu je: " + proizvod);
        }



    }
}
