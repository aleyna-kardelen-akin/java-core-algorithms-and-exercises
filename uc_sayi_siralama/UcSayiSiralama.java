package uc_sayi_siralama;
import java.util.Scanner;

public class UcSayiSiralama {

    public static void main(String[] args) {
        
    	int x, y, z, kucuk, orta, buyuk;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("1. sayıyı giriniz: ");
        x = reader.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        y = reader.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        z = reader.nextInt();
        
        if (x <= y && x <= z)
        {
            kucuk = x;
            if (y <= z)
            {
                orta = y;
                buyuk = z;
            } 
            else 
            {
                orta = z;
                buyuk = y;
            }
        } 
        else if (y <= x && y <= z)
        {
            kucuk = y;
            if (x <= z) 
            {
                orta = x;
                buyuk = z;
            } 
            else 
            {
                orta = z;
                buyuk = x;
            }
        } 
        else 
        {
            kucuk = z;
            if (x <= y)
            {
                orta = x;
                buyuk = y;
            } 
            else 
            {
                orta = y;
                buyuk = x;
            }
        }
        
        System.out.println("\nKucukten Buyuge Dogru ->  " + kucuk + ", " + orta + ", " + buyuk);
        reader.close();
    }
}
