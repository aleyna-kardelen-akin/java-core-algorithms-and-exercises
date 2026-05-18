package vize_final_gecme_notu;
import java.util.Scanner;

public class VizeFinalGecmeNotu {

	public static void main(String[] args) {
		
		int finall,vize;
		float gecme_notu;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Vize notunuzu giriniz: ");
		vize = reader.nextInt();
		System.out.print("Final notunuzu giriniz: ");
		finall = reader.nextInt();
		gecme_notu = vize/2 + finall/2;
		System.out.printf("\n%.2f ortalama ile su harf notu ile dersi tamamladiniz --> ",gecme_notu);
		
		if(gecme_notu >= 90)
			System.out.print("AA");
		else if(gecme_notu >= 85)
			System.out.print("BA");
		else if(gecme_notu >= 75)
			System.out.print("BB");
		else if(gecme_notu >= 70)
			System.out.print("CB");
		else if(gecme_notu >= 60)
			System.out.print("CC");
		else if(gecme_notu >= 55)
			System.out.print("DC");
		else if(gecme_notu >= 50)
			System.out.print("DD");
		else if(gecme_notu >= 40)
			System.out.print("FD");
		else if(gecme_notu >= 0)
			System.out.print("FF");
		
		reader.close();
	}
}
