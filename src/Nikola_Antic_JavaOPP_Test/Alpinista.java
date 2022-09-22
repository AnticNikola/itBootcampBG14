package Nikola_Antic_JavaOPP_Test;

import java.util.ArrayList;

public class Alpinista extends Planinar{
    private int godineIskustva;

    public Alpinista(int id, String ime, String prezime, ArrayList<Planina> svePlanine, double maxUspon,int godineIskustva) {
        super(id, ime, prezime, svePlanine, maxUspon);

        this.godineIskustva=godineIskustva;
    }
    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(getMaxUspon() >= p.getVisina()){
            this.getSvePlanine().add(p);
            return true;
        }
        return false;
    }

    @Override
    public double clanarina() {
        double bonus=0;
        for(Planina planina : getSvePlanine()){
            if(planina.getVisina()>2000){
                bonus++;
            }
        }
        return 1500-bonus*0.05;
    }

}
