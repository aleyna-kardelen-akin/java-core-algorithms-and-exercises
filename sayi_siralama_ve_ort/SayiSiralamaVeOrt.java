package sayi_siralama_ve_ort;
import java.util.Scanner;

public class SayiSiralamaVeOrt {

	public static void main(String[] args) {
		
		int x, y, z, kucuk, orta, buyuk;
        float ort = 0.0f;
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
        
        ort = (float)(x+y+z)/3;
        System.out.println("\nKucuk -> " + kucuk + "\nOrta -> " + orta +"\nBuyuk -> " + buyuk);
        System.out.printf("\nOrtalama -> " + ort);
        reader.close();
	}

}
