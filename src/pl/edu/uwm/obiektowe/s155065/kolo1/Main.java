package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;

class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski","Jan", LocalDate.parse("2000-10-11"), true, 50000, LocalDate.parse("2045-12-25"));
        ludzie[1] = new Student("Nowak", "Małgorzata", LocalDate.parse("1999-20-11"), false, "Informatyka", 4.9);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}