package sestaNedelja.gradevinarstvo;

public class SefSmene extends Radnik{
    public SefSmene(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica() {
        if(getSmena()==3){
            setPlata(getPlata()+getPlata()*0.3);
        }

    }
}
