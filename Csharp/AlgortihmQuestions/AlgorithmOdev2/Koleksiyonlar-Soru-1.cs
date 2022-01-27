using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        ArrayList sayilar = new ArrayList();
        int n = 0;
        Console.WriteLine("Lütfen 20 adet pozitif tam sayı giriniz.");
        while (n < 5)
        {
            int sayi = 0;
            if (int.TryParse(Console.ReadLine(), out sayi))
            {
                if (sayi > 0)
                {
                    sayilar.Add(sayi);
                    n++;
                }
                else
                {
                    Console.WriteLine("Sadece pozitif tam sayı giriniz.");
                }
            }
            else
            {
                Console.WriteLine("Sadece pozitif tam sayı giriniz.");
            }
        }
        ArrayList asalSayilar = new ArrayList();
        ArrayList asalOlmayanSayilar = new ArrayList();

        foreach (int sayi in sayilar)
        {
            int asalKontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    asalKontrol++;
                }
            }
            if (asalKontrol == 0)
                asalSayilar.Add(sayi);
            else
                asalOlmayanSayilar.Add(sayi);
        }

        sayilar.Sort();
        asalSayilar.Sort();
        asalOlmayanSayilar.Sort();

        sayilar.Reverse();
        asalSayilar.Reverse();
        asalOlmayanSayilar.Reverse();

        Console.Write("Girilen sayılar:");
        foreach (var item in sayilar)
            Console.Write(" " + item);
        Console.Write("\nAsal sayılar:");
        foreach (var item in asalSayilar)
            Console.Write(" " + item);
        Console.Write("\nAsal olmayan sayılar:");
        foreach (var item in asalOlmayanSayilar)
            Console.Write(" " + item);

        Console.WriteLine("\n           Asal sayılar\nEleman Sayısı: {0}     Elemanların ortalaması: {1}", asalSayilar.Count, OrtalamaDöndürme(asalSayilar));
        Console.WriteLine("\n           Asal olmayan sayılar\nEleman Sayısı: {0}     Elemanların ortalaması: {1}", asalOlmayanSayilar.Count, OrtalamaDöndürme(asalOlmayanSayilar));

        Console.ReadKey();
    }

    static float OrtalamaDöndürme(ArrayList arrayList)
    {
        float toplam = 0;
        foreach (int eleman in arrayList)
        {
            toplam += eleman;
        }
        return toplam / arrayList.Count;
    }
}