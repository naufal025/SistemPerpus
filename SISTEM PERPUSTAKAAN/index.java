import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] kodeAng = {111, 112, 113};
        String [] dataAng = {"Jua","Rahmat","Nopal"};
        int pilih;
        System.out.println("===========================================");
        System.out.println("            PERPUSTAKAAN RAHMAT            ");
        System.out.println("===========================================");
        System.out.println("Masukkan Username dan Password");
        System.out.print("Username    : ");
        String user = input.next();
        System.out.print("Password    : ");
        int veriv = input.nextInt();
        for (int i = 0; i < kodeAng.length; i++) {
            if(user.equals(dataAng[i]) && veriv == kodeAng[i]){
            veriv = 1;
            System.out.println("Selamat datang di perpustakaan, "+dataAng[i]+" !!");
            break;
            } else {
            continue;
            }
        }
        if (veriv != 1){
            System.out.println("Login Invalid");
        }
        /*do{
            System.out.println("==============================");
            System.out.println("   Menu Perpustakaan Rahmat    ");
            System.out.println("==============================");
        } while ()*/
        
    }
}

