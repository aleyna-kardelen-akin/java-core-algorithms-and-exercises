package net_sayisi_hesaplama;
import java.util.Scanner;

public class NetSayisiHesaplama {

	public static void main(String[] args) {
		
		int soru_sayi,dogru,yanlis,bos;
		float net;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Soru sayisini giriniz: ");
		soru_sayi = reader.nextInt();
		System.out.print("Dogru sayisini giriniz: ");
		dogru = reader.nextInt();
		System.out.print("Yanlis sayisini giriniz: ");
		yanlis = reader.nextInt();
		bos = soru_sayi - (dogru+yanlis);
		net = dogru - (yanlis/4);
		System.out.printf("\nNet -> %.2f", + net);
		System.out.println("\nBos -> "+ bos);
		reader.close();
	}
}
