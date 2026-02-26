/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan06;

public class LatihanHariBulan {
    public static void main(String[] args){
        
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        int month = 4; // input berupa angka bulan
        String monthStr = "";

        switch(month)
        {
            case 1:
                monthStr = "Januari";
                break;
            case 2:
                monthStr = "Februari";
                break;
            case 3:
                monthStr = "Maret";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "Mei";
                break;
            case 6:
                monthStr = "Juni";
                break;
            case 7:
                monthStr = "Juli";
                break;
            case 8:
                monthStr = "Agustus";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "Oktober";
                break;
            case 11:
                monthStr = "November";
                break;
            case 12:
                monthStr = "Desember";
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
        System.out.println("Bulan : "+ monthStr + " (bulan ke-" + month +")");

        

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah hari: 31 hari");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah hari: 30 hari");
                break;

            case 2:
                System.out.println("Jumlah hari: 28 hari");
                break;
            
            default:
                System.out.println("Error: Bulan tidak valid");
                break;
        }
    }
}
