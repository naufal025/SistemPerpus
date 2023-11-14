import java.util.Scanner;

public class denda {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hariTerlambat,jumlahPoin;
        int poin = 0;

        System.out.print("Berapa hari anda terlambat mengembalikan buku : ");
        hariTerlambat = sc.nextInt();
        if (hariTerlambat <= 5){
            jumlahPoin = hariTerlambat + poin;
            System.out.println("Total poin anda : " + jumlahPoin);
            if (jumlahPoin >= 3){
            System.out.println("Mendapatkan hukuman resume buku");
            }
        } else if (hariTerlambat > 5) {
            jumlahPoin = hariTerlambat + poin;
            System.out.println("Total poin anda : " + jumlahPoin);
            if (jumlahPoin >= 10){
            System.out.println("Mendapatkan hukuman membersihkan perpustakaan");
            }
        } else {
            System.out.println("Anda tidak mendapatkan poin apa apa");
        }       
        }
    }

