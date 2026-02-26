/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan07;
import java.util.Scanner;

public class LatihanValidasi {
    public static void main(String[] args)
    {
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println(" ");
        
        Scanner input = new Scanner(System.in);
        int nilai;
        do{
            System.out.print("Percobaan input : ");
            nilai = input.nextInt(); //memasukkan input kedalam nilai dengan tipe data integer
            if(nilai < 0 || nilai > 100){
                System.out.println("Error: Nilai harus diantara 0-100!");
            }
            else{
                System.out.println("Nilai valid : "+ nilai);
            }
            System.out.println(" ");
        }
        while(nilai < 0 || nilai > 100);
        input.close();

    }
}
