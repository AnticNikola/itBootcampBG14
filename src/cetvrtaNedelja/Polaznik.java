package cetvrtaNedelja;

public class Polaznik {


    int jmbg;
    int godine;
    String ime;
    String prezime;

    Polaznik(int noviJmbg, int godine, String ime, String prezime) {
        jmbg = noviJmbg;
        this.godine = godine;
        this.ime = ime;
        this.prezime = prezime;
    }

    public static void main(String[] args) {
        Polaznik dusan = new Polaznik(999191919, 30, "Dusan", "Stevanovic");
        System.out.println(dusan.jmbg);
        System.out.println(dusan.godine);
        System.out.println(dusan.ime);
        System.out.println(dusan.prezime); // polje
        System.out.println(dusan.jePunoletan()); // poziv metode

        Polaznik milos = new Polaznik(191293, 29, "Milos", "Obradovic");
        System.out.println(milos.jmbg);
        System.out.println(milos.godine);
        System.out.println(milos.ime);
        System.out.println(milos.prezime); // polje
        System.out.println(milos.jePunoletan()); // poziv metode

        Polaznik[] polaznici = new Polaznik[2];
        polaznici[0] = dusan;
        polaznici[1] = milos;


    }

    public boolean jePunoletan() {
        return godine >= 18;
    }

}