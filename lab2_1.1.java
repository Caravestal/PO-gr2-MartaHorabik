import static java.lang.Math.*;
import java.util.Random;
//zad.1.a
public class Start {
    public static void main(String[] args){
        int wynik = 0;
        for(int i =0; i<=9; i++)
        {
            wynik += i;
        }
        System.out.println(wynik);
    }
}
//zad.1.b
public class Start {
    public static void main(String[] args){
        int wynik = 1;
        for(int i=1; i<=9; i++)
        {
            wynik *= i;
        }
        System.out.println(wynik);
    }
}
//zad.1.c
public class Start {
    public static void main(String[] args){
        int wynik = 0;
        for(int i=0; i<=9; i++)
        {
            wynik += abs(i);
        }
        System.out.println(wynik);
    }
}
//zad.1.d
public class Start {
    public static void main(String[] args){
        int wynik = 0;
        Random r = new Random();
        int n = r.nextInt(11);
        for(int i=0; i<=n; i++)
        {
            wynik += sqrt(abs(i));
        }
        System.out.println(n);
        System.out.println(wynik);
    }
}
//zad.1.e
public class Start {
    public static void main(String[] args){
        int wynik = 1;
        Random r = new Random();
        int n = r.nextInt(11);
        for(int i=1; i<=n; i++)
        {
            wynik *= abs(i);
        }
        System.out.println(n);
        System.out.println(wynik);
    }
}
//zad.1.f
public class Start {
    public static void main(String[] args){
        int wynik = 0;
        Random r = new Random();
        int n = r.nextInt(11);
        for(int i=0; i<=n; i++)
        {
            wynik += pow(i,2);
        }
        System.out.println(n);
        System.out.println(wynik);
    }
}
//zad.1.g
public class Start {
    public static void main(String[] args){
        int wynik = 0;
        int wyn = 1;
        Random r = new Random();
        int n = r.nextInt(11);
        for(int i=1; i<=n; i++)
        {
            wynik += i;
            wyn *=i;
        }
        System.out.println(n);
        System.out.println(wynik);
        System.out.println(wyn);
    }
}
//zad.1.h
public class Start {
    public static void main(String[] args){
        int wynik = 0;
        Random r = new Random();
        int n = r.nextInt(11);
        for(int i=1; i<=n; i++)
        {
            wynik += pow(-1, i+1)*i;
        }
        System.out.println(n);
        System.out.println(wynik);
    }
}
//zad.1.i
public class Start {
    public static void main(String[] args){
        double wynik = 0;
        Random r = new Random();
        int n = r.nextInt(11);
        for(int i=1; i<=n; i++)
        {
            int a = 1;
            for(int j=1; j<=i; j++)
            {
                a *= j;
            }
            double l = (pow(-1, n)*i);
            wynik += l/a;
            System.out.println("Wynik dla i=" + i + "=" + wynik);
        }
        System.out.println(n);
        System.out.println(wynik);
    }
}
