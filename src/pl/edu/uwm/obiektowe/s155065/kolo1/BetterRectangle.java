package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.awt.*;

public class BetterRectangle extends Rectangle
{
    private Rectangle r;
    public BetterRectangle(int x, int y, int wi, int h)
    {
        this.r = new Rectangle();
        this.r.setLocation(x,y);
        this.r.setSize(wi, h);
    }
    public int getParimeter()
    {return 2*this.r.width + 2*this.r.height;}
    public int getArea()
    {return this.r.width * this.r.height;}
}