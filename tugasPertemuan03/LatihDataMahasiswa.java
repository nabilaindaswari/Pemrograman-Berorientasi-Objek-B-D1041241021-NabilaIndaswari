package tugasPertemuan03;

/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/



public class LatihDataMahasiswa {
    public static void main(String[] args)
    {
        long NIM = 2301010001L; // menggunakan L karena menggunakan tipe data long
        String nama = "Budi Santoso"; //string menggunakan tanda petik dua
        char kelas = 'A'; //char menggunakan tanda petik satu
        boolean statusAktif = true; //boolean tidak menggunakan kapital di awal
        double IPKSemester = 3.75; //double menandakan bilangan desimal, tapi tidak perlu menambahkan d diakhir seperti float
        int totalSKS = 72; // bilangan bulat biasa

        //pengeluaran output
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM                 : " +NIM);
        System.out.println("Nama                : " +nama);
        System.out.println("Kelas               : " +kelas);
        System.out.println("Status Aktif        : " +statusAktif);
        System.out.println("IPK Semester        : " +IPKSemester);
        System.out.println("Total SKS           : " +totalSKS);
        
    }
    
}
