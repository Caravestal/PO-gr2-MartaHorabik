import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        System.out.println("liczba: " + n);
        System.out.println("pary: ");
        int l = 1;
        boolean p = false;
        int par = 0;
        for(int i=0; i<n; i++)
        {
            l = r.nextInt();
            if(i > 0 && p == true && l > 0)
            {
                par++;
            }
            if(l <= 0)
            {
                p = false;
            }
            if(l > 0)
            {
                p = true;
            }
        }
        System.out.println(par);
    }
}
