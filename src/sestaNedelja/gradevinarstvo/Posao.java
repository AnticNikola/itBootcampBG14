package sestaNedelja.gradevinarstvo;

import java.util.ArrayList;

public interface Posao {
    void dajOtkazPrvojSmeniFizikalaca();
    boolean jeRadnik(Radnik r);
    double ukupnaPlataRadnikaDrugeSmene();
    ArrayList<Radnik>dobroPlaceni(double suma);
}
