package pertemuan09;
/*
Nama : Nabila Indaswari
NIM : D1041241021

*/

class mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat(){
        kecepatan*=2;
    }

    public void tampilkanInfo(){
        System.out.println("Merek : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun keluaran : " + tahun);
        System.out.println("Kecepatan : " + kecepatan);
    }
}

    

public class objectAndClass{
    public static void main(String[] args)
    {
        mobil mobil1 = new mobil();
        mobil1.merk = "Porsche";
        mobil1.warna = "Pink";
        mobil1.tahun = 1992;
        mobil1.kecepatan = 70;

        System.out.println(">> Tampilan sebelum dipercepat : ");
        mobil1.tampilkanInfo();
        mobil1.percepat();

        
        System.out.println(">> Tampilan sesudah dipercepat : ");
        mobil1.tampilkanInfo();
    }
}
