package tugasPertemuan03;

/*
Nama : Nabila Indaswari
NIM : D1041241021

*/


public class LatihPerhitungan {
    public static void main(String[] args)
    {
        int saldo = 1000000; //inisialisasi saldo awal
        
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal                  : "+ saldo);

        int setoran = 500000; //saldo yang akan di setor
        System.out.println("Setoran                     : "+ setoran);
        saldo += setoran; //setoran ditambahkan ke saldo

        System.out.println("Saldo Setelah Setor         : "+ saldo);
        
        int penarikan = 250000; //inisialisasi jumlah penarikan
        saldo -= penarikan; //saldo dikurang dengan jumlah penarikan

        System.out.println("Penarikan                   : "+ penarikan);
        System.out.println("Saldo Akhir                 : "+ saldo);
    
    }
    
}
