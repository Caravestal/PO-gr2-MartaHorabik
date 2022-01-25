package pl.edu.uwm.obiektowe.s155065.kolo2;

public class Shirt extends Product
{
    private String manufacturer;
    private String size;
    private boolean slimFit;
    public Shirt(String n, long i, double p, String man, String s, boolean sf)
    {
        super(n, i, p);
        this.manufacturer = man;
        this.size = s;
        this.slimFit = sf;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", monufacturer-> " + this.manufacturer + ", size-> " + this.size + ", slimFit-> " + this.slimFit;
    }
}