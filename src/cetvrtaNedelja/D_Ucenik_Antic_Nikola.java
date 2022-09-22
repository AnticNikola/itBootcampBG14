package cetvrtaNedelja;

import drugaNedelja2.Nikola_Antic_Test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

public class D_Ucenik_Antic_Nikola {
    private String ime;
    private String prezime;
    private int godine;
    private int[] ocene;

    public D_Ucenik_Antic_Nikola(String ime, String prezime, int godine, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = LocalDate.now().getYear()-godine;
        this.ocene = ocene;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public int[] getOcene() {
        return ocene;
    }

    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }

    public static String notifikacija(int[] ocene){

        String notifikacija="";
        int jedinice=0;
        boolean imaJedinica=false;
    for(int i=0;i< ocene.length;i++){
        if(ocene[i]==1){
            jedinice++;
            imaJedinica=true;
        }
    }
    if(imaJedinica){
        notifikacija="Kako stvari stoje u Avgustu necete moci na more!!! Vase dete ima : "+"-" + jedinice +"-" +" jedinicu/e.";
    }else{
        notifikacija="Mozete planirati more u Avgustu,Vase dete nema jedinica.";
    }

    return notifikacija;
    }

    public static String prosek(int[]ocene){

    String prosekOcena="";
    double suma=0;
    for(int i=0;i< ocene.length;i++){
       suma+=ocene[i];
    }
    double prosecna=suma/(ocene.length);
    prosecna=Math.round(prosecna*10.0)/10.0;
    if(prosecna>=4.5){
        prosekOcena="Odlican uspeh,neka samo tako nastavi. Prosek ocena je : " +prosecna;
    }else if(prosecna>=3.5){
        prosekOcena="Vrlodobar uspeh. Prosek ocena je : " +prosecna;
    }else if(prosecna>=2.5) {
        prosekOcena = "Dobar uspeh. Prosek ocena je : " + prosecna ;
    }else if(prosecna>=2) {
        prosekOcena = "Dovoljan uspeh. Prosek ocena je : " + prosecna ;
    }else{
        prosekOcena="Nedovoljan uspeh,kako stvari stoje,vidimo se sledece godine u istom razredu. Prosek ocena je : " +prosecna;
    }
    return prosekOcena;
    }

    public static void main(String[] args) {
        D_Ucenik_Antic_Nikola Ucenik1 = new D_Ucenik_Antic_Nikola("Nikola", "Antic", 1984, new int[]{5, 5, 5, 5, 3, 5, 5, 3});
        //System.out.println(Arrays.toString(Ucenik1.getOcene()));
        //System.out.println(Ucenik1.getGodine());
        //System.out.println(notifikacija(Ucenik1.ocene));
        //System.out.println(prosek(Ucenik1.getOcene()));
        //Ucenik1.setGodine(11);
       // System.out.println(Ucenik1.getGodine());
        //Ucenik1.setOcene(new int[]{1,2,3,4,5});
       // System.out.println(Arrays.toString(Ucenik1.getOcene()));
    }
}
