package pl.edu.uwm.obiektowe.s155065;
import java.time.LocalTime;
import java.util.*;

public class Main //tu powinno być ArrayUtil zamiast Main (zgodnie z poleceniem)
{
    //Z1
    // Napisz generyczną statyczną metodę ArrayUtil.jestPalindromem, która sprawdza czy podana jako argument tablica obiektów
    // klasy T ma tę własność, że wypisanie tej tablicy od początku do końca daje taki sam wynik
    // jak jej wypisanie od końca do początku. W definicji metody zdeklaruj, że klasa T musi implementować generyczny interfejs Comparable.
    // W funkcji main przetestuj działąnie metody jestPalindromem dla posortowanych i nieposortwanych tablic obiektów klas Integer oraz LocalTime.

    public static <T extends Comparable> boolean jestPalindromem(T[] tab)
    {
        for(int i =0; i<Math.floor(tab.length/2); i++)
        {
            if(tab[i].compareTo(tab[tab.length-i-1]) != 0)
                return false;
        }
        return true;
    }

    //Z2
    // Napisz generyczną statyczną metodę wypiszCoDrugi, której argumentem jest dowolny obiekt implementujący interfejs Iterable<E>.
    // Metoda wypiszCoDrugi wypisuje (poczynając od pierwszego) co drugi element swojego argumentu, przy czym oddziela je przecinakami.
    // W funkcji main przetestuj działanie metody wypiszCoDrugi dla obiektów kliku różnych klas implementujących interfejs Iterable<E>.

    public static <E> void wypiszCoDrugi(Iterable<E> it)
    {
        StringBuffer buf = new StringBuffer();
        it.forEach(i -> buf.append(i.toString()));
        for(int i = 0; i<buf.length(); i++)
        {
            if(i%2==0)
                buf.setCharAt(i, ',');
        }
        if(buf.length()%2 == 1)
            buf.deleteCharAt(buf.length()-1);
        buf.deleteCharAt(0);
        System.out.println(buf);
    }

    public static void main(String[] args)
    {
        //Z1
        Integer[] tab1 = {1, 3, 5, 3, 1};
        LocalTime[] tab2 = {LocalTime.parse("23:30"), LocalTime.parse("12:12"), LocalTime.parse("23:30")};
        System.out.println(jestPalindromem(tab1));
        System.out.println(jestPalindromem(tab2));
        //Z2
        ArrayList<Character> l = new ArrayList<>();
        l.add('@');
        l.add('#');
        l.add('$');
        l.add('%');
        wypiszCoDrugi(l);
        LinkedList<Character> li = new LinkedList<>();
        li.add('0');
        li.add('1');
        li.add('2');
        li.add('3');
        li.add('4');
        wypiszCoDrugi(li);
    }
}
