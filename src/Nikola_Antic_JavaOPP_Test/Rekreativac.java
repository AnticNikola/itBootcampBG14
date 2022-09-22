package Nikola_Antic_JavaOPP_Test;

import java.util.ArrayList;

public class Rekreativac extends Planinar {
    private double tezinaOpreme;

    public Rekreativac(int id, String ime, String prezime, ArrayList<Planina> svePlanine, double maxUspon, double tezinaOpreme) {
        super(id, ime, prezime, svePlanine, maxUspon);
        this.tezinaOpreme = tezinaOpreme;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(getMaxUspon()-(50*getTezinaOpreme()) >= p.getVisina()){
           this.getSvePlanine().add(p);
           return true;
        }
        return false;
    }

    @Override
    public double clanarina() {
        return 1000 - getSvePlanine().size() * 0.02;
    }
}

