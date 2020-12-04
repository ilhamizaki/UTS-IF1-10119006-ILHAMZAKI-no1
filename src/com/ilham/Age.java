/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author Ilham zaki
 */
public class Age {
    private int yearBirth;
    private final int yearNow;
    private static String red;
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - getYearBirth();
    }
    
    public String tandanyaKamu(int umur) {
        if(umur <= 5) {
            return "LAGI LUCU-LUCU NYA";
        } else if (umur <= 10) {
            return "MASIH ANAK-ANAK";
        } else if (umur <= 13) {
            return "MASIH REMAJA";
        } else if (umur <= 19) {
            return "ALAY";
        } else if (umur <= 29) {
            return "LAGI GALAU NYARI JODOH";
        } else if (umur <= 35) {
            return "LAGI SIBUK NYARI UANG";
        } else if (umur <= 150) {
            return "SUDAH TUA";
        } 
        return "TIDAK TERDETEKSI DI KEHIDUPAN";
    }
}
