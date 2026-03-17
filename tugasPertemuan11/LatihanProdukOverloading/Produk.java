/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan11.LatihanProdukOverloading;

public class Produk {
    String namaProduk;
    int harga;
    int stok;

    private void setDefault(){
        this.namaProduk = "Unknown";
        this.harga = 0;
        this.stok = 0;
    }

    public Produk(String namaProduk, int harga){
        setDefault();
        this.namaProduk = namaProduk;
        this.harga = harga; 
    }
    public Produk(String namaProduk, int harga, int stok){
        this.namaProduk= namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo(){
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk    : " + this.namaProduk);
        System.out.println("Harga    : " + this.harga);
        System.out.println("Stok    : " + this.stok);
        System.out.println(" ");
    }
}
