using System;

namespace Csharprogram
{
    class Program
    {
        static void Main(string[] args)
        {
            double sayi = double.Parse(Console.ReadLine());
            double sayac = 1;
            double toplam = 0;
            while (sayac <= sayi)
            {
                toplam += sayac;
                sayac++;
            }

            Console.WriteLine(toplam / sayi);

            char character = 'a';
            while (character <= 'z')
            {
                Console.Write(character);
                character++;
            }

            string[] arabalar = {"Porsche", "BMW", "Audi", "Ford", "Subaru"};
            Console.WriteLine(arabalar[0]);
            foreach (var araba in arabalar)
            {
                Console.WriteLine(araba);
            }

            Console.ReadKey();
        }
    }
}