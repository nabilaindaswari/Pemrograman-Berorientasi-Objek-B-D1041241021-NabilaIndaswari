/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan12.InnerClass;

public class Sekolah {
    String namaSekolah;

    public Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }
    public class Kelas{
        String namaKelas;

        public Kelas(String kelas){
            this.namaKelas = kelas;
        }

        void info(){
            System.out.println("Sekolah      : " + namaSekolah);
            System.out.println("Kelas      : " + namaKelas);
        }
    }
}
