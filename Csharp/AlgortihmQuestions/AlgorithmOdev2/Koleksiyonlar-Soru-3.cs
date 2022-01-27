using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        string cumle = Console.ReadLine();
        char[] harfler = cumle.ToCharArray();
        List<char> sesliHarfler = new List<char>();
        foreach (var harf in harfler)
        {
            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü')
            {
                sesliHarfler.Add(harf);
            }
        }

        sesliHarfler.Sort();

        Console.WriteLine("Sesli harfler: ");
        foreach (var item in sesliHarfler)
        {
            Console.Write(item+" ");
        }

        Console.ReadKey();
    }
}