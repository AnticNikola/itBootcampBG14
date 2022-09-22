package cetvrtaNedelja.Interface.drugiZadatak;

public class PravougliTrougao implements Obim,Povrsina {
    private double k1;
    private double k2;
    private double c;

    public PravougliTrougao(double k1, double k2, double c) {
        this.k1 = k1;
        this.k2 = k2;
        this.c = c;
    }

    @Override
    public double racunajPovrsinu() {
        return k1*k2/2;
    }

    @Override
    public double racunajObim() {
        return k1+k2+c;
    }
}
