package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

class Student extends Osoba
{
    private String kierunek;
    private double sredniaOcen;
    public Student(String nazwisko, String imie, LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaOcen)
    {
        super(nazwisko, imie, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {return "kierunek studiów: " + kierunek;}
    public String getSredniaOcen(){return ("srednia ocen: " + sredniaOcen);}
}