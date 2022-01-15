package pl.edu.uwm.obiektowe.s155065.kolo1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Osoba> grupa = new ArrayList<>();
        Osoba o1 = new Osoba("Kowalski", LocalDate.parse("1999-12-01"));
        Osoba o2 = new Osoba("Kowalski", LocalDate.parse("1987-11-08"));
        Osoba o3 = new Osoba("Gorlewicz", LocalDate.parse("2000-11-06"));
        Osoba o4 = new Osoba("Bojanowska", LocalDate.parse("2000-11-06"));
        Osoba o5 = new Osoba("Horabik", LocalDate.parse("2000-10-08"));
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);
        for(int i =0; i<5; i++)
        {
            System.out.println(grupa.get(i));
        }
        System.out.println("");
        Collections.sort(grupa);
        for(int i =0; i<5; i++)
        {
            System.out.println(grupa.get(i));
        }
        System.out.println("");

        String sciezka = "plik.txt";
        readFromFile(sciezka);
    }

    public static void readFromFile(String sciezka) {
        File file = new File(sciezka);
        ArrayList<String> lista = new ArrayList<>();
        try
        {
            String s;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((s = br.readLine()) != null) {
                lista.add((s));
            }
        }
        catch (Exception e)
        {
            System.out.println("Nie zanalezino pliku");
        }
    }
}


