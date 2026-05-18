package dizi_bubble_sort;
import java.util.Scanner;

public class DiziBubbleSort {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Dizinin boyutunu giriniz: ");
		int boyut = reader.nextInt();
		System.out.print("\n");
		
		int dizi[] = new int[boyut];
		
		for(int i=0; i<boyut; i++)
		{
			System.out.print("Dizi[" + i +"] 'yi giriniz: ");
			dizi[i] = reader.nextInt();
		}
		
		for(int i=0; i<boyut; i++)
		{
			for(int j=0; j<boyut-1-i; j++)
			{
				if(dizi[j] > dizi[j+1])
				{
					int temp = dizi[j];
					dizi[j] = dizi[j+1];
					dizi[j+1] = temp;
				}	
			}
		}
		
		System.out.print("\nSiranlanmis Dizi: [ ");
		for(int i=0; i<boyut; i++)
		{
			System.out.print(dizi[i ]+ " ");
		}
		System.out.println("]");
		
		reader.close();
	}
}
