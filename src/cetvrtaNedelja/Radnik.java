package cetvrtaNedelja;

import java.time.LocalDate;

public class Radnik {
    private int ID;
    private String ime;
    private String pozicija;
    private int godinaPocetka;
    private double plata;

    public Radnik(int ID, String ime, String pozicija, int godinaPocetka, int plata) {
        this.ID = ID;
        this.ime = ime;
        this.pozicija = pozicija;
        this.godinaPocetka = godinaPocetka;
        this.plata = plata;

    }

    public int getID() {
        return ID;
    }

    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodinaPocetka() {
        return godinaPocetka;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public int radniStaz() {
        if (LocalDate.now().getYear() - godinaPocetka < 0) {
            throw new IllegalArgumentException(
                    String.format("Godina zaposlenja %d ne moze biti veca od trenutne godine %d", godinaPocetka, LocalDate.now().getYear())
            );
        }
        return LocalDate.now().getYear() - godinaPocetka;
    }

    public double neto(double plata) {
        double netoPlata = plata * 30 / 100;
        return netoPlata;
    }

    public double mesecnaPlata(double plata) {
        double mesecnaPlata = plata / 12;
        return mesecnaPlata;
    }

    public static void main(String[] args) {
        //region
        Radnik radnik1 = new Radnik(1, "pera", "Fizikalac", 2023, 10000);
        {
        try { radnik1.radniStaz();
        }catch (IllegalArgumentException exception){
            assert exception.getClass()==IllegalArgumentException.class;
        }
            //radnik1.radniStaz();
            //endregion
            System.out.println();
        }
    }
}