using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        Console.WriteLine("Çalışan sayısı: {0}", Calisan.CalisanSayisi);
        Calisan calisan = new("Ayşe", "Yılmaz", "İnsan Kaynakları");
        Console.WriteLine("Çalışan sayısı: {0}", Calisan.CalisanSayisi);
        Calisan calisan1 = new("Deniz", "Arda", "İnsan Kaynakları");
        Calisan calisan2 = new("Abidin", "Alemdar", "İnsan Kaynakları");
        Console.WriteLine("Çalışan sayısı: {0}", Calisan.CalisanSayisi);

        Console.WriteLine("Toplama işlemi sonucu: {0}", Islemler.Topla(100,200));
        Console.WriteLine("Toplama işlemi sonucu: {0}", Islemler.Cikar(100,200));

        Console.ReadKey();
    }
}

class Calisan
{
    private static int calisanSayisi;
    public static int CalisanSayisi { get => calisanSayisi; set => calisanSayisi = value; }

    private string Isim;
    private string Soyisim;
    private string Departman;

    static Calisan()
    {
        calisanSayisi = 0;
    }

    public Calisan(string isim, string soyisim, string departman)
    {
        this.Isim = isim;
        this.Soyisim = soyisim;
        this.Departman = departman;
        calisanSayisi++;
    }
}

static class Islemler
{
    public static long Topla(int sayi1, int sayi2)
    {
        return sayi1 + sayi2;
    }
    public static long Cikar(int sayi1, int sayi2)
    {
        return sayi1 - sayi2;
    }
}