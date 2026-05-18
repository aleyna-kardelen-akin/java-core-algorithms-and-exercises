package iki_boyutlu_dizi;
import java.util.Scanner;

public class İkiBoyutluDizi {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Satir sayisini giriniz: ");
		int sat = reader.nextInt();
		System.out.print("Sutun sayisini giriniz: ");
		int sut = reader.nextInt();
		
		int matris[][] = new int[sat][sut];
		
		int i,j;
		System.out.print("\n");
		
		for(i=0;i<sat;i++)
		{
			for(j=0;j<sut;j++)
			{
				System.out.print("Matris[" + i +"][" + j +"] yi giriniz: ");
				matris[i][j] = reader.nextInt();				
			}
		}
		
		float ort = 0.0f;
		
		for(i=0;i<sat;i++)
		{
			int top = 0;
			for(j=0;j<sut;j++)
			{
				top += matris[i][j];
			}
			ort = (float) top / sut;
			System.out.print("\nMatris[" + i + "] in Ortalamasi --> " + ort);
		}
	}
}
