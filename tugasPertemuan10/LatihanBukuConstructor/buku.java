/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan10.LatihanBukuConstructor;

// Mengubah nama class agar sesuai dengan isinya
public class buku {
    String judul;
    String pengarang;
    int harga;
    public buku()
    {
        this.judul = "Belum diisi";
        this.pengarang = "Belum Diisi";
        this.harga = 0;
    }

    public buku(String judul, String pengarang, int harga)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("");
    }
}
