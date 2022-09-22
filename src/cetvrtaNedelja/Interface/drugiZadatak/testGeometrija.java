package cetvrtaNedelja.Interface.drugiZadatak;

import java.util.ArrayList;

public class testGeometrija {
    public static void main(String[] args) {
        PravougliTrougao trougao=new PravougliTrougao(3,4,5);
        Kvadrat kvadrat = new Kvadrat(5);
        Pravougaonik pravougaonik=new Pravougaonik(2,3);

        ArrayList<Povrsina>povrsine=new ArrayList<>();

        povrsine.add(trougao);
        povrsine.add(kvadrat);
        povrsine.add(pravougaonik);

       // System.out.println((trougao.racunajObim()));
        //System.out.println(trougao.racunajPovrsinu());

        for(Povrsina telo : povrsine){
            System.out.println(telo.getClass().getSimpleName()+ " -->> " +telo.racunajPovrsinu());
        }
    }
}
