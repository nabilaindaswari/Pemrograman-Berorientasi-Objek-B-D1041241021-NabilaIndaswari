/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan10.LatihanBukuConstructor;

public class Main {
    public static void main(String[] args) {
        buku object1 = new buku();
        buku object2 = new buku("Pemrograman Java", "Budi Raharjo", 125000);
        buku object3 = new buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        object1.tampilkanInfo();
        object2.tampilkanInfo();
        object3.tampilkanInfo();
    }
}
