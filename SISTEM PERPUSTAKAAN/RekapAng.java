import java.util.Scanner;

public class RekapAng {

    static String[][] anggota = new String[100][2]; 
    static int index = 0;
    
    public static void main(String[] args) {
        inputData();
        tampilData();
    }

    static void inputData() {
        Scanner input = new Scanner(System.in);
        char lagi = 'y';
        
        while(lagi == 'Y' || lagi == 'y') {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan Umur: ");
            String umur = input.nextLine();
            
            anggota[index][0] = nama;
            anggota[index][1] = umur; 
            index++;
            
            System.out.print("Tambah lagi (Y/T)?");
            lagi = input.nextLine().charAt(0);
        }
    }

    static void tampilData() {
        System.out.println("Data Anggota:");
        for(int i = 0; i < index; i++) {
            System.out.println("Nama: " + anggota[i][0]); 
            System.out.println("Umur: " + anggota[i][1]);}
    }
}
