package petaNedelja.Domaci_017;

import java.util.ArrayList;

public class Jelo {
    private String naziv;
    private double cena;
    private String vrsta;

    public Jelo(String nzaiv, double cena, String vrsta) {
        this.naziv = naziv;
        this.cena = cena;
        this.vrsta = vrsta;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", vrsta='" + vrsta + '\'' +
                '}';
    }

}
