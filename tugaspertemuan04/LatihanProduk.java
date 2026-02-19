/*
Nama : Nabila Indaswari
NIM : D1041241021

*/

package tugaspertemuan04;

public class LatihanProduk {
    public static void main(String[] args)
    {
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean isAvailable = true;
        final double PAJAK = 0.11;

        int totalStok = hargaSatuan*jumlahStok;
        int totalPajak = (int) (totalStok* PAJAK);

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga Satuan : Rp "+ hargaSatuan);
        System.out.println("Jumlah Stok : " + jumlahStok);
        System.out.println("Status Tersedia : " + isAvailable);
        System.out.println("---");
        System.out.println("Total Nilai Stok : Rp "+ totalStok);
        System.out.println("Pajak (11%) : Rp "+ totalPajak);
    }

}
