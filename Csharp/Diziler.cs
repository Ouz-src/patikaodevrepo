using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] renkler = new string[5];
            string[] hayvanlar = { "Kedi, Köpke, Kuş, Maymun" };

            int[] dizi;
            dizi = new int[5];

            renkler[0] = "Mavi";
            dizi[3] = 10;

            Console.WriteLine(hayvanlar[0]);
            Console.WriteLine(dizi[3]);
            Console.WriteLine(renkler[0]);

            Console.WriteLine("Lütfen dizinin eleman sayısını girin: ");
            int n = int.Parse(Console.ReadLine());
            int[] sayıDizisi = new int[n];
            float toplam = 0;

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("{0}. elemanı giriniz: ", i+1);
                sayıDizisi[i] = int.Parse(Console.ReadLine());
                toplam += sayıDizisi[i]; 
            }
            Console.WriteLine("Girdiğiniz sayıların ortalaması: " + toplam/n);
            toplam = 0;

            foreach (var sayi in sayıDizisi)
            {
                toplam += sayi;    
            }
            Console.WriteLine(toplam/n);

            Console.ReadKey();
        }
    }
}