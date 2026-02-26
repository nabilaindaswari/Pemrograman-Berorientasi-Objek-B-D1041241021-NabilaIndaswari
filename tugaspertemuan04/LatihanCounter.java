/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugaspertemuan04;

public class LatihanCounter {
    public static void main(String[] args)
    {

        System.out.println("=== COUNTER ===");
        int nilaiCounter = 10;
        System.out.println("Nilai Awal : " + nilaiCounter);

        nilaiCounter++;
        nilaiCounter++;
        System.out.println("Setelah ++ (2x): " +nilaiCounter);

        nilaiCounter--;
        System.out.println("Setelah --: " + nilaiCounter);

        nilaiCounter+=5;
        System.out.println("Setelah += 5: " +nilaiCounter);

        nilaiCounter-=3;
        System.out.println("Setelah -= 3: " +nilaiCounter);

        nilaiCounter*=2;
        System.out.println("Setelah *= 2:" +nilaiCounter);

    }
}
