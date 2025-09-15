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
    }
}