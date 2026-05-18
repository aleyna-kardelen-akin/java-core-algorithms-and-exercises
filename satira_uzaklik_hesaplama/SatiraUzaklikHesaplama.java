package satira_uzaklik_hesaplama;
import java.util.Scanner;

public class SatiraUzaklikHesaplama {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Satir sayisini giriniz: ");
        int sat = reader.nextInt();
        System.out.print("Sutun sayisini giriniz: ");
        int sut = reader.nextInt();
        
        int matris[][] = new int[sat][sut];
        
        System.out.print("\n");
        
        for(int i = 0; i < sat; i++) 
        {
            for(int j = 0; j < sut; j++) 
            {
                System.out.print("Matris[" + i + "][" + j + "]'yi giriniz: ");
                matris[i][j] = reader.nextInt();                
            }
        }
        
        int sat_ort[] = new int[sat];
        
        for(int i = 0; i < sat; i++) 
        {
            int sat_top = 0;
            for(int j = 0; j < sut; j++) 
            {
                sat_top += matris[i][j];
            }
            sat_ort[i] = (int) sat_top / sut; 
            System.out.print("\nMatris[" + i + "]'in Ortalamasi --> " + sat_ort[i]);
        }
        
        System.out.println("\n");
        
        int sut_ort[] = new int[sut];
        
        for(int j = 0; j < sut; j++)
        {
            int sut_top = 0;
            for(int i = 0; i < sat; i++) 
            {
                sut_top += matris[i][j];
            }
            sut_ort[j] = (int) sut_top / sat;
            System.out.print("\nMatris[" + j + "]'in Ortalamasi --> " + sut_ort[j]);
        }
        
        System.out.println("\n");

        int fark_matris_sat[][] = new int[sat][sut];
        System.out.println("Satira Gore Fark Matrisi:\n");
        for(int i = 0; i < sat; i++) 
        {
            for(int j = 0; j < sut; j++) 
            {   
                fark_matris_sat[i][j] = Math.abs((int)(sat_ort[i] - matris[i][j]));
                System.out.print(fark_matris_sat[i][j] + "\t");
            }
            System.out.println("\n");
        }
          
        int fark_matris_sut[][] = new int[sat][sut];
        System.out.println("Sutuna Gore Fark Matrisi:\n");
        for(int i = 0; i < sat; i++) 
        {
            for(int j = 0; j < sut; j++) 
            {   
                fark_matris_sut[i][j] = Math.abs((int)(sut_ort[j] - matris[i][j]));
                System.out.print(fark_matris_sut[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        reader.close();
    }
}
