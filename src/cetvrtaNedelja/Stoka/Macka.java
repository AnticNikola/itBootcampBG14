package cetvrtaNedelja.Stoka;

public class Macka extends zivotinja {

    private String omiljenaHrana;


    public Macka(String ime, String rasa,String omiljenaHrana) {
        super(ime, rasa);
        this.omiljenaHrana=omiljenaHrana;
    }

    @Override
    public void javiSe(){
        System.out.println("Mjaooo");
    }
}
