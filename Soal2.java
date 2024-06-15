package com.juaracoding;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        //untuk pengguna memasukkan nama filmnya
        System.out.print("Masukkan nama film: ");
        String namaFilm = scanner.nextLine();

        // Mengubah nama film menjadi huruf besar semua
        String namaFilmHurufBesar = namaFilm.toUpperCase();

        // Mencetak nama film dalam huruf besar
        System.out.println("Nama film dalam huruf besar: " + namaFilmHurufBesar);

        // Menutup scanner
        scanner.close();
    }
}
