package kalkulator;

class Kwadrat extends Figura {
    private double bok;

    public Kwadrat(double bok) {
        super("Kwadrat");
        this.bok = bok;
    }

    public double obliczPole() {
        return bok * bok;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " + nazwa);
        System.out.println("Bok: " + bok);
        System.out.println("Pole: " + obliczPole());
    }
}
