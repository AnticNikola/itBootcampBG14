package cetvrtaNedelja.Kola;

import java.util.ArrayList;

public abstract class Automobil {
    private String marka;
    private String boja;
    private int brSasije;
    private int godiste;
    private double cena;

    public Automobil(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }

    public int getGodiste() {
        return godiste;
    }

    public double getCena() {
        return cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getBoja() {
        return boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", boja='" + boja + '\'' +
                ", brSasije=" + brSasije +
                ", godiste=" + godiste +
                ", cena=" + cena +
                '}';
    }

    public abstract double oldTimer();

    public ArrayList<Automobil> cenaManja(ArrayList<Automobil> automobili, int svotaNovca) {
        ArrayList<Automobil> manjaCena = new ArrayList<>();
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getCena() <= svotaNovca) {
                manjaCena.add(automobili.get(i));
            }
        }
        return manjaCena;
    }

    public ArrayList<Automobil> sviBeli(ArrayList<Automobil> automobili, int svotaNovca) {
        ArrayList<Automobil> manjaCena = new ArrayList<>();
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getCena() <= svotaNovca) {
                manjaCena.add(automobili.get(i));
            }
        }
        return manjaCena;
    }

}
