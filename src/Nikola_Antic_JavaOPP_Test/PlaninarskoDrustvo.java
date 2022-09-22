package Nikola_Antic_JavaOPP_Test;

import java.util.ArrayList;
import java.util.Collections;

public class PlaninarskoDrustvo {
    private ArrayList<Planinar> sviPlaninari;

    public PlaninarskoDrustvo(ArrayList<Planinar> sviPlaninari) {
        this.sviPlaninari = sviPlaninari;
    }

    public ArrayList<Planinar> getSviPlaninari() {
        return sviPlaninari;
    }

    public void setSviPlaninari(ArrayList<Planinar> sviPlaninari) {
        this.sviPlaninari = sviPlaninari;
    }

    public void izbaciPlaninara(int id) {
        for (Planinar planinar : sviPlaninari) {
            if (planinar.getId() == id) {
                this.sviPlaninari.remove(planinar);
            }
        }
    }

    public int najUspesnijiPlaninar() {
        int trazeniID = 0;
        double max = Double.MIN_VALUE;
        for (Planinar planinar : sviPlaninari) {
            double sumaVisina = 0;
           for(Planina planina : planinar.getSvePlanine() ){
            sumaVisina+=planina.getVisina();
        }
           if(sumaVisina>max){
               max=sumaVisina;
               trazeniID=planinar.getId();
           }
        }
        return trazeniID;
    }

    public double prosecnaClanarinaPlaninara() {
        double suma = 0;
        for (Planinar planinar : sviPlaninari) {
            suma += planinar.clanarina();
        }
        return suma / getSviPlaninari().size();
    }

    public boolean popniSeNaPlaninu(Planina planina) {
        int alpinista = 0;
        double kojiMogu = 0;
        for (Planinar planinar : sviPlaninari) {
            if (planinar instanceof Alpinista) {
                alpinista++;
            }
            if (planinar.uspesanUspon(planina)) {
                kojiMogu++;
            }
        }
        if (sviPlaninari.size() * 0.66 <= kojiMogu && alpinista >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void sortPlaninariPoClanarini() {
        Collections.sort(this.sviPlaninari);
    }
}
