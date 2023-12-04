import java.util.Scanner;

public class denda {
    
    static String[] namaPeminjam = new String[100];
static int[][] dataAnggota = new int[100][2];
    static int index = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int menu;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Input Data Peminjam"); 
            System.out.println("2. Tampilkan Data Peminjam");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            
            if(menu == 1) {
                inputData();
            } else if(menu == 2) {
                tampilData();
            } else {
                System.out.println("Terimakasih sudah menggunakan sistem denda");
            }
        } while(menu != 3);
    }
    
    static void inputData() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama peminjam: ");
        String nama = input.nextLine();
        
        System.out.print("Berapa hari terlambat: ");  
        int hari = input.nextInt();
        
        int poin = hitungPoin(hari);
        
        namaPeminjam[index] = nama; 
        dataAnggota[index][0] = hari;
        dataAnggota[index][1] = poin;
        
        index++;
    }
    
    static void tampilData() {
        for(int i = 0; i < index; i++) {
            System.out.println("Nama: " + namaPeminjam[i]);
            System.out.println("Hari terlambat: " + dataAnggota[i][0]); 
            System.out.println("Poin: " + dataAnggota[i][1]);
            System.out.println();  
        }
    }
    
    static int hitungPoin(int hari) {
        int poin = 0;
        if(hari <= 5) {
            poin = hari; 
        } else if(hari > 5){
            poin = 10;
        }
        return poin;
    }
}
