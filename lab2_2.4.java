public class Start {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        System.out.println("wylosowana liczba: " + n);
        int najmniejsza = 0;
        int najwieksza = 0;
        for(int i=0; i<n; i++)
        {
            if (i < najmniejsza) {najmniejsza = i;}
            if (i > najwieksza) {najwieksza = i;}
        }
        System.out.println("najmniejsza liczba to: " + najmniejsza + " ,a największa liczba to: " + najwieksza);
    }
}
