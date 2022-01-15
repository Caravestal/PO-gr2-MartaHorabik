package pl.edu.uwm.obiektowe.s155065.kolo1;

public class Adres
{
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
    public Adres(String ul, int nd, int nm, String m, String kp)
    {
        this.ulica = ul;
        this.numer_domu = nd;
        this.numer_mieszkania = nm;
        this.miasto = m;
        this.kod_pocztowy = kp;
    }
    public Adres(String ul, int nd, String m, String kp)
    {
        this.ulica = ul;
        this.numer_domu = nd;
        this.miasto = m;
        this.kod_pocztowy = kp;
    }
    public void pokaz()
    {
        System.out.println(this.miasto + " " + this.kod_pocztowy);
        System.out.println(this.ulica + " " + this.numer_domu + " " + this.numer_mieszkania );
    }
    public boolean przed(String ad)
    {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i = 0; i<this.kod_pocztowy.length(); i++)
        {
            if(this.kod_pocztowy.charAt(i) != '-')
            {sb1.append(this.kod_pocztowy.charAt(i));}
        }
        for(int  i = 0; i<ad.length(); i++)
        {
            if(ad.charAt(i) != '-')
            {sb2.append(ad.charAt(i));}
        }
        int a1 = Integer.parseInt(sb1.toString());
        int a2 = Integer.parseInt(sb2.toString());
        if(a1>a2)
            return false;
        return true;
    }
}