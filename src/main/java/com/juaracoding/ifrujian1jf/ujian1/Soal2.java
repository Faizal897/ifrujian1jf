/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author imam-f a.k.a. Imam FR
Java Developer
Created on 02/04/2024 11:26
@Last Modified 02/04/2024 11:26
Version 1.0
*/

package com.juaracoding.ifrujian1jf.ujian1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Angka Quantity: ");
        int inputQuantity = scanner.nextInt();

        System.out.print("Masukkan Harga: ");
        int inputHarga = scanner.nextInt();

        float floatJumlah = inputHarga * inputQuantity;

        System.out.println("Qty: " + inputQuantity);
        System.out.println("Harga: " + (float) inputHarga);
        System.out.println("Jumlah: " + floatJumlah);
    }
}
