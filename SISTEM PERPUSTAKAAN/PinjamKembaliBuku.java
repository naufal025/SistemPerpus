
import java.util.Scanner;
public class PinjamKembaliBuku {

    public static void main(String[] args) {
        
        // Inisialisasi data buku
        String[][] buku = {
            {"Novel", "John Smith", "1234567890", "available"},
            {"Makalah", "Sarah Johnson", "0987654321", "available"},
            {"Atlas", "David Lee", "2345678901", "unavailable"},
            {"Ensiklopedia", "Emily Davis", "3456789012", "unavailable"}
        };
        
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("=================================");
            System.out.println("1. Pinjam buku");
            System.out.println("2. Kembalikan buku");
            System.out.println("3. Lihat daftar buku");
            System.out.println("4. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih menu: ");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String judulPinjam = input.next();
                    boolean found1 = false;
                    
                    for (int i = 0; i < buku.length; i++) {
                        if (buku[i][0].equalsIgnoreCase(judulPinjam)) {
                            found1 = true;
                            if (buku[i][3].equalsIgnoreCase("available")) {
                                System.out.println("Buku tersedia, silakan pinjam");
                                buku[i][3] = "unavailable";
                            } else {
                                System.out.println("Mohon maaf, buku sedang dipinjam");
                            }
                            break;
                        }
                    }
                    
                    if (!found1) {
                        System.out.println("Buku tidak ditemukan");
                    }
                    
                    break;
                    
                case 2:
                    System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                    String judulKembali = input.next();
                    boolean found2 = false;
                    
                    for (int i = 0; i < buku.length; i++) {
                        if (buku[i][0].equalsIgnoreCase(judulKembali)) {
                            found2 = true;
                            if (buku[i][3].equalsIgnoreCase("unavailable")) {
                                System.out.println("Terima kasih, buku berhasil dikembalikan");
                                buku[i][3] = "available";
                            } else {
                                System.out.println("Mohon maaf, buku tidak sedang dipinjam");
                            }
                            break;
                        }
                    }
                    
                    if (!found2) {
                        System.out.println("Buku tidak ditemukan");
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("Daftar buku:");
                    System.out.println("Judul\t\t\tPenulis\t\t\tISBN\t\t\tStatus");
                    System.out.println("---------------------------------------------------------------------------------");
                    
                    for (int i = 0; i < buku.length; i++) {
                        System.out.printf("%-25s%-25s%-15s%-10s\n", buku[i][0], buku[i][1], buku[i][2], buku[i][3]);
                    }
                    
                    break;
                    
                case 4:
                    exit = true;
                    System.out.println("Terimakasih Telah Menggunakan Sistem Peminjaman!!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            
        }
        
    }

}

