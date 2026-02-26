/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan07;

public class LatihanTabelPerkalian {
    public static void main(String[] args)
    {
        System.out.println("=== TABEL PERKALIAN ===");
        int angka = 7;
        for(int i = 1; i <= 12; i++)
        {
            int perkalian = i*angka;
            System.out.println(angka + " x " + i + " = " +perkalian);
        }
    }
}
