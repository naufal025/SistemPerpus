import java.util.Scanner;
public class PenambahanBuku {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menentukan jumlah maksimum buku yang dapat disimpan
        final int MAX_BUKU = 100;
        String[][] buku = new String[MAX_BUKU][3]; // Array 2 dimensi untuk menyimpan informasi buku

        int jumlahBuku = 0; // Jumlah buku yang saat ini tersedia

        while (true) {
            System.out.println("=========Penambahan Buku=========");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    if (jumlahBuku < MAX_BUKU) {
                        System.out.print("Judul buku: ");
                        input.nextLine(); // Membersihkan newline character
                        String judul = input.nextLine();
                        System.out.print("Penulis buku: ");
                        String penulis = input.nextLine();
                        System.out.print("Jumlah eksemplar yang tersedia: ");
                        int jumlahEksemplar = input.nextInt();

                        buku[jumlahBuku][0] = judul;
                        buku[jumlahBuku][1] = penulis;
                        buku[jumlahBuku][2] = String.valueOf(jumlahEksemplar);

                        jumlahBuku++;
                        System.out.println("Buku berhasil ditambahkan!");
                    } else {
                        System.out.println("Perpustakaan penuh, tidak dapat menambahkan lebih banyak buku.");
                    }
                    break;
                case 2:
                    if (jumlahBuku > 0) {
                        System.out.println("Daftar Buku:");
                        for (int i = 0; i < jumlahBuku; i++) {
                            System.out.println("Buku ke-" + (i + 1));
                            System.out.println("Judul: " + buku[i][0]);
                            System.out.println("Penulis: " + buku[i][1]);
                            System.out.println("Jumlah Eksemplar: " + buku[i][2]);
                            System.out.println();
                        }
                    } else {
                        System.out.println("Tidak ada buku yang tersedia.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}


