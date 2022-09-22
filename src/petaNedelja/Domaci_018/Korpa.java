package petaNedelja.Domaci_018;

import java.util.ArrayList;

public class Korpa implements Racun {
    private ArrayList<Namirnica> sveNamirnice;

    public Korpa(ArrayList<Namirnica> sveNamirnice) {
        this.sveNamirnice = sveNamirnice;
    }

    public ArrayList<Namirnica> potrosackaKorpa() {
        ArrayList<Namirnica> potrosackaKorpa = new ArrayList<>();
        for (Namirnica namirnicaUKorpi : sveNamirnice) {
            potrosackaKorpa.add(namirnicaUKorpi);
        }
        return potrosackaKorpa;
    }

    @Override
    public void printNamirnice() {
        for (Namirnica namirnica : sveNamirnice) {
            System.out.println(namirnica);
        }
    }

    @Override
    public double printRacun() {
        double racun=0;
        for(Namirnica namirnica : potrosackaKorpa()){
            racun+= namirnica.getCena();
        }
        return racun;
    }

    @Override
    public boolean jeNaSpisku(Namirnica namirnica) {
        for ( Namirnica namirnicaKojaSeTrazi : potrosackaKorpa()) {
            if(namirnicaKojaSeTrazi.getNaziv().equalsIgnoreCase(namirnica.getNaziv()))
            return true;
        }
        return false;
    }
}
