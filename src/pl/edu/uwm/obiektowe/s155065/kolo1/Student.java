package pl.edu.uwm.obiektowe.s155065.kolo1;

public class Student extends Osoba
{
    public Student(String nazwisko, String kierunek,  String[] im, java.time.LocalDate du, boolean pl, double so)
    {
        super(nazwisko, im, du, pl);
        this.kierunek = kierunek;
        this.sredniaOcen = so;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
    public double getSredniaOcen()
    {
        return this.sredniaOcen;
    }
    public void setSredniaOcen(double so)
    {
        this.sredniaOcen = so;
    }
    private double sredniaOcen;
    private String kierunek;
}