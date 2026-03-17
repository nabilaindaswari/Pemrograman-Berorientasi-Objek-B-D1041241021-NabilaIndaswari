/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan13;

public class ArrayNama {
    public static void main(String[] args){
        System.out.println("=== DAFTAR NAMA ===");
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " . " + nama[i-1]);
        }
    }
}
