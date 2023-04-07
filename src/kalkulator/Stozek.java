package kalkulator;

class Stozek extends Figura {
    private double promien;
    private double wysokosc;
    private double tworzaca;

    public Stozek(double promien, double wysokosc, double tworzaca) {
        super("Stożek");
        this.promien = promien;
        this.wysokosc = wysokosc;
        this.tworzaca = tworzaca;
    }

    public double obliczPole() {
        return Math.PI * promien * (promien + tworzaca);
    }

    public double obliczObjetosc() {
        return (1/3) * Math.PI * promien * promien * wysokosc;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " + nazwa);
        System.out.println("Promień: " + promien);
        System.out.println("Wysokość: " + wysokosc);
        System.out.println("Tworząca: " + tworzaca);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objętość: " +
                obliczObjetosc());
    }
}