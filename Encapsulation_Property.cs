using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        Ogrenci ogrenci = new();
        ogrenci.Isim = "Ayşe";
        ogrenci.Soyisim = "Yılmaz";
        ogrenci.OgrenciNo = 124;
        ogrenci.Sinif = 3;

        ogrenci.SinifAtlat();
        ogrenci.OgrenciBilgileriniGetir();
        Console.WriteLine("*********************");
        Ogrenci ogrenci1 = new Ogrenci("Deniz", "Arda", 254, 1);
        ogrenci1.OgrenciBilgileriniGetir();
        ogrenci1.SinifDusur();
        ogrenci1.SinifDusur();

        Console.ReadKey();
    }

}

class Ogrenci
{
    private string isim;
    private string soyisim;
    private int ogrenciNo;
    private int sinif;

    public string Isim { get { return isim; } set { isim = value; } }
    public string Soyisim { get => soyisim; set => soyisim = value; }
    public int OgrenciNo { get => ogrenciNo; set => ogrenciNo = value; }
    public int Sinif
    {
        get => sinif;
        set
        {
            if (value < 1)
            {
                Console.WriteLine("Sınıf en az 1 olabilir!");
                sinif = 1;
            }
            else
                sinif = value;
        }
    }

    public Ogrenci() { }
    public Ogrenci(string isim, string soyisim, int ogrenciNo, int sinif)
    {
        Isim = isim;
        Soyisim = soyisim;
        OgrenciNo = ogrenciNo;
        Sinif = sinif;
    }

    public void OgrenciBilgileriniGetir()
    {
        Console.WriteLine("Öğrenci adı:    {0}", this.Isim);
        Console.WriteLine("Öğrenci soyadı: {0}", this.Soyisim);
        Console.WriteLine("Öğrenci no:     {0}", this.OgrenciNo);
        Console.WriteLine("Öğrenci sınıfı: {0}", this.Sinif);
    }

    public void SinifAtlat()
    {
        this.Sinif++;
    }
    public void SinifDusur()
    {
        this.Sinif--;
    }
}