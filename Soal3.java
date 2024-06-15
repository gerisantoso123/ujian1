package com.juaracoding;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mendefinisikan harga tiket weekday dan weekend
        int hargaWeekday = 35000;
        int hargaWeekend = 45000;

        // Meminta pengguna memasukkan jumlah tiket yang dibeli
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        // Meminta pengguna memasukkan tipe hari (weekday atau weekend)
        System.out.print("Apakah ini hari weekend? (ya/tidak): ");
        String tipeHari = scanner.next();

        // Menentukan harga tiket berdasarkan tipe hari
        int hargaTiket = tipeHari.equalsIgnoreCase("ya") ? hargaWeekend : hargaWeekday;

        // Menghitung total harga tiket
        int totalHarga = hargaTiket * jumlahTiket;

        // Memberikan diskon 10% jika jumlah tiket lebih dari 5
        if (jumlahTiket > 5) {
            totalHarga *= 0.9; // Mengurangi 10% dari total harga
        }

        // Mencetak total harga tiket
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon jika berlaku): " + totalHarga);

        // Menutup scanner
        scanner.close();
    }
}
