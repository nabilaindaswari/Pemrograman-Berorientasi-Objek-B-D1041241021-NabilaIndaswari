package tugasPertemuan03;

/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/



public class LatihLiteral {
    public static void main(String[] args) {
        
        byte nilaiByte = 127;  // maksimum byte adalah 127
        
        short tahun = 2026; //// tahun saat ini = 2026
        int populasiIndo = 275000000; 
        long populasiDunia = 8000000000L; 
        float nilaiPi = 3.14f; 
        double nilaiE = 2.718281828; 
        
        char hurufAwal = 'N';    // Nabila = Huruf pertama = N

        boolean status = true;

        //pengeluaran output
        System.out.println("=== DEMONSTRASI LITERAL TIPE DATA ===");
        System.out.println("Tipe byte    : " + nilaiByte);
        System.out.println("Tipe short   : " + tahun);
        System.out.println("Tipe int     : " + populasiIndo);
        System.out.println("Tipe long    : " + populasiDunia);
        System.out.println("Tipe float   : " + nilaiPi);
        System.out.println("Tipe double  : " + nilaiE);
        System.out.println("Tipe char    : " + hurufAwal);
        System.out.println("Tipe boolean : " + status);
    }
}