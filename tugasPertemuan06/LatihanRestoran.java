/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan06;

public class LatihanRestoran {
    public static void main(String[] args)
    {
        System.out.println("=== MENU RESTORAN ===");
        int menuCode = 1; //input menu
        int quantity = 2; //input jumlah
        
        System.out.println("Kode Menu : " + menuCode);
        System.out.println("Jumlah : " + quantity);
        System.out.println("");


        int hargaSatuan = 0;
        String namaMenu = "";
        switch(menuCode)
        {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                hargaSatuan = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                hargaSatuan = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                hargaSatuan = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                hargaSatuan = 3000;
                break;
        }
        System.out.println("Pesanan Anda : ");
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga Satuan : Rp " + hargaSatuan );
        System.out.println("Jumlah : " + quantity);
        
        System.out.println("---");
        int totalBayar = hargaSatuan*quantity;
        System.out.println("Total Bayar : Rp" + totalBayar);
    }
}
