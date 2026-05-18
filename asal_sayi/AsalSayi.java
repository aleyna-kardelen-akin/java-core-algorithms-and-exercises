package asal_sayi;
import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		int sayi = reader.nextInt();
		
		for (int i=2; i<sayi; i++)
		{
			boolean asal = true;
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					asal = false;
					break;
				}
				
			}
			if(asal)
			{
				System.out.print(i + " ");
			}
		}
		reader.close();
	}
}
