/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan10.LatihanMobilConstructor;

public class mobil {
    String merk;
    String warna;
    int tahun;
    public mobil()
    {
        this.merk = "Belum diisi";
        this.warna = "Belum Diisi";
        this.tahun = 0;
    }

    public mobil(String merk)
    {
        this.merk = merk;
        this.warna = "Belum Diisi";
        this.tahun = 0;
    }
    public mobil(String merk, String warna, int tahun)
    {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    public void tampilkanSpesifikasi()
    {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk       : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Tahun       : " + tahun);
        System.out.println("");
    }
}
