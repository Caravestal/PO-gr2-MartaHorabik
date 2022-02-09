package pl.edu.uwm.obiektowe.s155065;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main //tu powinno być ArrayUtil zamiast Main (zgodnie z poleceniem)
{
    
    //Z1
    // Napisz statyczną generyczną metodę ArrayUtil.removeRepeatedElements, która zwraca obiekt klasy ArrayList zawierający
    // nie powtarzające się elementy tablicy obiektów klasy T podanej jako argument metody (zwracany obiekt stanowi zbiór reprezentujący
    // tablicę elementów podaną jako argument metody). Klasa T może implementować generyczny interefejs Comparable.
    // W funkcji main przetestuj działanie metody removeRepeatedElements dla tablic obiektów Character oraz LocalTime.

    public static <T extends Comparable> ArrayList<T> removeRepeatedElementds(T[] Mtab)
    {
        T[] tab = Mtab.clone();
        ArrayList<T> temp = new ArrayList<>();
        for(int i=0; i<tab.length; i++)
        {
            for(int j=i+1; j<tab.length; j++)
            {
                if(tab[i] != null && tab[j] != null){
                    if(tab[i].compareTo(tab[j]) == 0)
                    {
                        tab[i] = null;
                        tab[j] = null;
                    }
                }
            }
        }
        temp.addAll(Arrays.stream(tab).toList());
        return temp;
    }
    
    //Z2
    // Napisz generyczną statyczną metodę printWithSemicolon, której argumentem jest dowolny obiekt implementujący interfejs Iterable<E>.
    // Metoda printWithSemicolon wypisuje elementy swojeg oargumentu oddzielając je średnikami.
    // W funkcji main przetestuj działanie metody printWithSemicolon dla obiektów czterech różnych klas implementujących 
    // interfejs Iterable<E>.
    
    public static <E> void printWithSemicolon(Iterable<E> it)
    {
        StringBuffer buf = new StringBuffer();
        it.forEach(i -> buf.append(i.toString()).append(";"));
        buf.deleteCharAt(buf.length()-1);
        String st = buf.toString();
        System.out.println(st);
    }

    public static void main(String[] args) {
        //Z1
        Character[] tab = {'å', '2', '3', '3', '6'};
        LocalTime[] tab2 = {LocalTime.parse("21:33:00"), LocalTime.parse("21:33:00"), LocalTime.parse("21:33:01")};
        ArrayList<Character> t = removeRepeatedElementds(tab);
        ArrayList<LocalTime> t2 = removeRepeatedElementds(tab2);
        //Z2
        ArrayList<Character> chr = new ArrayList<>();
        chr.add('*'); chr.add('*'); chr.add('*'); chr.add('*'); chr.add('*');
        chr.add(' '); chr.add('*'); chr.add('*'); chr.add('*');
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2); ll.add(1);
        printWithSemicolon(chr);
        printWithSemicolon(ll);
    }
}
