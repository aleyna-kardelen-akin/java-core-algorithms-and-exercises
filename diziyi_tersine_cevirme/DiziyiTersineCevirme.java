package diziyi_tersine_cevirme;
import java.util.Scanner;

public class DiziyiTersineCevirme {

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
		
		System.out.print("\nDizinin Tersi: [ ");
		for(int j=boyut-1; j>=0; j--)
		{
			System.out.print(dizi[j] + " ");
		}
		System.out.println("]");
		
		reader.close();
	}
}



/*import java.util.Scanner;

public class DiziyiTersineCevirme {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        int[] tersDizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            tersDizi[i] = dizi[boyut - 1 - i];
        }
        
        System.out.println("Ters çevrilmiş dizi:");
        for (int i = 0; i < boyut; i++) {
            System.out.print(tersDizi[i] + " ");
        }
        
        scanner.close();
    }
}*/
