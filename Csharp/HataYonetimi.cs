using System;

namespace Csharprogram
{
    class HataYonetimi
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Bir sayı giriniz: ");
                int sayi = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Girmiş olduğunuz sayı: " + sayi);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Hata: " + ex.Message);
            }
            /*finally
            {
                Console.Write("İşlem tamamlandı.");
            }*/

            try
            {
                //int a = int.Parse(null);
                //int a = int.Parse("test");
                int a = int.Parse("-20000000000000");
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine("Boş değer girildi\n" + ex);
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Hatalı format\n" + ex);
            }
            catch (OverflowException ex)
            {
                Console.WriteLine("Çok küçük ya da çok büyük değer girdiniz\n" + ex);
            }
            finally
            {
                Console.Write("İşlem tamamlandı.");
            }
            Console.ReadKey();
        }
    }
}