using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 0, m = 0;
            Console.Write("Lütfen iki adet pozitif sayı girin.");
            for (int i = 0; i < 2; i++)
            {
                if (i == 0)
                {
                    Console.Write("\nBirinci sayı n: ");
                    n = int.Parse(Console.ReadLine());
                }
                else
                {
                    Console.Write("İkinci sayı m: ");
                    m = int.Parse(Console.ReadLine());
                }
            }

            int[] dizi = new int[n];

            for (int i = 0; i < n; i++)
            {
                Console.Write("{0}. sayıyı giriniz: ", i+1);
                dizi[i] = int.Parse(Console.ReadLine());
            }
            Console.Write("m sayısına tam bölünen veya eşit olan sayılar:");
            esitVeyaTamBolunen(dizi, m);
            Console.ReadKey();
        }

        public static void esitVeyaTamBolunen(int[] arr, int x) {
            foreach (var sayi in arr)
            {
                if(sayi == x || sayi%x == 0) {
                    Console.Write(" " + sayi);
                }
            }
        }
    }
}
