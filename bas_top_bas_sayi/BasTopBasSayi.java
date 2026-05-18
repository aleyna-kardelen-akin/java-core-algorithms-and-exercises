package bas_top_bas_sayi;
import java.util.Scanner;

public class BasTopBasSayi {

	public static void main(String[] args) {
		
		int i,sayi,temp,bas_say=0,bas_top=0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		sayi = reader.nextInt();
		temp = sayi;
		while(temp != 0)
		{
			temp/=10;
			bas_say += 1;
		}
		System.out.print("\nBasamak Sayisi --> " + bas_say);
		temp = sayi;
		for(i=0;i<bas_say;i++)
		{
			int mod = temp%10;
			bas_top += mod;
			sayi -= mod;
			temp/=10;
		}
		System.out.print("\nBasamaklar Toplami --> " + bas_top);
		reader.close();
	}
}
