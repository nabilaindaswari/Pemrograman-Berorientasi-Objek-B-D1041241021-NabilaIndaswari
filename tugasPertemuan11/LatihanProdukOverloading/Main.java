/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan11.LatihanProdukOverloading;

public class Main {
    public static void main(String[] args)
    {
        Produk produk1 = new Produk("Laptop ASUS", 8500000);
        Produk produk2 = new Produk("Mouse Logitech", 25000, 50);
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();        
    }
}
