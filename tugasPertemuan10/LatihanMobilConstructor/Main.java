/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan10.LatihanMobilConstructor;

public class Main {
    public static void main(String[] args)
    {
        mobil object1 = new mobil();
        mobil object2 = new mobil("Toyota");
        mobil object3 = new mobil("Honda Civic", "Merah", 2023);

        object1.tampilkanSpesifikasi();
        object2.tampilkanSpesifikasi();
        object3.tampilkanSpesifikasi();



    }
}
