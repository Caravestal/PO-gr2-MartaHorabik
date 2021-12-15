package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

abstract class Osoba
{
    private String nazwisko;
    private String imie;
    private LocalDate dataUrodzenia;
    private boolean plec;
    public Osoba(String nazwisko, String imie, LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko() {return nazwisko;}
    public String getImie(){return imie;}
    public LocalDate getDataUrodzenia(){return dataUrodzenia;}
    public boolean getPlec(){return plec;}
}