package Tugas2;
import java.util.Scanner;

class Sepeda {
    
    String merk;
    int jarakTempuh;
    
    public Sepeda(String merkBaru) {
        merk = merkBaru;
        jarakTempuh = 0;
        System.out.println("Object " + merk + " dibuat, jarak tempuh awal " + jarakTempuh + " km");
    }
    public void bergerakMaju() {
        jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }
    public void bergerakMundur() {
        jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
    }
    public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }
}
public class SepedaBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Object Merk Sepeda: ");
        String merkInput = scanner.nextLine();
        
        Sepeda sepedaku = new Sepeda(merkInput);
        
        int pilihan;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    sepedaku.bergerakMaju();
                    break;
                case 2:
                    sepedaku.bergerakMundur();
                    break;
                case 3:
                    sepedaku.berhenti();
                    break;
                case 0:
                    System.out.println("Keluar Program ..");
                    System.out.println("Terimakasih sudah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
}