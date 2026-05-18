package dizi_ile_maas_hesabi;
import java.util.ArrayList;
import java.util.Scanner;

public class DiziİleMaasHesabiMain {

    private String ad_soyad;
    private int yas;
    private int cocuk_sayi;
    private float maas;
    private int id;
    private static int id_arttirici = 1;

    public DiziİleMaasHesabiMain(String ad_soyad, int yas, int cocuk_sayi, float maas) {
    	
        this.id = id_arttirici++;
        this.ad_soyad = ad_soyad;
        this.yas = yas;
        this.cocuk_sayi = cocuk_sayi;
        this.maas = maas;
    }

    public void bilgileri_yazdir() {
    	
        System.out.println("\nID: " + id);
        System.out.println("Ad Soyad: " + ad_soyad);
        System.out.println("Yas: " + yas);
        System.out.println("Cocuk Sayisi: " + cocuk_sayi);
        System.out.println("Maas: " + maas + " TL");
    }

    public void maas_hesapla() {
    	
        if (maas < 20000.0) 
        {
            maas *= 1.05;
        }
        else 
        {
            if (cocuk_sayi > 0)
            {
                maas *= (1 + (cocuk_sayi * 0.015));
            }
            else if (yas > 40) 
            {
                maas *= 1.035;
            }
            else 
            {
                maas *= 1.025;
            }
        }
    }

    public static void main(String[] args) {
    	
        Scanner reader = new Scanner(System.in);
        ArrayList<DiziİleMaasHesabiMain> calisanlar = new ArrayList<>();

        System.out.print("Kac tane calisan gireceksiniz ?: ");
        int calisanSayisi = reader.nextInt();
        reader.nextLine(); 

        for (int i = 0; i < calisanSayisi; i++)
        {    
        	System.out.print((i + 1) + ". calisanin adini ve soyadini giriniz: ");
            String ad_soyad = reader.nextLine();
            System.out.print((i + 1) + ". calisanin yasini giriniz: ");
            int yas = reader.nextInt();
            System.out.print((i + 1) + ". calisanin cocuk sayisini giriniz: ");
            int cocuk_sayi = reader.nextInt();
            System.out.print((i + 1) + ". calisanin maasini giriniz: ");
            float maas = reader.nextFloat();
            reader.nextLine(); 

            calisanlar.add(new DiziİleMaasHesabiMain(ad_soyad, yas, cocuk_sayi, maas));
        }

        for (DiziİleMaasHesabiMain calisan : calisanlar) 
        {
            calisan.maas_hesapla();
            calisan.bilgileri_yazdir();
        }

        reader.close();
    }
}
