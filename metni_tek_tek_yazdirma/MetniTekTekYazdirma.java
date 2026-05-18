package metni_tek_tek_yazdirma;
import java.util.Scanner;

public class MetniTekTekYazdirma {

	public static void main(String[] args) {
		
		String metin;
		int i,uzunluk;
		Scanner reader = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		metin = reader.nextLine();
		uzunluk = metin.length();
		System.out.print("\n");
		for(i=0;i<uzunluk;i++)
		{
			System.out.println(metin.charAt(i));
		}
		reader.close();
	}
}
