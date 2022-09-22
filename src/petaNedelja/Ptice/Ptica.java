package petaNedelja.Ptice;

import java.util.ArrayList;

public class Ptica extends Comparable<Ptica> {
    private double minRasponKrila, maxRasponKrila;
    private ArrayList<String> omiljenaHrana;
    private String staniste;
    private int maksBrojJaja;
    private int brojJaja;
    private double rasponKrila;


    public Ptica(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJaja, int brojJaja, double rasponKrila) {
        this.minRasponKrila = minRasponKrila;
        this.maxRasponKrila = maxRasponKrila;
        this.omiljenaHrana = omiljenaHrana;
        this.staniste = staniste;
        this.maksBrojJaja = maksBrojJaja;
        this.brojJaja = brojJaja;
        this.rasponKrila = rasponKrila;
    }

    //region
    public double getMinRasponKrila() {
        return minRasponKrila;
    }

    public void setMinRasponKrila(double minRasponKrila) {
        this.minRasponKrila = minRasponKrila;
    }

    public double getMaxRasponKrila() {
        return maxRasponKrila;
    }

    public void setMaxRasponKrila(double maxRasponKrila) {
        this.maxRasponKrila = maxRasponKrila;
    }

    public ArrayList<String> getOmiljenaHrana() {
        return omiljenaHrana;
    }

    public void setOmiljenaHrana(ArrayList<String> omiljenaHrana) {
        this.omiljenaHrana = omiljenaHrana;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }

    public int getMaksBrojJaja() {
        return maksBrojJaja;
    }

    public void setMaksBrojJaja(int maksBrojJaja) {
        this.maksBrojJaja = maksBrojJaja;
    }

    public int getBrojJaja() {
        return brojJaja;
    }

    public void setBrojJaja(int brojJaja) {
        this.brojJaja = brojJaja;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    //endregion
    public double generateRasponKrila(double minRasponKrila, double maxRasponKrila) {

        return Math.round((Math.random() * (maxRasponKrila - minRasponKrila + 1) + minRasponKrila) * 100.0) / 100.0;

    }

    public boolean polaganjeJaja(int brojJajaKojaSePoloze) {
        if (brojJajaKojaSePoloze < (maksBrojJaja - brojJaja)) {
            setBrojJaja(brojJaja + brojJajaKojaSePoloze);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ptica{" +
                "minRasponKrila=" + minRasponKrila +
                ", maxRasponKrila=" + maxRasponKrila +
                ", omiljenaHrana=" + omiljenaHrana +
                ", staniste='" + staniste + '\'' +
                ", maksBrojJaja=" + maksBrojJaja +
                ", brojJaja=" + brojJaja +
                ", rasponKrila=" + rasponKrila +
                '}';
    }

    @Override
    public int compareTo(Ptica drugaPtica) {
        return Double.compare(this.rasponKrila, drugaPtica.getRasponKrila());
    }
}
