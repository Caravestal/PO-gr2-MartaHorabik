package pl.edu.uwm.obiektowe.s155065;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    //Z1
    public static<T extends Comparable<T>>void removeRepeatedElements(T[] tab)
    {
        ArrayList a = new ArrayList();
        for(int i=1; i<tab.length; i++)
        {
            for(int j=0; j<tab.length; j++)
            {
                if(tab[i] == tab[j])
                    break;
            }
            a.add(tab[i]);
        }
        for(int l=0; l<=a.size(); l++)
            System.out.println(a(l));
    }

    public static void main(String[] args)
    {
	    removeRepeatedElements(Character);
	    removeRepeatedElements(LocalTime);
    }
}
