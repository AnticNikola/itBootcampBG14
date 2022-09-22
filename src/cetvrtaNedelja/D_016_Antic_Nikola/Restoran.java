package cetvrtaNedelja.D_016_Antic_Nikola;

import java.util.ArrayList;

public class Restoran {

    private ArrayList<Zaposleni> sviZaposleni;


    public Restoran(ArrayList<Zaposleni> sviZaposleni) {
        this.sviZaposleni = sviZaposleni;
    }

    public ArrayList<Zaposleni> konobariUSmeni(int smena) {

        ArrayList<Zaposleni> konobariUSmeni = new ArrayList<>();
        for (Zaposleni smenasi : this.sviZaposleni) {
            if (smenasi.getSmena() == smena) {
            }
            konobariUSmeni.add(smenasi);
        }
        return konobariUSmeni;
    }

    //        for (int i = 0; i < sviZaposleni.size(); i++) {
//            if (sviZaposleni.get(i).getSmena() == smena) {
//                konobariUSmeni.add(sviZaposleni.get(i));
//            }
//        }
//        return konobariUSmeni;
//   }
    public void povecajDnevnicuTrecojSmeni(ArrayList<Zaposleni> sviZaposleni) {
       for (Zaposleni trecaSmena : this.sviZaposleni) {
            if (trecaSmena.getSmena() == 3) {
                int bonus = (int) (trecaSmena.getDnevnica() / 0.3);
                trecaSmena.setDnevnica(trecaSmena.getDnevnica() + bonus);
            }
        }
//    }
//        for (int i = 0; i < sviZaposleni.size(); i++) {
//            if(sviZaposleni.get(i).getSmena()==3){
//                int bonus = (int) (sviZaposleni.get(i).getDnevnica() / 0.3);
//                sviZaposleni.get(i).setDnevnica(sviZaposleni.get(i).getDnevnica()+bonus);
//            }
//        }
    }
}
