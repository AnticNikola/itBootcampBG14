package cetvrtaNedelja.Biblioteka;

import java.util.ArrayList;

public class Knjizara {

    private ArrayList<Knjiga>knjige;

    public Knjizara(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }


    public ArrayList<Knjiga> autorKnjige(String autor) {
        ArrayList<Knjiga> autorKnjige = new ArrayList<>();

        for (int i = 0; i < knjige.size(); i++) {
            if (knjige.get(i).getAutor().equalsIgnoreCase(autor)) {
                autorKnjige.add(knjige.get(i));
            }
        }
        // for(Knjiga knjigaKojuTrazimo : this.knjige){
    //if(knjigaKojuTrazimo.getAutor.equals.autor){
        //autorKnjige.add(knjigaKojuTrazimo
        //}
        //}
        //
        return autorKnjige;
    }

    public ArrayList<Knjiga> bestSeller(ArrayList<Knjiga> knjige) {
        ArrayList<Knjiga> bestSeller = new ArrayList<>();
        for (int i = 0; i < knjige.size(); i++) {
            if (knjige.get(i).getBrojProdatihKopija() > 1000) {
                bestSeller.add(knjige.get(i));
            }
        }
        //for(Knjiga najprodavanije : this.knjige){
        //if(najprodavanija.getBrojProdatih>=1000){
        //bestseler.add.najprodavaija
        //
        //
        //
        return bestSeller;
    }
}
