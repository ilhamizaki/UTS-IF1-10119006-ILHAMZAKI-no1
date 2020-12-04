/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : Tandanya Kamu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int birth = scanner.nextInt();

        Age tanda = new Age(2020);
        tanda.setYearBirth(birth);
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + tanda.getYearBirth());
        System.out.println("Hari ini tahun : " + tanda.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + tanda.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + tanda.tandanyaKamu(tanda.hitungUmur()));
    }
    
}
