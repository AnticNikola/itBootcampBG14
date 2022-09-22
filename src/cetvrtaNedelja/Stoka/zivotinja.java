package cetvrtaNedelja.Stoka;

public class zivotinja {
    private String ime;
    private String rasa;

    public zivotinja(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    public String getIme() {
        return ime;
    }

    public String getRasa() {
        return rasa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void javiSe(){

    }

    @Override
    public String toString() {
        return "zivotinja{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
