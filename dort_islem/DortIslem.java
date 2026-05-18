package dort_islem;
import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {
		int sayi1,sayi2,top=0,cikar=0,carp=0;
		float bolme=0.0f;
		String islem;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("1.sayiyi giriniz: ");
		sayi1 = reader.nextInt();
		System.out.print("2.sayiyi giriniz: ");
		sayi2 = reader.nextInt();
		reader.nextLine();
		System.out.print("Islem giriniz: ");
		islem = reader.nextLine();
		
		if(sayi1 > sayi2)
		{
			if(islem.equals("+")) 
			{
				top = sayi1+sayi2;
				System.out.println("\nSonuc -> "+ top);
			}	
			else if(islem.equals("*"))
			{
				carp = sayi1*sayi2;
				System.out.println("\nSonuc -> "+ carp);
			}	
			else if(islem.equals("/") && sayi2 != 0)
			{
				bolme = (float)sayi1/sayi2;
				System.out.printf("\nSonuc -> "+ bolme);
			}
			else if(islem.equals("-"))
			{
				cikar = sayi1 - sayi2;
				System.out.printf("\nSonuc -> "+ cikar);
			}	
			else
				System.out.println("\nBoyle bir islem bulunmamaktadir !\n");
		}
		else
			System.out.println("\n1.sayi 2.sayidan buyuk olmalidir !\n");
		reader.close();
	}
}
