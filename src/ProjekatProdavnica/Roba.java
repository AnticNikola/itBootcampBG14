package ProjekatProdavnica;

public abstract class Roba {
    private int barKod;
    private double cena;
    private String naziv;
    private int popust;
    private Proizvodjac proizvodjac;

    public static final int faktorTezine=1000;

    public Roba(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac) {
        this.barKod = barKod;
        this.cena = cena;
        this.naziv = naziv;
        this.popust = popust;
        this.proizvodjac = proizvodjac;
    }

    public int getBarKod() {
        return barKod;
    }

    public double getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getPopust() {
        return popust;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public void obracunajPopust() {

        this.cena = this.cena - (this.cena * popust / 100);
    }

    public void obracunajCenu(){

    }

    @Override
    public String toString() {
        return "Roba{" +
                "barKod=" + barKod +
                ", cena=" + cena +
                ", naziv='" + naziv + '\'' +
                ", popust=" + popust +
                ", proizvodjac=" + proizvodjac +
                '}';
    }

    public static void main(String[] args) {
        // Roba roba = new Roba(123,100,"mleko",1,2,new Proizvodjac());

    }
}