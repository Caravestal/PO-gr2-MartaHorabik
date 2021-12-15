package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

class Pracownik extends Osoba
{
    private double pobory;
    private LocalDate dataZatrudnienia;
    public Pracownik(String nazwisko,String imie, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko, imie, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory() {return pobory;}
    public LocalDate getDataZatrudnienia(){return dataZatrudnienia;}

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }
}