/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan10.LatihanPersegiConstructor;

public class persegi {
   int sisi;
   int luas;
   int keliling;

   public persegi(int sisi) { 
    if (sisi <= 0) { 
        System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1)."); 
        this.sisi = 1; 
    } else { 
        this.sisi = sisi; 
    } 
    this.luas = this.sisi * this.sisi; 
    this.keliling = 4 * this.sisi; 
} 

   public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi        : " + this.sisi + " cm");
        System.out.println("Luas        : " + this.luas + " cm^2");
        System.out.println("Keliling    : " + this.keliling + " cm");
        System.out.println("");
   }
}
