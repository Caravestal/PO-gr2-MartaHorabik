package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

class Osoba
{
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;
    Osoba(String im, String nz, String du)
    {
        this.imie = im;
        this.nazwisko = nz;
        if(ChronoUnit.DAYS.between(LocalDate.parse(du), LocalDate.now()) >= 0){this.dataUrodzenia = LocalDate.parse(du);}
        else{this.dataUrodzenia = LocalDate.now();}
        this.wiek = (int) ChronoUnit.YEARS.between(this.dataUrodzenia, LocalDate.now());
    }

    Osoba() {
    }

    public String getImie(){return this.imie;}
    public String getNazwisko(){return this.nazwisko;}
    public LocalDate getDataUrodzenia(){return this.dataUrodzenia;}
    public int getWiek(){return this.wiek;}
    public String toString(){return ("Osoba " + this.imie + " " + this.nazwisko + " urodzona " + this.dataUrodzenia + ", wiek " + this.wiek);}
}
class Pracownik extends Osoba
{
    String stanowisko;
    public double pensja;
    Osoba person;
    Pracownik(Osoba os, String s, double p) {
        this.person = os;
        this.stanowisko = s;
        this.pensja = p;
    }
    Pracownik(String im, String nz, String du) {
        super(im, nz, du);
    }
    public double getPensja(){return this.pensja;}
    public String toString(){return ("Osoba " + person.getImie() + " " + person.getNazwisko() + " urodzona " + person.getDataUrodzenia() + ", wiek " + person.getWiek() + " jest pracownikiem na stanowisku " + this.stanowisko + " z pensja " + this.pensja);}
}
public class Main {

    public static void main(String[] args)
    {
        ArrayList<Osoba> o = new ArrayList<>();
        Osoba os1 = new Osoba("Marta", "Horabik", "2000-08-10");
        Osoba os2 = new Osoba("Martin", "Hory", "2001-08-10");
        Osoba os3 = new Osoba("Malena", "Ernaman", "1973-06-17");
        Osoba os4 = new Osoba("Keanu", "Reeves", "1964-10-02");
        Osoba os5 = new Osoba("Janusz", "Cebula", "2005-04-09");
        Osoba os6 = new Osoba("Brajan", "Cenbula", "1997-12-05");
        os1 = new Pracownik(os1, "Grafik", 100000000);
        os2 = new Pracownik(os2, "SpiewaczkaOperowa", 12000);
        os4 = new Pracownik(os4, "Aktor", 20000);
        o.add(os1);
        o.add(os2);
        o.add(os3);
        o.add(os4);
        o.add(os5);
        o.add(os6);
        for(int i=0; i<6; i++)
        {
            System.out.println(o.get(i).toString());
        }
        double pensja = 0;
//        for(int i=0; i<6; i++)
//        {
//            pensja = pensja + System.out.println(o.get(i).getPensja());
//        }
    }
}
