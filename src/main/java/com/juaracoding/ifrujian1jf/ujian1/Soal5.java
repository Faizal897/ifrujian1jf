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

public class Soal4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Kata-kata: ");
        String inputKata = scanner.nextLine();

        System.out.println("Banyak karakter kata: " + inputKata.length());
        System.out.println("Kata Upper Case: " + inputKata.toUpperCase());
        System.out.println("Kata Lower Case: " + inputKata.toLowerCase());
        System.out.println("Banyak karakter kata: " + inputKata.substring(inputKata.length()-3));



    }
}
