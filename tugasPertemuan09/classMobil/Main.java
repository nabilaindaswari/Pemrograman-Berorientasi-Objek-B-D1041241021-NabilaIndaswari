/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan09.classMobil;

public class Main {
    public static void main(String[] args)
    {
        mobil mobil1 = new mobil();

        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        mobil1.tampilkanSpesifikasi();
        mobil1.percepat();
        mobil1.percepat();

        mobil1.tampilkanKecepatan();



    }
}
