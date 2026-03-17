/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan13;

public class ArrayNilai {
    public static void main(String[] args){
        int[] nilai = {85, 90, 78, 92, 88};

        for(int i = 0; i < 5; i++){
            int urutan = i+1;
            System.out.println("Nilai "+ urutan +" : " + nilai[i] );
        }

        System.out.println("");
        System.out.println("Total Nilai: "+ nilai.length);
    }
}
