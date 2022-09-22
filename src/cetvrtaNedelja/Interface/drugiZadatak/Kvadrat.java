package cetvrtaNedelja.Interface.drugiZadatak;

public class Kvadrat implements Obim,Povrsina{
    private int a;

    public Kvadrat(int a) {
        this.a = a;
    }
    @Override
    public double racunajPovrsinu() {
        return a*a;
    }

    @Override
    public double racunajObim() {
        return a*4;
    }
}
