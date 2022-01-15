package pl.edu.uwm.obiektowe.s155065.kolo1;

public class Nauczyciel extends Osoba
{
    private int pensja;
    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja)
    {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    public int getPensja(){return this.pensja;}
}
