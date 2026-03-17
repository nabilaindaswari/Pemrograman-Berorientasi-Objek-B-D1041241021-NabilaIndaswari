/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan12.InnerClass;

public class Main {
    public static void main(String[] args){
        Sekolah sekolah = new Sekolah("SMA Negri 1");

        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");

        kelas.info();


    }
}
