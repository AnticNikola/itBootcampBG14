package trecaNedelja;



public class metodeReturn {
    public static void main(String[] args) {

        System.out.println(stepen(2,3));

        }
        public static double stepen(double n, int eksp) {

        double  rezultat=1;
        if(eksp>=0) {
            for(int i=0;i<eksp;i++){
                rezultat=rezultat*n;

            }




        }
        return  rezultat;


    }
    }

