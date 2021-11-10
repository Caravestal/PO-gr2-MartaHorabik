class RachunekBankowy
{
    static double rocznaStopaProcentowa;
    private double saldo;

    RachunekBankowy(double sal)
    {
        saldo = sal;
    }

    public void setRocznaStopaProcentowa(double rsp)
    {
        rocznaStopaProcentowa = rsp;
    }

    public double oblicznieMiesieczneOdsetki() {
        saldo = (this.saldo * rocznaStopaProcentowa) / 12;
        return saldo;
    }
}
public class Start
{
    public static void main(String[] args)
    {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver1.setRocznaStopaProcentowa(0.4);
        System.out.println(saver1.oblicznieMiesieczneOdsetki());
        saver2.setRocznaStopaProcentowa(0.4);
        System.out.println(saver2.oblicznieMiesieczneOdsetki());
        saver1.setRocznaStopaProcentowa(0.5);
        System.out.println(saver1.oblicznieMiesieczneOdsetki());
        saver2.setRocznaStopaProcentowa(0.5);
        System.out.println(saver2.oblicznieMiesieczneOdsetki());
    }
}
