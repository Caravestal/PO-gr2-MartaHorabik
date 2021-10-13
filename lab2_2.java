public class Start {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(11);
        System.out.println("wylosowana liczba: " + n);
        for(int i=0; i<=n; i++)
        {
           if(i != 0)
           {
               System.out.println(i);
           }
        }
        System.out.println(0);
    }
}
