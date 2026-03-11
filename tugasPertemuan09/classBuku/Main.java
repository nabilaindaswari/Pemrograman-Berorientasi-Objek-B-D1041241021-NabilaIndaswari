/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan09.classBuku;

public class Main {
    public static void main(String[] args) {
        buku object1 = new buku();
        buku object2 = new buku();
        
        object1.judul = "Pemrograman Java";
        object1.pengarang = "Budi Raharjo";
        object1.harga = 125000;

        object1.tampilkanInfo();

        object2.judul = "Algoritma dan Struktur Data";
        object2.pengarang = "Rinaldi Munir";
        object2.harga = 150000;

        object2.tampilkanInfo();
    }
}
