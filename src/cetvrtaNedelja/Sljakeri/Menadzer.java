package cetvrtaNedelja.Sljakeri;

public class Menadzer extends CaleZaSljakere  {

    private int uspesneProdaje;

    public Menadzer(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZadada, int brojRadnihSubota, int brojDanaGodisnjegOdmora){
        super(ime,prezime,jmbg,mesecnaPlata,bonusZadada,brojDanaGodisnjegOdmora);
        this.uspesneProdaje=uspesneProdaje;
    }

    public int getUspesneProdaje() {
        return uspesneProdaje;
    }

    public void setUspesneProdaje(int uspesneProdaje) {
        this.uspesneProdaje = uspesneProdaje;
    }
    @Override
    public double racunajBonus(){

    return getMesecnaPlata()+getMesecnaPlata()*0.02*getUspesneProdaje();
    }

}
