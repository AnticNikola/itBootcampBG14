package cetvrtaNedelja.Sljakeri;

public class Fizikalac extends CaleZaSljakere  {
    private int brojRadnihSubota;

    public Fizikalac(String ime, String prezime, int jmbg, double mesecnaPlata, double bonusZadada, int brojRadnihSubota, int brojDanaGodisnjegOdmora){
        super(ime,prezime,jmbg,mesecnaPlata,bonusZadada,brojDanaGodisnjegOdmora);
        this.brojRadnihSubota = brojRadnihSubota;
    }

    public int getBrojRadnihSubota() {
        return brojRadnihSubota;
    }

    public void setBrojRadnihSubota(int brojRadnihSubota) {
        this.brojRadnihSubota = brojRadnihSubota;
    }
    @Override
    public double racunajBonus(){

        return getMesecnaPlata()+getMesecnaPlata()*0.01*brojRadnihSubota;
    }
    public boolean brojDanaGodisnjegOdmora(){
        boolean dodajDan=false;
        if(brojRadnihSubota>=4){
            dodajDan=true;
            setBrojDanaGodisnjegOdmora(super.getBrojDanaGodisnjegOdmora()+brojRadnihSubota/4);
        }
        return dodajDan;
    }

}
