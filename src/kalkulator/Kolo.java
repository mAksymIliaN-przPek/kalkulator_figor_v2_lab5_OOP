package kalkulator;

class Kolo extends Figura {
    private double promien;

    public Kolo(double promien) {
        super("Koło");
        this.promien = promien;
    }

    public double obliczPole() {
        return Math.PI * promien * promien;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " + nazwa);
        System.out.println("Promień: " + promien);
        System.out.println("Pole: " + obliczPole());
    }
}