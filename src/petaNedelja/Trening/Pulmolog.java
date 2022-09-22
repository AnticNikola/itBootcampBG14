package petaNedelja.Trening;

import java.util.ArrayList;

public class Pulmolog extends Lekar{
    public Pulmolog(int id, String ime, String prezime, ArrayList<Pacijent> sviPacijenti, int brojPacijenata) {
        super(id, ime, prezime, sviPacijenti, brojPacijenata);
    }

    @Override
    public boolean prihvati(Pacijent pacijent) {
        if(getBrojPacijenata()<100){
            getSviPacijenti().add(pacijent);
            return true;
        }
        return false;
    }

    @Override
    public double plata() {
        return getBrojPacijenata()*350;
    }
}
