package sestaNedelja.gradevinarstvo;

public abstract class Radnik {
    private int id;
    private String ime;
    private double plata;
    private int smena;

    public Radnik(int id, String ime, double plata, int smena) {
        this.id = id;
        this.ime = ime;
        this.plata = plata;
        this.smena = smena;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public double getPlata() {
        return plata;
    }

    public int getSmena() {
        return smena;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    abstract void povisica();
}
