public class Start {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(11);
        System.out.println("wylosowana liczba: " + n);
        int[] tab = new int[n];
        System.out.println("nasza tablica z 0-wym indekcem na koncu: ");
        for(int i=0; i<n; i++)
        {
           tab[i] = i;
            if(tab[i]!=0)
            {
                System.out.println(tab[i]);
            }
        }
        System.out.println(tab[0]);

    }
}
