using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Lütfen bir sayı girin (n): ");
            int n = int.Parse(Console.ReadLine());
            string[] kelimeler = new string[n];
            Console.WriteLine("{0} tane kelime girin:",n);
            for (int i = 0; i < n; i++)
            {
                kelimeler[i] = Console.ReadLine();
            }

            Array.Reverse(kelimeler);
            foreach (var kelime in kelimeler)
            {
                Console.Write(kelime + " ");
            }

            Console.ReadKey();
        }
    }
}
