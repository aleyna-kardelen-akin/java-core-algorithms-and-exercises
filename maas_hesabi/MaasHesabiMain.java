package maas_hesabi;
import java.util.Scanner;

public class MaasHesabiMain {	
	
	public static void main(String[] args) {
        
		Scanner reader = new Scanner(System.in);

        MaasHesabi calisan1 = new MaasHesabi("Ali Kara", 30);
        calisan1.setCocuk_sayi(1);
        calisan1.setMaas(20000.0f);
        
        calisan1.maas_hesapla();
        calisan1.bilgileri_yazdir();

        System.out.println("\nİkinci calisanin bilgilerini giriniz: ");
        System.out.print("Ad Soyad: ");
        String adSoyad = reader.nextLine();
        System.out.print("Yas: ");
        int yas = reader.nextInt();
        System.out.print("Cocuk Sayisi: ");
        int cocukSayi = reader.nextInt();
        System.out.print("Maas: ");
        float maas = reader.nextFloat();

        MaasHesabi calisan2 = new MaasHesabi(adSoyad, yas, cocukSayi, maas);

        calisan2.maas_hesapla();
        calisan2.bilgileri_yazdir();
		
        reader.close();
    }
}
