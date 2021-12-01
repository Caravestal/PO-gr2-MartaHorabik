package pl.edu.uwm.obiektowe.s155065.kolo1;

public class Student extends Osoba
{
    private String kierunek;
    public Student(String nazwisko, int rokUrodzenia, String k)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek = k;
    }
    public String getKirunek(){return this.kierunek;}
}
