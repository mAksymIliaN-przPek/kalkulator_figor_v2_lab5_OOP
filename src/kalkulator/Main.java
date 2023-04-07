package kalkulator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wybor = 0;
        double dlugoscBoku, dlugosc, szerokosc, wysokosc, promien, tworzaca;

        while (wybor != 8) {
            System.out.println("KALKULATOR FIGUR GEOMETRYCZNYCH");
            System.out.println("1. Koło");
            System.out.println("2. Kwadrat");
            System.out.println("3. Prostokąt");
            System.out.println("4. Sześcian");
            System.out.println("5. Prostopadłościan");
            System.out.println("6. Kula");
            System.out.println("7. Stożek");
            System.out.println("8. Wyjście");
            System.out.println("Wybierz figurę (1-8): ");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Podaj promień koła: ");
                    promien = scanner.nextDouble();
                    Kolo kolo = new Kolo(promien);
                    kolo.wyswietlDane();
                    break;
                case 2:
                    System.out.println("Podaj długość boku kwadratu: ");
                    dlugoscBoku = scanner.nextDouble();
                    Kwadrat kwadrat = new Kwadrat(dlugoscBoku);
                    kwadrat.wyswietlDane();
                    break;
                case 3:
                    System.out.println("Podaj długość pierwszego boku prostokąta: ");
                    dlugosc = scanner.nextDouble();
                    System.out.println("Podaj długość drugiego boku prostokąta: ");
                    szerokosc = scanner.nextDouble();
                    Prostokat prostokat = new Prostokat(dlugosc, szerokosc);
                    prostokat.wyswietlDane();
                    break;
                case 4:
                    System.out.println("Podaj długość boku sześcianu: ");
                    dlugoscBoku = scanner.nextDouble();
                    Szescian szescian = new Szescian(dlugoscBoku);
                    szescian.wyswietlDane();
                    break;
                case 5:
                    System.out.println("Podaj długość prostopadłościanu: ");
                    dlugosc = scanner.nextDouble();
                    System.out.println("Podaj szerokość prostopadłościanu: ");
                    szerokosc = scanner.nextDouble();
                    System.out.println("Podaj wysokość prostopadłościanu: ");
                    wysokosc = scanner.nextDouble();
                    Prostopadloscian prostopadloscian = new Prostopadloscian(dlugosc, szerokosc, wysokosc);
                    prostopadloscian.wyswietlDane();
                    break;
                case 6:
                    System.out.println("Podaj promień kuli: ");
                    promien = scanner.nextDouble();
                    Kula kula = new Kula(promien);
                    kula.wyswietlDane();
                    break;
                case 7:
                    System.out.println("Podaj promień podstawy stożka: ");
                    promien = scanner.nextDouble();
                    System.out.println("Podaj wysokość stożka: ");
                    wysokosc = scanner.nextDouble();
                    System.out.println("Podaj tworzącą stożka: ");
                    tworzaca = scanner.nextDouble();
                    Stozek stozek = new Stozek(promien, wysokosc, tworzaca);
                    stozek.wyswietlDane();
                    break;
                case 8:
                    System.out.println("Wyjście z programu...");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                    break;
            }
        }
        scanner.close();
    }
}