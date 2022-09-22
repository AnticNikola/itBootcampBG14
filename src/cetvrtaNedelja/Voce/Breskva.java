package cetvrtaNedelja.Voce;

public class Breskva extends Voce{


    public Breskva(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }

    public void smanjiCenuBreskvi(String boja){
        if(getBoja().equalsIgnoreCase("zelena")){
            setCenaZaKilogram(getCenaZaKilogram()*0.85);
        }
    }
}
