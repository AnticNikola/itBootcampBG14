package cetvrtaNedelja.Kola;

import java.time.LocalDate;

public class BMW extends Automobil {

    public BMW(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }

    @Override

    public double oldTimer() {
        if (getMarka().equalsIgnoreCase("BMW") && LocalDate.now().getYear() - getGodiste() > 20) {
            double oldTimer=(getCena() * 0.7);
        }
     return oldTimer();
    }
}
