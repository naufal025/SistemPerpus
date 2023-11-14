import java.util.Scanner;
public class RekapAng {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan nama : ");
            nama = sc22.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama anggota baru (Y/T)? ");
            jawab = sc22.nextLine().charAt(0);
        } while (jawab == 'Y' || jawab == 'y');
            System.out.println("Jumlah anggota sekarang = " + jml);
    }
    
}
