class IntegerSet
{
    boolean[] tab = new boolean[101];
    IntegerSet()
    {
        for(int i=0; i<=100; i++)
        {
            tab[i] = false;
        }
    }
    public boolean[] union(boolean[] tab2)
    {
        boolean[] tabT = new boolean[101];
        for(int i=0; i<=100; i++)
        {
            if(tab[i]==true || tab2[i]==true)
            {
                tabT[i] = true;
            }
            else
            {
                tabT[i] = false;
            }
        }
        return tabT;
    }
    public boolean[] intersection(boolean[] tab2)
    {
        boolean[] tabT = new boolean[101];
        for(int i=0; i<=100; i++)
        {
            if(tab[i]==true && tab2[i]==true)
            {
                tabT[i] = true;
            }
            else
            {
                tabT[i] = false;
            }
        }
        return tabT;
    }
    public void insertElement(int j)
    {
        tab[j] = true;
    }
    public void deleteElement(int j)
    {
        tab[j] = false;
    }
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<=100; i++)
        {
            if(tab[i]==true)
            {
                sb.append(i);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public boolean equals(boolean[] tab2)
    {
        for(int i=0; i<=100; i++)
        {
            if(tab[i] != tab2[i])
            {
                return false;
            }
        }
        return true;
    }
}


public class Start {

    public static void main(String[] args)
    {
        IntegerSet l1 = new IntegerSet();
        IntegerSet l2 = new IntegerSet();
        l1.tab[2] = true;
        l1.tab[7] = true;
        l1.tab[9] = true;
        l2.tab[7] = true;
        l2.tab[18] = true;
        l2.tab[19] = true;
        boolean[] temp = l1.union(l2.tab);
        System.out.println("Suma mnogościowa:");
        for(int i=0; i<101; i++)
        {
            if(temp[i] == true)
            {
                System.out.println(i);
            }
        }
        boolean[] temp2 = l1.intersection(l2.tab);
        System.out.println("Iloczyn mnogościowy:");
        for(int i=0; i<101; i++)
        {
            if(temp2[i] == true)
            {
                System.out.println(i);
            }
        }
        System.out.println("Test metody insertElement:");
        l1.insertElement(99);
        System.out.println(l1.tab[99]);
        System.out.println("Test metody deleteElement:");
        l1.deleteElement(99);
        System.out.println(l1.tab[99]);
        System.out.println("Test metody toString:");
        System.out.println(l1.toString());
        IntegerSet l3 = new IntegerSet();
        IntegerSet l4 = new IntegerSet();
        l3.tab[2] = true;
        l4.tab[2] = true;
        System.out.println("Test metody equals:");
        System.out.println(l3.equals(l4.tab));
    }
}
