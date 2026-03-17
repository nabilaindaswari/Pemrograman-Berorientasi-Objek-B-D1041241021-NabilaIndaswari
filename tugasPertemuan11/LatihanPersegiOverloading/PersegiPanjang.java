/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/
package tugasPertemuan11.LatihanPersegiOverloading;

public class PersegiPanjang {
    int panjang;
    int lebar;
    int luas;
    int keliling;

    public PersegiPanjang(int sisi){
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = sisi*sisi;
        this.keliling = 4*sisi;
    }

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang*lebar;
        this.keliling = 2*(panjang+lebar);
    }

    public void tampilkanInfo(){
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang     : "+ this.panjang + " cm");
        System.out.println("Lebar       : "+ this.lebar + " cm");
        System.out.println("Luas        : "+ this.luas + " cm^2");
        System.out.println("Keliling    : "+ this.keliling + " cm");
        System.out.println(" ");
    }

}
