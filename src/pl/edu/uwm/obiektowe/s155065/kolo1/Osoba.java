package pl.edu.uwm.obiektowe.s155065.kolo1;

public class Osoba
{
    private String nazwisko;
    private int rokUrodzenia;
    public Osoba(String n, int ru)
    {
        this.nazwisko = n;
        this.rokUrodzenia = ru;
    }
    public String getNazwisko(){return this.nazwisko;}
    public int getRokUrodzenia(){return this.rokUrodzenia;}
}
