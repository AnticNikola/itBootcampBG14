package petaNedelja.Domaci_018;

public class Namirnica {
    private String naziv;
    private double cena;

    public Namirnica(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Namirnica{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }
}
