package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

public class Skrzypce extends Instrument
{
    public String dzw;
    public Skrzypce(String pr, LocalDate rw, String dz)
    {
        super(pr, rw);
        this.dzw = dz;
    }
}