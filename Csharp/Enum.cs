using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        Console.WriteLine(Gunler.Pazar);
        Console.WriteLine((int)Gunler.Cumartesi);

        int sıcaklık = int.Parse(Console.ReadLine());

        if (sıcaklık <= (int)HavaDurumu.Normal)
            Console.WriteLine("Dışarıya çıkmak için havanın biraz daha ısınmasını bekleyelim.");
        else if (sıcaklık >= (int)HavaDurumu.Sıcak)
            Console.WriteLine("Dışarıya çıkmak için çok sıcak bir gün.");
        else if (sıcaklık >= (int)HavaDurumu.Normal && sıcaklık < (int)HavaDurumu.CokSıcak)
            Console.WriteLine("Hadi dışarıya çıkalım.");

        Console.ReadKey();
    }

    enum Gunler
    {
        Pazartesi = 1,
        Salı,
        Çarşamba,
        Perşembe,
        Cuma = 23,
        Cumartesi,
        Pazar
    }

    enum HavaDurumu
    {
        Soguk = 5,
        Normal = 20,
        Sıcak = 30,
        CokSıcak = 50
    }
}