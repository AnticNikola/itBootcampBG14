package petaNedelja.Trening;

import java.util.ArrayList;
import java.util.Collections;

public class Poliklinika {
    private ArrayList<Lekar> sviLekarri;

    public Poliklinika(ArrayList<Lekar> sviLekarri) {
        this.sviLekarri = sviLekarri;
    }

    public ArrayList<Lekar> getSviLekarri() {
        return sviLekarri;
    }

    public void setSviLekarri(ArrayList<Lekar> sviLekarri) {
        this.sviLekarri = sviLekarri;
    }

    public int pulmologSaNajmanjomPlatom() {
        int trazeniId = 0;
        double min = Double.MAX_VALUE;
        for (Lekar lekar : sviLekarri) {
            if (lekar instanceof Pulmolog) {
                if (lekar.plata() < min) {
                    min = lekar.plata();
                    trazeniId = lekar.getId();
                }
            }
        }
        return trazeniId;
    }

    public int padijatarSaNajstarijimPacijentima() {

        int maxProsekGodina = Integer.MIN_VALUE;
        int trazeniId = 0;
        int k=0;
        for (Lekar lekar : sviLekarri) {
            if (lekar instanceof Pedijatar) {
                int prosekGodina = 0;
                int brojPacijenata = k;
                for (Pacijent pacijent : lekar.getSviPacijenti()) {
                    prosekGodina += pacijent.getBrojGodina();
                    brojPacijenata++;
                }
                if (prosekGodina / brojPacijenata > maxProsekGodina) {
                    maxProsekGodina = prosekGodina / brojPacijenata;
                    trazeniId = lekar.getId();
                }
            }
        }
        return trazeniId;
    }
    public void sortLekariPoBrojuPacijenata(){
        Collections.sort(this.sviLekarri);
    }
}
