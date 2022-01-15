package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

public class Fortepian extends Instrument
{
    private String dzw;
    public Fortepian(String pr, LocalDate rw, String dz)
    {
        super(pr, rw);
        this.dzw = dz;
    }
}