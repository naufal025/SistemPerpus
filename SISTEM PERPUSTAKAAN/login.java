import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] kodeAng = {111, 121};
        String [] dataAng = {"Jua","Rahmat"};
        boolean verif = false;
        int veriv;

        System.out.println("Masukkan kode anggota anda");
        veriv = sc.nextInt();
        for (int i = 0; i < kodeAng.length; i++) {
            if (veriv == kodeAng[i]) {
                verif = true;
                System.out.println("Selamat anda berhasil login");
                break; 
            } else {
                System.out.println("Harap cek kembali");
            }
        }
    }
}

