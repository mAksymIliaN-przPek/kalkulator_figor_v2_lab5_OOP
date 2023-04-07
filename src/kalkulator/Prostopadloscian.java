package kalkulator;

class Prostopadloscian extends Figura {
    private double dlugosc;
    private double szerokosc;
    private double wysokosc;

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
        super("Prostopadłościan");
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public double obliczPole() {
        return 2 * (dlugosc * szerokosc + dlugosc * wysokosc + szerokosc * wysokosc);
    }

    public double obliczObjetosc() {
        return dlugosc * szerokosc * wysokosc;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " + nazwa);
        System.out.println("Długość: " + dlugosc);
        System.out.println("Szerokość: " + szerokosc);
        System.out.println("Wysokość: " + wysokosc);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objętość: " + obliczObjetosc());
    }
}