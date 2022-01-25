package pl.edu.uwm.obiektowe.s155065.kolo2;

public abstract class Product
{
    private String name;
    private long id;
    private double price;

    public Product(String name, long id, double price)
    {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName()
    {return name;}

    public void setName(String name)
    {this.name = name;}

    public long getId()
    {return id;}

    public double getPrice()
    {return price;}

    public void setPrice(double price)
    {this.price = price;}

    @Override
    public String toString()
    {
        return "Product: " +
                "name -> " + name +
                ", id -> " + id +
                ", price -> " + price;
    }
}
