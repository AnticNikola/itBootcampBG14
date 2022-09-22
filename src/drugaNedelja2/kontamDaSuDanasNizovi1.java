package drugaNedelja2;



public class kontamDaSuDanasNizovi1 {
    public static void main(String[] args) {
        int[] mojNiz = {5,8,9,15,21,44,32,33,55,61};

                for( int i = 0;i < mojNiz.length;i++) {
                    int broj=mojNiz[i];
                    if ((broj % 3 == 0)&&(broj % 5==0)) {
                        System.out.println(broj + " je deljiv sa 3 i 5");
                    }
                    //else if (broj % 5 == 0) {
                       // System.out.println(broj + " je deljiv sa 5");

                }


            }
        }

