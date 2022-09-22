package Nikola_Antic_JavaOPP_Test;

import java.util.ArrayList;

public abstract class Planinar implements Comparable<Planinar>{
    private int id;
    private String ime, prezime;
    private ArrayList<Planina> svePlanine;
    private double maxUspon;

    public Planinar(int id, String ime, String prezime, ArrayList<Planina> svePlanine, double maxUspon) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.svePlanine = svePlanine;
        this.maxUspon = maxUspon;
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

    public ArrayList<Planina> getSvePlanine() {
        return svePlanine;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setSvePlanine(ArrayList<Planina> svePlanine) {
        this.svePlanine = svePlanine;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public abstract boolean uspesanUspon(Planina p);

    public abstract double clanarina();

    @Override
    public String toString() {
        return "Planinar{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", svePlanine=" + svePlanine +
                ", maxUspon=" + maxUspon +
                '}';
    }
    @Override
    public int compareTo(Planinar planinar){
        return Double.compare(planinar.clanarina(),this.clanarina());
    }
}
