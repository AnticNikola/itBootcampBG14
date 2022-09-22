package petaNedelja.MocktestOOP;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Lekar implements Comparable<Lekar>{
    private int  id;
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

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Pacijent> getSviPacijenti() {
        return sviPacijenti;
    }

    public void setSviPacijenti(ArrayList<Pacijent> sviPacijenti) {
        this.sviPacijenti = sviPacijenti;
    }

    public int getBrojPacijenata() {
        return brojPacijenata;
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

    @Override
    public int compareTo(Lekar o) {
        return Double.compare(this.brojPacijenata,o.brojPacijenata);
    }

    public static void main(String[] args) {
    ArrayList<Lekar>lekari=new ArrayList<>();
    Collections.sort(lekari);
    }
}
