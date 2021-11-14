import static java.lang.Math.*;
import java.util.ArrayList;

public class Start
{
    public static void revesed(ArrayList<Integer> a)
    {
        int size2 = (int) floor(a.size()/2);
        for(int i=0; i<size2; i++)
        {
            Integer temp = a.get(i);
            a.set(i, a.get(a.size()-i-1));
            a.set(a.size()-i-1, temp);
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(2);
        x.add(3);
        x.add(4);
        revesed(x);
        for(int i=0; i<x.size(); i++)
        {
            System.out.println(x.get(i));
        }
    }
}
