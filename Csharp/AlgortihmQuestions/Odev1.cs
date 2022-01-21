using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Eleman sayısını girin: ");
            int n = int.Parse(Console.ReadLine());

            int[] dizi = new int[n];

            for (int i = 0; i < n; i++)
            {
                Console.Write("{0}. sayıyı girin: ", i + 1);
                dizi[i] = int.Parse(Console.ReadLine());
            }

            Console.Write("Çift sayılar:");
            foreach (var sayi in dizi)
            {
                if (sayi % 2 == 0)
                    Console.Write(" " + sayi);
            }

            Console.ReadKey();
        }
    }
}
