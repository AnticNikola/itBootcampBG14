package sestaNedelja.gradevinarstvo;

public class Masinovodja extends Radnik {

    public Masinovodja(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    void povisica() {
        if(getSmena()==1){
            setPlata(getPlata()+getPlata()*0.25);
        }
    }
}
