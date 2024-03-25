/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mopoe.com.sheeeeeeeeeesh;

import java.util.Scanner;

/**
 *
 * @author A-12
 */
public class Pertemuan2 {
    public static void main(String[] args) {
        int poinA = 20;
        int poinB = 10;
    
        double varA = 6;
        double varB = 8;
        
        String nama = "";
        
        boolean isPlus = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nilai A = "+poinA);
        System.out.println("Nilai B = "+poinB);
        System.out.println("Variabel A = "+varA);
        System.out.println("Variabel B = "+varB);
        System.out.println("isPlus = "+isPlus);
        
        System.out.println("Inputkan Nilai A ");
        poinA = input.nextInt();
        
        System.out.println("Inputkan Nilai B ");
        poinB = input.nextInt();
        
        System.out.println("Inputkan Variabel A ");
        varA = input.nextDouble();
        
        System.out.println("Inputkan Variabel B ");
        varB = input.nextDouble();
        
        System.out.println("False/True ");
        isPlus = input.nextBoolean();
        
        System.out.println("Masukan Nama ");
        nama = input.nextLine();
        nama = input.nextLine();
        
        System.out.println("Inputan Angka Baru = "+ poinA);
        System.out.println("Inputan Angka Baru = "+ poinB);
        System.out.println("Inputan Angka Baru = "+ varA);
        System.out.println("Inputan Angka Baru = "+ varB);
        System.out.println("Inputan Angka Baru = "+ isPlus);
        System.out.println("Masukan Nama Anda = "+ nama);
        
        
    }
    
}