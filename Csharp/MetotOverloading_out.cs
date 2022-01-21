using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            string sayi = "999";
            bool sonuc = int.TryParse(sayi, out int outSayi);
            if (sonuc)
                Console.WriteLine("Başarılı, Sayı: {0}", outSayi);
            else
                Console.WriteLine("Başarısız");

            Metotlar instance = new Metotlar();
            int toplamSonuc;
            instance.Topla(2,3, out toplamSonuc);
            Console.WriteLine(toplamSonuc);

            int ifade = 995;
            instance.EkranaYazdır(Convert.ToString(ifade));
            instance.EkranaYazdır(ifade);
            instance.EkranaYazdır("Oguzhan", "Karadeniz");
            Console.ReadKey();
        }
    }

    class Metotlar {
        public void Topla(int a, int b, out int toplam) {
            toplam = a+b;
        }

        public void EkranaYazdır(string veri) {
            Console.WriteLine(veri);
        }
        public void EkranaYazdır(int veri) {
            Console.WriteLine(veri);
        }
        public void EkranaYazdır(string veri1, string veri2) {
            Console.WriteLine(veri1 + veri2);
        }
    }
}
