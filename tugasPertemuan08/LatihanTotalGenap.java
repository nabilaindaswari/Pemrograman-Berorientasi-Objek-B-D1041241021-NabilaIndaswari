/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan08;

public class LatihanTotalGenap {
    public static void main(String[] args)
    {
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        int total = 0;
        for(int angka = 1; angka <= 20; angka++){
            if(angka%2 != 0){
                continue;
            }
            else{
                total+= angka;
                System.out.println("Tambah: "+ angka + "-> Total: "+total);
            }
        }
        
        System.out.println("---");
        System.out.println("Total akhir: "+ total);
    }
    
}
