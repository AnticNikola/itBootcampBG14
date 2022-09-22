package petaNedelja.Domaci_017;

import java.util.ArrayList;


public class Restoran implements Guzva {
    private String naziv;
    private int brSlobodnihMesta;
    private static ArrayList<Jelo> meni;

    public Restoran(String naziv, int brSlobodnihMesta, ArrayList<Jelo> meni) {
        this.naziv = naziv;
        this.brSlobodnihMesta = brSlobodnihMesta;
        this.meni = meni;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrSlobodnihMesta() {
        return brSlobodnihMesta;
    }

    public ArrayList<Jelo> getMeni() {
        return meni;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrSlobodnihMesta(int brSlobodnihMesta) {
        this.brSlobodnihMesta = brSlobodnihMesta;
    }

    public static void setMeni(ArrayList<Jelo> meni) {
        Restoran.meni = meni;
    }


    @Override
    public Jelo najskupljeJelo() {
        Jelo najskupljeJelo = meni.get(0);
        for (int i = 1; i < meni.size(); i++) {
            if (meni.get(i).getCena() > najskupljeJelo.getCena()) {
                najskupljeJelo=meni.get(i);
            }
        }
        return najskupljeJelo;
    }

    @Override
    public void rezervisiSto() {

        if (brSlobodnihMesta >= 1) {
            System.out.println("Uspesno ste rezervisali mesto");
            this.brSlobodnihMesta = brSlobodnihMesta - 1;
        } else {
            System.out.println("Zao nam je nema slobodnih mesta");
        }
    }

    @Override
    public void stampajNaziveJela(String vrsta) {
        for (Jelo nazivJela : getMeni()) {
            if (nazivJela.getVrsta().equalsIgnoreCase("domacakuhinja")) {
                System.out.println(nazivJela);
            }
        }
    }

    public static void main(String[] args) {
        Restoran restoran1 = new Restoran("evropa", 0, new ArrayList<>());

        meni.add(new Jelo("Gulas", 400, "domacaKuhinja"));
        meni.add(new Jelo("Pasulj", 350, "domacaKuhinja"));
        meni.add(new Jelo("Spageti", 300, "Italijanska"));
        meni.add(new Jelo("Giros", 320, "Grcka"));

        restoran1.rezervisiSto();
        restoran1.stampajNaziveJela("domacakuhinja");
        System.out.println("Najskuplje jelo je : " + restoran1.najskupljeJelo());
    }

}
