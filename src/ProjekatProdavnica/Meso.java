package ProjekatProdavnica;

public class Meso extends Roba {
    private double tezina;
    private String tip;

    public Meso(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac,double tezina,String tip) {
        super(barKod, cena, naziv, popust, proizvodjac);
        this.tezina = tezina;
        this.tip = tip;
    }

    public double getTezina() {
        return tezina;
    }

    public String getTip() {
        return tip;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void obracunajCenu() {
        setCena(getCena() * tezina / Roba.faktorTezine);

    }
}