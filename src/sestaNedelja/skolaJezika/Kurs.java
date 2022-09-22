package sestaNedelja.skolaJezika;

import java.util.ArrayList;

public class Kurs {
    private String jezik;
    private String nivo;
    private ArrayList<Polaznik> polaznici;

    public Kurs(String jezik, String nivo, ArrayList<Polaznik> polaznici) {
        this.jezik = jezik;
        this.nivo = nivo;
        this.polaznici = polaznici;
    }
    //region s&g
    public String getJezik() {
        return jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    public String getNivo() {
        return nivo;
    }

    public void setNivo(String nivo) {
        this.nivo = nivo;
    }

    public ArrayList<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(ArrayList<Polaznik> polaznici) {
        this.polaznici = polaznici;

    }

    @Override
    public String toString() {
        return "Kurs{" +
                "jezik='" + jezik + '\'' +
                ", nivo='" + nivo + '\'' +
                ", polaznici=" + polaznici +
                '}';
    }
    //endregion
    public String nivo(String nivo){
        switch (nivo.toLowerCase()) {
            case "osnovni" :
                setNivo(nivo);
                break;
            case "srednji" :
                setNivo(nivo);
                break;
            case"napredni" :
                setNivo(nivo);
            default:
                setNivo("osnovni");
        }
        return this.nivo;
    }

}