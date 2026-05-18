package cumle_icinde_kelime_arama;
import java.util.Scanner;

public class CumleIcindeKelimeArama {

	public static void main(String[] args) {
		
		int syc=0;
		String cumle,aranacak_kelime;
		Scanner reader = new Scanner(System.in);
		System.out.print("Bir cumle giriniz: ");
		cumle = reader.nextLine();
		System.out.print("Aranacak kelimeyi giriniz: ");
		aranacak_kelime = reader.nextLine();
		if(cumle.contains(aranacak_kelime))
		{
			syc++;
			System.out.println("\n" + cumle + " cumlesinde\n" + aranacak_kelime + " kelimesi" + syc + " adet vardir.");
		}
		reader.close();
	}
}
