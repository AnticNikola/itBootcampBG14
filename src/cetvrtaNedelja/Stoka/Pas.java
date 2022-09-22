package cetvrtaNedelja.Stoka;

public class Pas extends zivotinja {

    private String boja;

    public Pas(String ime, String rasa,String boja) {
        super(ime, rasa);
        this.boja=boja;
    }
    @Override
    public void javiSe(){
        System.out.println("Av Av Av");
    }
}
