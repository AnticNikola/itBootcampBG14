package petaNedelja.MocktestOOP;

import java.util.ArrayList;

public class Poliklinika {
    private ArrayList<Lekar> sviLekari;

    public Poliklinika(ArrayList<Lekar> sviLekari) {
        this.sviLekari = sviLekari;
    }

    public ArrayList<Lekar> getSviLekari() {
        return sviLekari;
    }

    public void setSviLekari(ArrayList<Lekar> sviLekari) {
        this.sviLekari = sviLekari;
    }

    public int pulmologSaNajmnjomPlatom() {
        double min = Double.MAX_VALUE;
        int trazeniID = 0;
        for (Lekar lekarSiromah : sviLekari) {
            if (lekarSiromah instanceof Pulmolog) {
                if (lekarSiromah.plata() < min) {
                    min = lekarSiromah.plata();
                    trazeniID = lekarSiromah.getId();
                }
            }
        }
        return trazeniID;
    }
    public int pedijatarSaNajstarijimPacijentima (){

        int trazeniId=0;
        double max=Double.MIN_VALUE;
        int brojPacijenata=0;
        for(Lekar trazeni : sviLekari){
            double prosekGodina=0;
            if(trazeni instanceof Pedijatar){
                for(Pacijent pacijent: trazeni.getSviPacijenti()){
                    prosekGodina+=pacijent.getBrojGodina();
                    brojPacijenata++;
                }
                prosekGodina/=brojPacijenata;
                if(prosekGodina>max){
                    max=prosekGodina;
                    trazeniId=trazeni.getId();
                }
            }
        }
        return trazeniId;
    }

}
