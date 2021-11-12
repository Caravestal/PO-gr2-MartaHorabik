//a
public class Start {

    public static void countChar(String str, char c){
        int len = str.length();
        int wyn = 0;
        for(int i =0; i<len; i++){
            if(str.charAt(i) == c){
                wyn++;
            }
        }
        System.out.println("W tym zdaniu/wyrazie wystepuje: " + wyn + " znków " + c);
    }

    public static void main(String[] args) {
        countChar("aaabbbbccc", 'c');
    }
}
//b
public class Start {

    public static int countSubStr(String str, String subStr)
    {
        int kt = 0;
        int wyn = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == subStr.charAt(kt))
            {
                kt++;
            }
            if(kt == subStr.length()-1)
            {
                wyn++;
                kt=0;
            }
        }
        return wyn;
    }

    public static void main(String[] args) {
        System.out.println("Ten napis pojawia się w tym napisie: " + countSubStr("abcdef", "cd") + " razy");
    }
}
//c
public class Start {

    public static char middle(String str)
    {
        int len = str.length();
        if(len%2==0){
            int a = len/2;
            return str.charAt(a);
        }
        float b = (float) ((len/2) + 0.5);
        return str.charAt((int)b);
    }

    public static void main(String[] args) {
        System.out.println(middle("middle"));
        System.out.println(middle("kot"));
    }
}
//d
public class Start
{
    public static char repeat(String str, int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.println(str);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        repeat("ho", 3);
    }
}
//e
