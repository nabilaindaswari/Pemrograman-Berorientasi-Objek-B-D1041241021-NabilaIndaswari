/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan05;

public class LatihanDiskon {
    public static void main(String[] args)
    {
        System.out.println("=== KALKULATOR DISKON ===");
        double totalBelanja = 750000.0; // bisa masukkan input lain disini
        System.out.println("Total Belanja : Rp"+ totalBelanja);
        double totalDiskon;
        if(totalBelanja < 100000)
        {
            totalDiskon = totalBelanja*0/100;
            System.out.println("Diskon (0%) : Rp " + totalDiskon);

        }
        else if(totalBelanja < 499999)
        {
            totalDiskon = totalBelanja*5/100;
            System.out.println("Diskon (5%) : Rp " + totalDiskon);
        }
        else if(totalBelanja < 999999)
        {
            totalDiskon = totalBelanja*10/100;    
            System.out.println("Diskon (10%) : Rp " + totalDiskon);
        }
        else
        {
            totalDiskon = totalBelanja*15/100;
            System.out.println("Diskon (15%) : Rp " + totalDiskon);
        }

        double hargaAkhir = totalBelanja-totalDiskon;
        System.out.println("Harga Akhir: Rp"+ hargaAkhir);
        System.out.println("Anda hemat: Rp"+ totalDiskon);
        
    }
}
