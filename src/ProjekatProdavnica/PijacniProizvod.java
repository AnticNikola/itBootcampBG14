package ProjekatProdavnica;

public class PijacniProizvod extends Roba {
    private double tezina;
    private boolean uvoz;

    public PijacniProizvod(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac) {
        super(barKod, cena, naziv, popust, proizvodjac);
        this.tezina = tezina;
        this.uvoz = uvoz;
    }

    @Override
    public void obracunajCenu() {
        setCena(getCena()*tezina / Roba.faktorTezine);
    }

}
