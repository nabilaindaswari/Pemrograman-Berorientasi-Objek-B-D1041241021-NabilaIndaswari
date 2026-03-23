/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan14;

public class array2DSederhana {
    public static void main(String[] args){
        int[][] arr = {{1,2, 3}, {4,5, 6}, {7,8, 9}};
        System.out.println("=== TABEL 3x3 ===");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
