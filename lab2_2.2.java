public class Start {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(11);
        System.out.println("wylosowana liczba: " + n);
        int wynik = 0;
        for(int i=0; i<n; i++)
        {
            if (i%2 == 0)
            {
            wynik += i;
            }
        }
        int wyn = wynik * 2;
        System.out.println("pdwojony wynik = " + wyn);
    }
}
