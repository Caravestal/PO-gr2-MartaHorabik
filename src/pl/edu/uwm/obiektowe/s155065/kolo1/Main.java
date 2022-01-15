package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.time.LocalDate;
import java.util.ArrayList;

class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        String[] imiona = {"Jan", "Janusz"};
        String[] imiona2 = {"Małgożata"};
        ludzie[0] = new Pracownik("Kowalski", 1000, imiona, LocalDate.parse("1999-01-06"), true, LocalDate.parse("2021-09-04"));
        ludzie[1] = new Student("Nowak", "informatyka", imiona2, LocalDate.parse("1998-13-07"), false, 4.2);
        //ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
        ArrayList<Instrument> orchestra = new ArrayList<>();
        Flet fl1 = new Flet("asdas", LocalDate.parse("1999-12-01"), "fifi");
        Flet fl2 = new Flet("grreg", LocalDate.parse("1995-12-01"), "fifo");
        Fortepian fo1 = new Fortepian("advf", LocalDate.parse("1995-11-11"), "dzdz");
        Fortepian fo2 = new Fortepian("advf", LocalDate.parse("1995-11-11"), "dzdz");
        Skrzypce s = new Skrzypce("sdf", LocalDate.parse("1923-10-23"), "lala");
        orchestra.add(fl1);
        orchestra.add(fl2);
        orchestra.add(fo1);
        orchestra.add(fo2);
        orchestra.add(s);
        for(int i =0; i<5; i++)
        {
            System.out.println(orchestra.get(i).dzwiek(orchestra.get(i).dzw));
        }
    }
}