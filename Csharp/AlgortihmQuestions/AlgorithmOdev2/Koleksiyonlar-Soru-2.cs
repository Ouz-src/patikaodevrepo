using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        int[] sayilar = new int[20];
        for (int i = 0; i < 20; i++)
        {
            Console.WriteLine("{0}. elemanı giriniz: ", i + 1);
            sayilar[i] = int.Parse(Console.ReadLine());
        }

        Array.Sort(sayilar);
        int[] enKucuk3 = { sayilar[0], sayilar[1], sayilar[2] };
        int[] enBuyuk3 = { sayilar[sayilar.Length - 1], sayilar[sayilar.Length - 2], sayilar[sayilar.Length - 3] };
        float enkucuk3Top = 0;
        float enbuyuk3Top = 0;
        foreach (var item in enKucuk3)
            enkucuk3Top += item;
        foreach (var item in enBuyuk3)
            enbuyuk3Top += item;
        Console.WriteLine("En küçük 3 sayının ortalaması: {0}\nEn büyük 3 sayının ortalaması: {1}", enkucuk3Top / enKucuk3.Length, enbuyuk3Top / enBuyuk3.Length);
        Console.ReadKey();
    }
}