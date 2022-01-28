using System;
using System.Collections;

class Solution
{
    static void Main(String[] args)
    {
        Calisan calisan1 = new ("Ayşe","Kara",23415634,"İnsan Kaynakları");

        calisan1.CalisanBilgileri();
        Console.WriteLine("***************");

        Calisan calisan2 = new ();
        calisan2.ad = "Deniz";
        calisan2.soyad = "Arda";
        calisan2.no = 25646789;
        calisan2.departman = "Satın Alma";

        calisan2.CalisanBilgileri();
        Console.WriteLine("***************");
        Calisan calisan3 = new("Oğuzhan","Karadeniz");
        calisan3.CalisanBilgileri();

        Console.ReadKey();
    }

}

class Calisan
{
    public string ad;
    public string soyad;
    public int no;
    public string departman;

    public Calisan(string Ad, string Soyad, int No, string Departman) {
        this.ad = Ad;
        this.soyad = Soyad;
        this.no = No;
        this.departman = Departman;
    }
    public Calisan(string Ad, string Soyad) {
        this.ad = Ad;
        this.soyad = Soyad;
    }

    public Calisan () {}

    public void CalisanBilgileri()
    {
        Console.WriteLine("Çalışan Adı: {0}", ad);
        Console.WriteLine("Çalışan Soyadı: {0}", soyad);
        Console.WriteLine("Çalışan Numarası: {0}", no);
        Console.WriteLine("Çalışan Departmanı: {0}", departman);
    }
}