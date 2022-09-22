package sestaNedelja.gradevinarstvo;

import java.util.ArrayList;

public class Gradjevina implements Posao {
    private ArrayList<Radnik>radnici;

    public Gradjevina(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    public ArrayList<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    @Override
    public void dajOtkazPrvojSmeniFizikalaca() {
        for(Radnik kojiSeTrazi : radnici){
            if(kojiSeTrazi instanceof Fizikalac) {
                if (kojiSeTrazi.getSmena() == 1) {
                    radnici.remove(kojiSeTrazi);
                }
            }
        }
    }

    @Override
    public boolean jeRadnik(Radnik r) {

        for(Radnik radnik : radnici){
            if(radnik.getId()==r.getId()){
                return true;
            }
        }
        return false;
    }

    @Override
    public double ukupnaPlataRadnikaDrugeSmene() {
        double suma=0;
        for(Radnik r : radnici){
            if(r.getSmena()==2){
               suma+=r.getPlata();
            }
        }
        return suma;
    }

    @Override
    public ArrayList<Radnik>dobroPlaceni(double suma) {
        ArrayList<Radnik>dobroPlaceni=new ArrayList<>();
        for(Radnik radnik : radnici){
            if(radnik.getPlata()>suma){
                dobroPlaceni.add(radnik);
            }
        }
        return dobroPlaceni;
    }
}
