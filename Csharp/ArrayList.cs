using System;
using System.Collections;

namespace array_list
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList liste = new ArrayList();
            /*liste.Add("Ayşe");
            liste.Add(2);
            liste.Add(true);
            liste.Add('A');*/
            //Console.WriteLine(liste[1]);

            //foreach (var item in liste)
            //    Console.WriteLine(item);

            //string[] renkler = { "Kırmızı", "Sarı", "Yeşil" };
            //liste.AddRange(renkler);
            List<int> sayılar = new List<int>() { 1, 8, 3, 7, 9, 92, 5 };
            liste.AddRange(sayılar);

            foreach (var item in liste)
                Console.WriteLine(item);

            liste.Sort();

            foreach (var item in liste)
                Console.WriteLine(item);

            Console.WriteLine(liste.BinarySearch(9));

            liste.Reverse();

            foreach (var item in liste)
                Console.WriteLine(item);

            liste.Clear();

            foreach (var item in liste)
                Console.WriteLine(item);

            Console.ReadKey();
        }
    }
}