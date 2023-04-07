package kalkulator;
import java.util.Scanner;
abstract class Figura {    //klasa ogólna do wszystkich figur
    protected String nazwa;

    public Figura(String nazwa) {
        this.nazwa = nazwa;
    }
    public abstract double obliczPole();

    public abstract void wyswietlDane();
}