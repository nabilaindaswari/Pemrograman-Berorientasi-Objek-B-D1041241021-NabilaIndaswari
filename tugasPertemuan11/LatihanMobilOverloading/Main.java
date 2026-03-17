/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan11.LatihanMobilOverloading;

public class Main {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}
