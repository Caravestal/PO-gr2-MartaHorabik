import java.util.Arrays;
import java.util.Random;

public class Start
{
    public static void main (String[] args) {

        // long[] a;
        // a = new long[16]
        long[] a = new long[16];

        // wypisujemy elementy tablicy
        System.out.print("a: ");
        wypisz(a);

        // wypełniamy tablicę liczbami pseudolosowymi
        generuj (a, 50);

        // wypisujemy elementy tablicy
        System.out.print("a: ");
        wypisz(a);

        a = new long[12];
        // wypełniamy tablicę liczbami pseudolosowymi
        generuj (a, 50);

        // wypisujemy elementy tablicy
        System.out.print("a: ");
        wypisz(a);

        // wypisujemy elementy tablicy za pomocą metody statycznej z klasy Arrays
        System.out.print("a: ");
        System.out.println(Arrays.toString(a));

        long b[] = new long[2 * a.length];

        // kopiujemy tablicę a do tablicy b
        System.arraycopy (a, 0, b, 0, a.length);

        // wypisujemy elementy tablicy b
        System.out.print("b: ");
        wypisz(b);

        // sortujemy i wypisujemy elementy tablicy b
        Arrays.sort(b);
        System.out.print("b: ");
        wypisz(b);

        System.out.println(ileNieparzystych(a));
        System.out.println(ileDodatnich(a));
        System.out.println(ileParzystych(a));
        System.out.println(ileUjemnych(a));
        System.out.println(ileZerowch(a));
        System.out.println(ileMaksymalnych(a));
        System.out.println(sumaDodatnich(a));
        System.out.println(sumaUjemnych(a));
    }

    // generuje pseudolosowe liczby całkowite z przedziału [0..max)
    public static void generuj (long[] tab, int max) {
        Random r = new Random();
        for (int j = 0; j < tab.length; ++j) {
            tab[j] = r.nextInt(max);
        }
    }

    public static void wypisz(long[] tab) {
        for (long el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    //zad.2.a
    public static int ileNieparzystych(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el%2!=0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileParzystych(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el%2==0){
                wynik++;
            }
        }
        return wynik;
    }
    //zad.2.b
    public static int ileDodatnich(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el > 0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileUjemnych(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el < 0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileZerowch(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el == 0){
                wynik++;
            }
        }
        return wynik;
    }
    //zad.2.c
    public static int ileMaksymalnych(long tab[]){
        int wynik = 0;
        for(long el: tab){
            //jeśli elementy są do max 50 to ile jest pięćdziesiątek
            if (el == 50){
                wynik++;
            }
        }
        return wynik;
    }
    //zad.2.d
    public static int sumaDodatnich(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el > 0){
                wynik += el;
            }
        }
        return wynik;
    }
    public static int sumaUjemnych(long tab[]){
        int wynik = 0;
        for(long el: tab){
            if (el < 0){
                wynik += el;
            }
        }
        return wynik;
    }
}
