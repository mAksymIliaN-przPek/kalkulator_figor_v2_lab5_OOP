package kalkulator;

class Szescian extends Figura {
    private double dlugoscBoku;

    public Szescian(double dlugoscBoku) {
        super("Sześcian");
        this.dlugoscBoku = dlugoscBoku;
    }

    public double obliczPole() {
        return 6 * dlugoscBoku * dlugoscBoku;
    }

    public double obliczObjetosc() {
        return dlugoscBoku * dlugoscBoku * dlugoscBoku;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa figury: " +nazwa);
        System.out.println("Długość boku: " + dlugoscBoku);
        System.out.println("Pole: " + obliczPole());
        System.out.println("Objętość: " + obliczObjetosc());
    }
}