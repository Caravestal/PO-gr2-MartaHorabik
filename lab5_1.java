import java.util.ArrayList;

public class Start
{
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        for(int i=0; i<b.size(); i++)
        {
            a.add(b.get(i));
        }
        return a;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        ArrayList<Integer> y = new ArrayList<>();
        y.add(4);
        y.add(5);
        ArrayList<Integer> z = new ArrayList<>(append(x, y));
        for(int i=0; i<z.size(); i++)
        {
            System.out.println(z.get(i));
        }
    }
}
