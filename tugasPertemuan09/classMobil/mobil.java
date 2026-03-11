/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan09.classMobil;

public class mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void tampilkanSpesifikasi()
    {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk       : " + merk);
        System.out.println("Warna   : " + warna);
        System.out.println("Tahun       : " + tahun);
        System.out.println("");
    }
    public void percepat()
    {
        this.kecepatan += 20;
        System.out.println("Mobil dipercepat. . .");
    }

    public void tampilkanKecepatan()
    {
        System.out.println("Kecepatan saat ini: " + this.kecepatan + " km/jam");
    }
}
