public class Start {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        System.out.println("wylosowana liczba: " + n);
        int zero = 0;
        int dod = 0;
        int uje = 0;
        for(int i=0; i<n; i++)
        {
            if (i == 0) {zero += 1;}
            else if (i%2 == 0) {dod += 1;}
            else if (i%2 != 0) {uje += 1;}
        }
        System.out.println("jest " + zero + " zer(o), " + dod + " liczb dodatnich i " + uje + " liczb ujemnych");
    }
}
