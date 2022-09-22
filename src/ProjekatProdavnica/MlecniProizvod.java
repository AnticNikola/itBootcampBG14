package ProjekatProdavnica;

public class MlecniProizvod extends Roba {
    private String tipPakovanja;

    public MlecniProizvod(int barKod, double cena, String naziv, int popust, Proizvodjac proizvodjac,String tipPakovanja){
        super(barKod,cena,naziv,popust,proizvodjac);
        this.tipPakovanja=tipPakovanja;
    }

    public String getTipPakovanja() {
        return tipPakovanja;
    }

    public void setTipPakovanja(String tipPakovanja) {
        this.tipPakovanja = tipPakovanja;
    }

    @Override
    public void obracunajCenu() {
        if(tipPakovanja.equalsIgnoreCase("tetrapak")){
            setCena(getCena()+getCena()*0.1);
        }else if(tipPakovanja.equalsIgnoreCase("plastika")){
            setCena(getCena()+getCena()*0.05);
        }else {
            setCena(getCena()+getCena()*0.01);
        }

    }
}
