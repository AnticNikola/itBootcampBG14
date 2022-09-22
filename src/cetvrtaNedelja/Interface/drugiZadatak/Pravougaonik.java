package cetvrtaNedelja.Interface.drugiZadatak;

public class Pravougaonik implements Obim,Povrsina{
    private int a;
    private int b;

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double racunajPovrsinu() {
        return a*b;
    }

    @Override
    public double racunajObim() {
        return (2*a+2*b);
    }
}
