using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayac = int.Parse(Console.ReadLine());

            for (int i = 1; i <= sayac; i++)
            {
                if (i % 2 == 0) Console.WriteLine(i);
            }

            int tekToplam = 0;
            int ciftToplam = 0;
            for (int i = 0; i <= 1000; i++)
            {
                if (i % 2 == 1)
                    tekToplam += i;
                else
                    ciftToplam += i;
            }
            Console.WriteLine("Tek sayıların Toplamı:" + tekToplam + "\nÇift sayıların Toplamı:" + ciftToplam);

            for (int i = 1; i < 10; i++)
            {
                if (i == 5)
                    break;
                Console.WriteLine(i);
            }

            for (int i = 1; i < 10; i++)
            {
                if (i == 3)
                    continue;
                Console.WriteLine(i);
            }

            Console.ReadKey();
        }
    }
}