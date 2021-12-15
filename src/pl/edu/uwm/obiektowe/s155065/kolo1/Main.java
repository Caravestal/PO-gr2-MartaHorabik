package pl.edu.uwm.obiektowe.s155065.kolo1;

public class Main {

    public static void main(String[] args)
    {
	    Adres a = new Adres("Lipowa", 13, 85, "Elk", "78-345");
        a.pokaz();
        System.out.println(a.przed("10-687"));
        Student s = new Student("Kowalski", 2001, "Informatyka");
        BetterRectangle xyz = new BetterRectangle(1,1,4,5);
        System.out.println(xyz.getArea());
        System.out.println(xyz.getParimeter());
    }
}
