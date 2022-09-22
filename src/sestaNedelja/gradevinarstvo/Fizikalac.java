package sestaNedelja.gradevinarstvo;

public class Fizikalac extends Radnik{
    public Fizikalac(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    void povisica() {
        if(getSmena()==2){
            setPlata(getPlata()+getPlata()*0.2);
        }
    }
}
