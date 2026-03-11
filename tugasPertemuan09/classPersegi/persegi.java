// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan09.classPersegi;

public class persegi {
   int sisi;
   int luas;
   int keliling;

   public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi        : " + this.sisi + " cm");
        System.out.println("Luas        : " + this.luas + " cm^2");
        System.out.println("Keliling    : " + this.keliling + " cm");
        System.out.println("");
   }

   public void hitungLuas() {
        this.luas = sisi*sisi;
    }

   public void hitungKeliling() {
        this.keliling = sisi*4;
    }
}
