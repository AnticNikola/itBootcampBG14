package petaNedelja.Ptice;

import java.util.ArrayList;

public class Orao extends Ptica implements Predator{
    private int brojUlova;

    public Orao(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJaja, int brojJaja, double rasponKrila,int brojUlova) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJaja, brojJaja, rasponKrila);
        this.brojUlova=brojUlova;
    }


    public int getBrojUlova() {
        return brojUlova;
    }

    public void setBrojUlova(int brojUlova) {
        this.brojUlova = brojUlova;
    }
    @Override
    public boolean lovi(Ptica ptica) {
        if(ptica.getMaxRasponKrila()<100){
            setBrojUlova(brojUlova++);
            return  true;
        }
        return false;
    }

    @Override
    public int getLovina() {
        return this.brojUlova;
    }
}
