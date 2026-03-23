/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan15.MethodVarArgs;

public class Main {
    public static void main(String[] args){
            Nilai nilai01 = new Nilai();
            Nilai nilai02 = new Nilai();
    
            System.out.println("Rata-rata (3 nilai) : " + nilai01.hitungRataRata(70,80,90));
            System.out.println("Rata-rata (5 nilai) : " + nilai02.hitungRataRata(85,90,78,92,88));
    
        }
    
}
