package kalkulator;

class Prostokat extends Figura {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        super("Prostokąt");
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double obliczPole() {
        return dlugosc * szerokosc;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " + nazwa);
        System.out.println("Długość: " + dlugosc);
        System.out.println("Szerokość: " + szerokosc);
        System.out.println("Pole: " + obliczPole());
    }
}
