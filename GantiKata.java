/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * *
 * @author ACER
 * Nama: Siti Furkotun Najiyah
 * NIM: 23215056
 * PRODI: Teknik Informatika
 */
import java.util.Scanner;

public class GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        String kataAsli = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();

        // Mengganti semua kata asli dengan kata baru
        String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}