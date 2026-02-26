/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan08;

public class LatihanMenuHarian {
    public static void main(String[] args)
    {
        System.out.println("=== MENU MAKAN 3 HARI ===");
        int hari;
        int waktu;
        String menu = "";

        for(hari = 1; hari <= 3; hari++){
            System.out.println("Hari "+ hari+ ":");
            for(waktu = 1; waktu <= 2; waktu++){

                //sangat hardcoded, sepertinya lebih baik jika menggunakan container
                //namun perintah soal adalah menggunakan if else atau switch
                if (hari == 1 && waktu == 1) {
                menu = "Nasi Goreng";
                } else if (hari == 1 && waktu == 2) {
                    menu = "Soto Ayam";
                } else if (hari == 2 && waktu == 1) {
                    menu = "Bubur Ayam";
                } else if (hari == 2 && waktu == 2) {
                    menu = "Mie Goreng";
                } else if (hari == 3 && waktu == 1) {
                    menu = "Roti Bakar";
                } else if (hari == 3 && waktu == 2) {
                    menu = "Nasi Uduk";
                }

                if(waktu == 1){
                    System.out.println("Pagi : " + menu);
                }
                else{
                    System.out.println("Siang : "+ menu);
                }
            }
            System.out.println("");
        }
    }
}
