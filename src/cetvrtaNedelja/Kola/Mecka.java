package cetvrtaNedelja.Kola;

import java.time.LocalDate;

public class Mecka extends Automobil {

    public Mecka(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }

    public double oldTimer() {
        if (getMarka().equalsIgnoreCase("Mercedes") && LocalDate.now().getYear() - getGodiste() > 25) {
            double oldTimer = (getCena() * 0.8);
        }
        return oldTimer();
    }
}
