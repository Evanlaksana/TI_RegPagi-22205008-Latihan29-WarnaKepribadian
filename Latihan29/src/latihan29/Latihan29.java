/*
Nama : Evan Eka Laksana
 * Kelas : PBO1
 * NIM : 222050008
 * Deskripsi Program : Program ini berisi program untuk menampilkan Warna Kepribadian
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan29;
import java.util.Scanner;

public class Latihan29 {

    public static void main(String[] args) {
        String resetWarna = "\u001b[0m";
        String foregroundwarnaMerah = "\u001b[31m";
        String foregroundwarnaHijau = "\u001b[32m";
        String foregroundwarnaKuning = "\u001b[33m";
        String foregroundwarnaBiru = "\u001b[34m";
        String foregroundwarnaUngu = "\u001b[35m";
        String foregroundwarnaCyan = "\u001b[36m";
        
        String backgroundMerah = "\u001b[41m";
        String backgroundHijau = "\u001b[42m";
        String backgroundKuning = "\u001b[43m";
        String backgroundBiru = "\u001b[44m";
        String backgroundUngu = "\u001b[45m";
        

        
        Scanner scanner = new Scanner(System.in);
        // Menampilkan judul program
        System.out.println(foregroundwarnaMerah+"YUK "+resetWarna);
        System.out.println(foregroundwarnaHijau+"CEK "+resetWarna);
        System.out.println(foregroundwarnaKuning+"KEPRIBADIANMU "+resetWarna);
        System.out.println(foregroundwarnaBiru+"DARI "+resetWarna);
        System.out.println(foregroundwarnaUngu+"WARNA "+resetWarna);
        System.out.println(foregroundwarnaMerah+"FAVORITMU "+resetWarna);
        
        System.out.println(backgroundMerah+"Merah"+resetWarna);
        System.out.println(backgroundHijau+"Hijau"+resetWarna);
        System.out.println(backgroundKuning+"Kuning"+resetWarna);
        System.out.println(backgroundBiru+"Biru"+resetWarna);
        System.out.println(backgroundUngu+"Ungu"+resetWarna);
        




        // Meminta user untuk memasukkan nama
        System.out.println("Masukkan namamu : ");
        String nama = scanner.nextLine();

        // Meminta user untuk memasukkan warna favorit
        System.out.println("Masukkan warna favoritmu : ");
        String warnaFavorit = scanner.nextLine();

        // Menampilkan hasil tes kepribadian
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);

        // Menampilkan deskripsi kepribadian berdasarkan warna favorit
        switch (warnaFavorit) {
            case "merah":
                System.out.println("1. Berani,");
                System.out.println("2. Agresif,");
                System.out.println("3. Dinamis,");
                System.out.println("4. Mandiri,");
                System.out.println("5. Berjiwa pemimpin");
                break;
            case "kuning":
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Kreatif,");
                System.out.println("4. Optimis,");
                System.out.println("5. Suka tantangan");
                break;
            case "hijau":
                System.out.println("1. Seimbang,");
                System.out.println("2. Sabar,");
                System.out.println("3. Penyayang,");
                System.out.println("4. Penyabar,");
                System.out.println("5. Menyukai keseimbangan");
                break;
            case "biru":
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi");
                break;
            case "ungu":
                System.out.println("1. Memiliki intuisi yang kuat,");
                System.out.println("2. Introvert,");
                System.out.println("3. Kreatif,");
                System.out.println("4. Memiliki intuisi yang kuat,");
                System.out.println("5. Introvert");
                break;
            default:
                System.out.println("Warna yang kamu pilih tidak ada di dalam tes ini.");
                break;
                
        }
    }
}
    
    

