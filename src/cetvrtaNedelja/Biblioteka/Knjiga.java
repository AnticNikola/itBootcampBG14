package cetvrtaNedelja.Biblioteka;

public class Knjiga {
    private String naslov;
    private String zanr;
    private int godinaIzdanja;
    private String autor;
    private int brojProdatihKopija;


    public Knjiga(String naslov, String zanr, int godinaIzdanja, String autor, int brojProdatihKopija) {
        this.naslov = naslov;
        this.zanr = zanr;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
        this.brojProdatihKopija = brojProdatihKopija;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getBrojProdatihKopija() {
        return brojProdatihKopija;
    }

    public void setBrojProdatihKopija(int brojProdatihKopija) {
        this.brojProdatihKopija = brojProdatihKopija;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", zanr='" + zanr + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                ", autor='" + autor + '\'' +
                ", brojProdatihKopija=" + brojProdatihKopija +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Knjiga)) {
            return false;
        }

        Knjiga knjiga = (Knjiga) object;

        return this.getAutor().equals(knjiga.getAutor()) &&
                this.getBrojProdatihKopija() == knjiga.getBrojProdatihKopija() &&
                this.getGodinaIzdanja() == knjiga.getGodinaIzdanja() &&
                this.getNaslov().equals(knjiga.getNaslov());
    }

    public static void main(String[] args) {
        Knjiga knjiga1=new Knjiga("Harii poter drugi deo","horor",1984,"Ja",966);
        Knjiga knjiga2=new Knjiga("Rambo","fantastika",1979,"On",1100);
        Knjiga knjiga3=new Knjiga("Gospodar","romantika",1999,"Ja",1200);

        System.out.println(knjiga1.getBrojProdatihKopija());
    }
}
