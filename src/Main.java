import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dzień dobry");
        //typy proste
        //zmienne a nie obiekty
        //male lietry
        //typy calkowite
        byte liczba = 124;
        short liczba2 = 12345;
        int liczba3 = 1213243536;
        long liczba4 = 1213243536;
        System.out.println("Liczba całkowita " + liczba4);
        //typy zmiennoprzecinkowe
        float liczba5 = 23.65f; //na końcu litera f
        double liczba6 = 235.524654;
        //typ logiczny
        boolean czyPrawda = true; //false
        //typ znakowy
        char znak = 'a';

        //wylosuj liczbę z zakresu od 1 do 100
        //zgadnij wylosowana liczbę wpisując ją z klawiatury

        int wylosowanaLiczba = (int)(Math.random()*100+1);//rzutownie
        double wylosowana2 = wylosowanaLiczba;
        System.out.println("Wylosowano "+wylosowanaLiczba);
        //odczyt z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wpisanaLiczba = scanner.nextInt();
        System.out.println("Wpisano "+wpisanaLiczba);

        //instrukcja warunkowa
        if(wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Brawo, trafione");
        }else{
            System.out.println("Pudło");
        }
        int roznica;
        if(wylosowanaLiczba > wpisanaLiczba){
            roznica = wylosowanaLiczba - wpisanaLiczba;
        }else{
            roznica = wpisanaLiczba - wylosowanaLiczba;
        }
        //wyrazenie warunkowe -> zwraca wartosc
        roznica = wylosowanaLiczba > wpisanaLiczba ? wylosowanaLiczba - wpisanaLiczba : wpisanaLiczba - wylosowanaLiczba;
        System.out.println("Pomyliłeś się o "+roznica);
        //dzielenie całowite
        roznica = roznica / 10; //jezeli dziele dwie liczby calkowite to wynik zzawsze calkowity

        //instrukcja wyboru switch
        switch (roznica){
            case 0:
                System.out.println("Super");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Może być");
                break;
            default:
                System.out.println("Może następnym razem będzie lepiej");
        }
        //wyrazenie swich -> zwraca wartość
        System.out.println(
                switch (roznica){
                    case 0 -> "Super";
                    case 1 -> "Bardzo blisko";
                    case 2 -> "Może być";
                    default -> "Może innym razem";
                }
        );

        //losujemy liczbe i zgadujemy 10 razy
        Random random = new Random();
        wylosowanaLiczba = random.nextInt(1,101);

        for (int i = 0; i < 10; i++){
            System.out.println("Podaj liczbę");
            wpisanaLiczba = scanner.nextInt();
            if(wpisanaLiczba == wylosowanaLiczba){
                System.out.println("brawo");
                break;
            }
            if(wpisanaLiczba > wylosowanaLiczba){
                System.out.println("Za dużo");
            }else{
                System.out.println("Za mało");
            }
        }
    }
}