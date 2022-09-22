package petaNedelja.Trening;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Lekar implements Comparable<Lekar>{
    private int id;
    private String ime,prezime;
    private ArrayList<Pacijent>sviPacijenti;
    private int brojPacijenata;

    public Lekar(int id, String ime, String prezime, ArrayList<Pacijent> sviPacijenti, int brojPacijenata) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.sviPacijenti = sviPacijenti;
        this.brojPacijenata = brojPacijenata;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Pacijent> getSviPacijenti() {
        return sviPacijenti;
    }

    public int getBrojPacijenata() {
        return brojPacijenata;
    }

    public void setSviPacijenti(ArrayList<Pacijent> sviPacijenti) {
        this.sviPacijenti = sviPacijenti;
    }

    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }

    @Override
    public String toString() {
        return "Lekar{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", sviPacijenti=" + sviPacijenti +
                ", brojPacijenata=" + brojPacijenata +
                '}';
    }
    public abstract boolean prihvati(Pacijent pacijent);
    public abstract double plata();

    public int compareTo(Lekar lekar){
    return  Double.compare(this.getBrojPacijenata(),lekar.getBrojPacijenata());
    }

}
