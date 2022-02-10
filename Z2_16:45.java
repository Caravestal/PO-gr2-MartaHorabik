package pl.edu.uwm.obiektowe.s155065;
import java.util.*;

public class Main //tu powinno być ArrayUtil zamiast Main (zgodnie z poleceniem)
{

    //Z2
    // Napisz generyczną statyczną metodę printMarginal, której argumentem jest dowolny obiekt implementujący interfejs Iterable<E>.
    // Metoda printMarginal wypisuje końcowe elementy swojego argumentu (pierwszy i sotatni element).
    // W funckji main przetestuj działanie metody printMarginal dla obiektów
    // czterech różnych klas implementujących interfejs Iterable<E>.

    public static <E> void printMarginal(Iterable<E> it)
    {
        StringBuffer buf = new StringBuffer();
        StringBuffer buf2 = new StringBuffer();
        it.forEach(i -> buf.append(i));
        buf2.append(buf.charAt(0));
        buf2.append(buf.charAt(buf.length()-1));
        System.out.println(buf2.toString());
    }
    public static void main(String[] args)
    {
        //Z2
        ArrayList<Character> l = new ArrayList<>();
        l.add('@');
        l.add('#');
        l.add('$');
        l.add('%');
        printMarginal(l);
        LinkedList<Character> li = new LinkedList<>();
        li.add('1');
        li.add('2');
        li.add('3');
        li.add('4');
        printMarginal(li);
        TreeSet<Character> t = new TreeSet<>();
        t.add('a');
        t.add('b');
        t.add('c');
        t.add('d');
        printMarginal(t);
        Vector<Character> v = new Vector<>();
        v.add('!');
        v.add(',');
        v.add('.');
        v.add('?');
        printMarginal(v);
    }
}
