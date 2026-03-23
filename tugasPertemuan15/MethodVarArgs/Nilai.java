
/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/

package tugasPertemuan15.MethodVarArgs;

public class Nilai {
    
    double hitungRataRata(int...nilai){
        double total = 0;
        for(int x: nilai){
            total+= x;
        }
        if(nilai.length == 0)
            return 0;
        return total/nilai.length;
    }
}
