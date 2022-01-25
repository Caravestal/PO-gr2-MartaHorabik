package pl.edu.uwm.obiektowe.s155065.kolo2;

public class Shoe extends Product
{
    private String manufacturer;
    private String model;
    public Shoe(String n, long i, double p, String man, String mo)
    {
        super(n, i, p);
        this.manufacturer = man;
        this.model = mo;
    }
    @Override
    public String toString()
    {
        return ("Product: name-> " + getName() + ", id-> " + getId() + ", price-> " + getPrice() + ", monufacturer-> " + this.manufacturer + ", model-> " + this.model);
    }
}
