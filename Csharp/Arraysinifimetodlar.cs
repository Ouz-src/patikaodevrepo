using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] sayiDizisi = { 23, 12, 4, 86, 72, 3, 11, 17 };
            foreach (var sayi in sayiDizisi)
            {
                Console.WriteLine(sayi);
            }
            Console.WriteLine("\n");
            Array.Sort(sayiDizisi);
            foreach (var sayi in sayiDizisi)
            {
                Console.WriteLine(sayi);
            }
            Console.WriteLine("\n");
            Array.Clear(sayiDizisi, 5, 2);
            foreach (var sayi in sayiDizisi)
            {
                Console.WriteLine(sayi);
            }
            Console.WriteLine("\n");
            Array.Reverse(sayiDizisi);
            foreach (var sayi in sayiDizisi)
            {
                Console.WriteLine(sayi);
            }
            Console.WriteLine("\n");
            Console.WriteLine(Array.IndexOf(sayiDizisi, 17));
            
            Console.WriteLine("\n");
            Array.Resize<int>(ref sayiDizisi, 9);
            sayiDizisi[8] = 96;
            foreach (var sayi in sayiDizisi)
            {
                Console.WriteLine(sayi);
            }

            Console.ReadKey();
        }
    }
}