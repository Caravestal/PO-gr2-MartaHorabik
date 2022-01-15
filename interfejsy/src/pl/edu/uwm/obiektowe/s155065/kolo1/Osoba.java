package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

public class Osoba implements Inter
{
    private String Nazwisko;
    private LocalDate DataUrodzenia;
    public Osoba(String n, LocalDate du)
    {
        this.Nazwisko = n;
        this.DataUrodzenia = du;
    }

    public String GetNazwisko()
    {
        return this.Nazwisko;
    }
    public LocalDate GetDataUrodzenia()
    {
        return this.DataUrodzenia;
    }
    @Override
    public int compareTo(Object o)
    {
        Osoba os = (Osoba) o;
        if(this.equals(os))
            return 0;
        else
        {
            if(this.GetNazwisko().equals(os.GetNazwisko()))
                return -2;
            if(this.GetDataUrodzenia().equals(os.GetDataUrodzenia()))
                return -1;
        }
        return 0;
    }
    @Override
    public String toString()
    {
        return ("Osoba: [" + this.Nazwisko + "] [" + this.DataUrodzenia + "]");
    }
    public boolean equals(Osoba os)
    {
        if(!this.Nazwisko.equals(os.GetNazwisko()))
            return false;
        else
            return this.DataUrodzenia.equals(os.GetDataUrodzenia());
    }
}
