package overloading_ile_max_sayi_bulma;
import java.util.Scanner;

public class OverloadingIleMaxSayiBulma {
	
	public int max_bul(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	public int max_bul(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
	
	public static void main(String[] args) {
		
		OverloadingIleMaxSayiBulma Max_Bul = new OverloadingIleMaxSayiBulma();
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Iki sayi giriniz: ");
		int sayi1 = reader.nextInt();
		int sayi2 = reader.nextInt();
		
		int iki_max = Max_Bul.max_bul(sayi1,sayi2);
		System.out.println("\nIki Sayinin En Buyugu -> " + iki_max);
		
		System.out.print("\nUc sayi giriniz: ");
		int sayi_1 = reader.nextInt();
		int sayi_2 = reader.nextInt();
		int sayi_3 = reader.nextInt();
		
		int uc_max = Max_Bul.max_bul(sayi_1,sayi_2,sayi_3);
		System.out.println("\nUc Sayinin En Buyugu -> " + uc_max);
		
		reader.close();
	}

}
