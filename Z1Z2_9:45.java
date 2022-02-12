package pl.edu.uwm.obiektowe.s155065;
import java.time.LocalTime;
import java.util.*;

public class Main //tu powinno być ArrayUtil zamiast Main (zgodnie z poleceniem)
{
    //Z1
    // Napisz generyczną statyczną metodę ArrayUtil.isSorted, która sprawdza czy podana jako argument tablica obiektów
    // klasy T jest uporządkowana nierosnąco. W definicji metody zdeklaruj, że klasa T musi implementować generyczny interfejs Comparable.
    // W funkcji main przetestuj działąnie metody isSorted dla posortowanych i nieposortwanych tablic obiektów klas Integer, LocalTime oraz String.

    public static <T extends Comparable> boolean isSorted(T[] tab)
    {
        for(int i =0; i<tab.length-1; i++)
        {
            if(tab[i].compareTo(tab[i+1]) > 0)
                return false;
        }
        return true;
    }

    //Z2
    // Napisz generyczną statyczną metodę print, której argumentem jest dowolny obiekt implementujący interfejs Iterable<E>.
    // Metoda print wypisuje elementy swojego argumentu odzielając je przecinkami.
    // W funkcji main przetestuj działanie metody print dla obiektów kliku różnych klas implementujących interfejs Iterable<E>.

    public static <E> void print(Iterable<E> it)
    {
        StringBuffer buf = new StringBuffer();
        it.forEach(i -> buf.append(i.toString()).append(","));
        buf.deleteCharAt(buf.length()-1);
        System.out.println(buf);
    }

    public static void main(String[] args)
    {
        //Z1
        Integer tab1[] = {2,1,6};
        String tab2[] = {"a", "b", "c"};
        LocalTime tab3[] = {LocalTime.parse("11:20"), LocalTime.parse("12:00"), LocalTime.parse("11:19")};
        System.out.println(isSorted(tab1));
        System.out.println(isSorted(tab2));
        System.out.println(isSorted(tab3));
        //Z2
        ArrayList<Character> l = new ArrayList<>();
        l.add('@');
        l.add('#');
        l.add('$');
        l.add('%');
        print(l);
        LinkedList<Character> li = new LinkedList<>();
        li.add('0');
        li.add('1');
        li.add('2');
        li.add('3');
        li.add('4');
        print(li);
    }
}
