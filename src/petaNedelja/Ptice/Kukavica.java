package petaNedelja.Ptice;

import java.util.ArrayList;

public class Kukavica extends Ptica implements KukavicaJaja{

    public Kukavica(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJaja, int brojJaja, double rasponKrila) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJaja, brojJaja, rasponKrila);
    }

    @Override
    public boolean poloziKukavicjeJaje(Ptica ptica, int brojKukavicjihJaja) {
        if(ptica.getMaksBrojJaja()-getBrojJaja()>brojKukavicjihJaja){
            ptica.setBrojJaja(ptica.getBrojJaja()+brojKukavicjihJaja);
            return true;
        }
        return false;
    }
}
