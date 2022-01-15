package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

public class Flet extends Instrument
{
    public String dzw;
    public Flet(String pr, LocalDate rw, String dz)
    {
        super(pr, rw);
        this.dzw = dz;
    }
}