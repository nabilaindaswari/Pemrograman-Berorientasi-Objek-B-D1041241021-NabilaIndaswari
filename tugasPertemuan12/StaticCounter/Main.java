/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan12.StaticCounter;

public class Main {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("Andi");
        Mahasiswa mhs2 = new Mahasiswa("Budi");
        Mahasiswa mhs3 = new Mahasiswa("Citra");

        System.out.println("Total Mahasiswa : " + Mahasiswa.getJumlah());
        
    }
}
  