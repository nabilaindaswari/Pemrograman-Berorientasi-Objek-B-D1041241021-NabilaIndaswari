/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan11.LatihanMobilOverloading;

public class Mobil {
    String merk;
    String warna;
    int tahun;

    public Mobil(){
        setDefault();
    }
    public Mobil(String merk){
        setDefault();
        this.merk = merk;    
    }

    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    private void setDefault(){
        this.merk = "Unknown";
        this.warna = "Unknown";
        this.tahun = 0;
    }

    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk    : "+ this.merk);
        System.out.println("Warna    : "+ this.warna);
        System.out.println("Tahun    : "+ this.tahun);
        System.out.println(" ");
    }

}
