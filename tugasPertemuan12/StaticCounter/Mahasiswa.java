/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan12.StaticCounter;

public class Mahasiswa {
    static int jumlahMahasiswa;
    String nama;

    public Mahasiswa(String nama){
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + this.nama);
    }

    static int getJumlah(){
        return jumlahMahasiswa;
    }


}
