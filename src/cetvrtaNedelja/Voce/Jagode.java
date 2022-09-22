package cetvrtaNedelja.Voce;

public class Jagode extends Voce {

    public Jagode(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }

    public void povecajCenuJagoda(String sezona) {
         if(!getSezona().equalsIgnoreCase("leto")){
            setCenaZaKilogram(getCenaZaKilogram() * 1.2);
        }
    }
}