/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication121;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen Birinci Dizinin Boyutunu Giriniz : " );
        int girilecek1 = deger.nextInt();
        int[] dizi1 = new int[girilecek1];
        System.out.print("Lütfen İkinci Dizinin Boyutunu Giriniz : " );
        int girilecek2 = deger.nextInt();
        int[] dizi2 = new int[girilecek2];
        
        Random uret = new Random(); 
        System.out.print("Dizi1'in Elemanları : ");
        for (int i = 0; i < dizi1.length; i++)
        {
            dizi1[i] = uret.nextInt(1000);
        }
        for (int i = 0; i < dizi1.length; i++) 
        {
            System.out.print(dizi1[i] + "  ");
        }
        System.out.println("");
        
        
        
        System.out.print("Dizi2'in Elemanları : ");
        for (int i = 0; i < dizi2.length; i++)
        {
            dizi2[i] = uret.nextInt(1000);
        }
        for (int i = 0; i < dizi2.length; i++) 
        {
            System.out.print(dizi2[i] + "  ");
        }
        System.out.println("");
        
        int[] dizi3 = new int [dizi1.length + dizi2.length];
        for (int i=0; i<dizi1.length + dizi2.length; i++)
        {
            if(i<dizi1.length)
            {
                dizi3[i]=dizi1[i];
            }
            else
            {
                dizi3[i]=dizi2[i-dizi1.length];
            }
        }
        
        for (int i = 0; i < dizi3.length-1; i++) 
        {
            int sayi = dizi3[i];
            int temp = i;
            
            for (int j = i+1; j < dizi3.length ; j++) 
            {
                if(dizi3[j]<sayi)
                { 
                    sayi = dizi3[j]; 
                    temp = j; 
                }
            }
 
            if(temp != i)
            { 
                dizi3[temp] = dizi3[i];
                dizi3[i] = sayi;
            }
        }
        System.out.print("Dizi3'ün Elemanları : ");
        for (int i = 0; i < dizi3.length; i++) 
        {
            System.out.print(dizi3[i] + "  ");
        }
    }
}
