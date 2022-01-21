using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 2;
            int b = 3;
            Console.WriteLine(a + b);
            int sonuc = Topla(a, b);
            Console.WriteLine(sonuc);
            Metotlar ornek = new Metotlar();
            ornek.EkranaYazdir(Convert.ToString(sonuc));
            int sonuc2 = ornek.ArttırVeTopla(ref a, ref b);
            ornek.EkranaYazdir((a+b).ToString());
            ornek.EkranaYazdir(sonuc2.ToString());
            Console.ReadKey();
        }

        static int Topla(int deger1, int deger2)
        {
            return deger1 + deger2;
        }
    }

    public class Metotlar
    {
        public void EkranaYazdir(string veri)
        {
            Console.WriteLine(veri);
        }

        public int ArttırVeTopla(ref int deger1, ref int deger2)
        {
            deger1 += 1;
            deger2 += 1;
            return deger1 + deger2;
        }
    }
}
