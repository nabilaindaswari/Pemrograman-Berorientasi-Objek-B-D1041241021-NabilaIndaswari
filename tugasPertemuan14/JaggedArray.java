/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan14;

public class JaggedArray {
    public static void main(String[] args){
        int[][] arr = {{10,20}, {30, 40, 50, 60}, {70,80, 90}};
        System.out.println("=== JAGGED ARRAY ===");
        for(int i = 0; i < arr.length; i++){
            System.out.print("Baris "+ i + " (" + (arr[i].length)+ " elemen) : ");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
