package com.juaracoding;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hargaTiket = new int[5];
        int totalHarga = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Harga tiket film " + (i + 1) + ": ");
            hargaTiket[i] = scanner.nextInt();
            totalHarga += hargaTiket[i];
        }

        System.out.println("\nTotal harga tiket: " + totalHarga);
        scanner.close();
    }
}

