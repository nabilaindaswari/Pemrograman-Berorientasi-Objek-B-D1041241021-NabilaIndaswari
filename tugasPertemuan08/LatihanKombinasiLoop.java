/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan08;

public class LatihanKombinasiLoop {
    public static void main(String[] args){
        boolean isFound = false; //menggunakan boolean untuk menghentikan loop pada outer
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        for(int outerLoop = 1; outerLoop <= 3; outerLoop++){
            for(int innerLoop = 1; innerLoop <= 5; innerLoop++){
                System.out.println("Cek : [" + outerLoop+ ","+ innerLoop+"]");
                if(innerLoop == 3 && outerLoop == 2){
                    System.out.println("Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    isFound= true; 
                    break;
                }
            }
            if(isFound){
                break;
            }
            
        }
    }
}
