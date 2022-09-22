package petaNedelja.Trening;

import java.util.ArrayList;

public class Pedijatar extends Lekar{
    public Pedijatar(int id, String ime, String prezime, ArrayList<Pacijent> sviPacijenti, int brojPacijenata) {
        super(id, ime, prezime, sviPacijenti, brojPacijenata);
    }

    @Override
    public boolean prihvati(Pacijent pacijent) {
        if(getBrojPacijenata()<200 && pacijent.getBrojGodina()>18){
            getSviPacijenti().add(pacijent);
            return true;
        }
        return false;
    }

    @Override
    public double plata() {
        int bonus=0;
        for(Pacijent pacijent : getSviPacijenti()){
            if(pacijent.getBrojGodina()<5){
               bonus+=100;
            }
        }
        return getBrojPacijenata()*300+bonus;
    }
}
