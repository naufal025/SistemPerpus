import java.util.Scanner;

public class JadwalPiketPerpus {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        String [][] piket = new String [5][2];
        String [] hari =  {"Senin", "Selasa", "Rabu", "Kamis" , "Jumat"};

        System.out.println("===== Jadwal Piket Perpustakaan =====" );
        for (int i = 0; i < hari.length; i++) { 
            System.out.println (hari[i]);
            for (int j = 0; j < piket[0].length; j++) { 
            System.out.print("Anggota ke-" + (j + 1) + ": "); 
            piket[i][j] = sc14.nextLine(); 
            } 
            System.out.println(); 
        } 
        System.out.println("===== Jadwal Piket Perpustakaan =====" );
        for (int i = 0; i < hari.length; i++) {  
            System.out.print( hari[i]+ ": "); 
            for (String temp:piket[i]) {
               
                System.out.print(temp + " "); 
            } 
            System.out.println(); 
        }    
    }

    

            }
        

