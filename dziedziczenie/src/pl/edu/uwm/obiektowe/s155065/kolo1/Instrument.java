package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

public abstract class Instrument
{
    private String producent;
    private LocalDate rokProdukcji;
    public Instrument(String pr, LocalDate rp)
    {
        this.producent = pr;
        this.rokProdukcji = rp;
    }
    public String getProducent()
    {
        return this.producent;
    }
    public LocalDate getRokProdukcji()
    {
        return this.rokProdukcji;
    }
    public String dzwiek(String dzw)
    {
        return dzw;
    }
    public boolean equals(Instrument is)
    {
        return this.equals(is);
    }
    public String toString()
    {
        return (this.producent + ", " + this.rokProdukcji);
    }
}