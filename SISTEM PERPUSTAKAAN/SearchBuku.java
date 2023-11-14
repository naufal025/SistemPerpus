    import java.util.Scanner;
public class SearchBuku {
    public static void main(String[] args) {
        // Inisialisasi array 2 dimensi untuk menyimpan data buku
        String[][] buku = {
            {"Java Programming", "John Doe"},
            {"Python for Beginners", "Jane Smith"},
            {"C++ Fundamentals", "Bob Johnson"},
            {"Web Development with HTML/CSS", "Alice Brown"}
        };

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin Anda cari: ");
        String judulBukuCari = scanner.nextLine();

        // Mencari buku dalam array 2 dimensi
        boolean bukuDitemukan = false;
        for (int i = 0; i < buku.length; i++) {
            if (buku[i][0].equalsIgnoreCase(judulBukuCari)) {
                bukuDitemukan = true;
                System.out.println("Buku ditemukan!");
                System.out.println("Judul: " + buku[i][0]);
                System.out.println("Penulis: " + buku[i][1]);
                break; // Keluar dari loop setelah buku ditemukan
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku tidak ditemukan.");
        }

        scanner.close();
    }
}


