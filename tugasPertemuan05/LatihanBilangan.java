/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan05;

public class LatihanBilangan {
    public static void main(String[] args)
    {
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        int number = -7; // input : 12 atau -7
        System.out.println("Bilangan : " + number);
        if(number == 0)
        {
            System.out.println("Jenis: Bilangan Nol");
        }
        else
        {
            if( number < 0)
            {
                System.out.println("Jenis: Bilangan Negatif");
            }
            else
            {
                System.out.println("Jenis: Bilangan Positif");
            }

            if( number % 2 == 0)
            {
                System.out.println("Tipe: Genap");
            }
            else
            {
                System.out.println("Tipe: Ganjil");
            }
        }

    }
}
