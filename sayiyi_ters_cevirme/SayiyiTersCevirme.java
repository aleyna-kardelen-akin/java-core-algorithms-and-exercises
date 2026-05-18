package sayiyi_ters_cevirme;
import java.util.Scanner;

public class SayiyiTersCevirme {

	public static void main(String[] args) {
		
		int i,sayi,temp,bas_say=0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		sayi = reader.nextInt();
		temp = sayi;
		while(temp != 0)
		{
			temp/=10;
			bas_say += 1;
		}
		temp = sayi;
		System.out.print("\nGirdiginiz Sayinin Tersi --> ");
		for(i=0;i<bas_say;i++)
		{
			int mod = temp%10;
			System.out.print("" + mod);
			sayi -= mod;
			temp/=10;
		}
		reader.close();
	}
}
