package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

public class Student extends Osoba implements Inter
{
    Double SredniaOcen;
    public Student(String n, LocalDate du, Double so)
    {
        super(n, du);
        this.SredniaOcen = so;
    }

    public Double GetSredniaOcen()
    {
        return this.SredniaOcen;
    }
    public int compareTo(Object o)
    {
        Student st = (Student) o;
        if(this.equals(st))
            return 0;
        else
        {
            if(this.GetNazwisko().equals(st.GetNazwisko()))
                return -3;
            if(this.GetDataUrodzenia().equals(st.GetDataUrodzenia()))
                return -2;
            if(this.GetSredniaOcen().equals(st.GetSredniaOcen()))
                return -1;
        }
        return 0;
    }
}
