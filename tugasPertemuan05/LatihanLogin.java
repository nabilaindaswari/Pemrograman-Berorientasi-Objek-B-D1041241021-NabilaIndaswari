/*
Nama : Nabila Indaswari
NIM : D1041241021
Kelas : B
*/


package tugasPertemuan05;

public class LatihanLogin {
    public static void main(String[] args)
    {
        String Username = "admin";
        String Password = "admin123";
        
        System.out.println("=== VALIDASI LOGIN ===");
        String inputUsername = "admin";
        String inputPassword = "admin"; 
        System.out.println("Username : " + Username);
        System.out.println("Password : ****" );
        System.out.println("---");
        

        if(Username.equals(inputUsername))
        {
            System.out.println("Username valid");
            if(Password.equals(inputPassword))
            {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, "+ Username);
            }
            else
            {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
        else
        {
            System.out.println("Username tidak valid");
            System.out.println("LOGIN GAGAL!");
        }

    }
}
