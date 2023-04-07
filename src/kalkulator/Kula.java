package kalkulator;

class Kula extends Figura {
    private double promien;

    public Kula(double promien) {
        super("Kula");
        this.promien = promien;
    }

    public double obliczPole() {
        return 4 * Math.PI * promien * promien;
    }

    public double obliczObjetosc() {
        return (4 / 3) * Math.PI * promien * promien * promien;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " + nazwa);
        System.out.println("Promień: " + promien);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objętość: " + obliczObjetosc());
    }
}