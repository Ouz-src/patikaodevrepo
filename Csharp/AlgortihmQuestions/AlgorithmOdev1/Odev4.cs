using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Lütfen bir cümle yazın.");
            string cumle = Console.ReadLine();
            int kelimeSayisi, harfSayisi;

            string[] kelimeler = cumle.Split(" ");
            kelimeSayisi = kelimeler.Length;
            Console.WriteLine("Bu cümlede toplam {0} tane kelime var.",kelimeSayisi);
            char[] harfler = string.Join("",kelimeler).ToCharArray();
            harfSayisi = harfler.Length;
            Console.WriteLine("Bu cümlede toplam {0} tane harf var.", harfSayisi);
            Console.ReadKey();
        }
    }
}
