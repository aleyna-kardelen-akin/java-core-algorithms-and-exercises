package siniftan_sinif_uretme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnasinifMain {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        List<Samsung> telefonlar = new ArrayList<>(); 
        boolean devam = true;

        while (devam) 
        {
            System.out.println("\n--- TELEFON YÖNETİM SİSTEMİ ---");
            System.out.println("1. Yeni Telefon Ekle");
            System.out.println("2. Telefon Bilgilerini Yazdir");
            System.out.println("3. Hafiza Degerlendir");
            System.out.println("4. Hiz Degerlendir");
            System.out.println("5. Kamera Degerlendir");
            System.out.println("6. Cikis");
            System.out.print("\nBir secenek giriniz: ");

            int secim = scanner.nextInt();

            switch (secim) 
            {
                case 1:
                    System.out.print("\nMarka giriniz: ");
                    String marka = scanner.next();
                    System.out.print("Model giriniz: ");
                    String model = scanner.next();
                    System.out.print("Hafizasini giriniz (GB): ");
                    int hafiza = scanner.nextInt();
                    System.out.print("Hizini giriniz (GHz): ");
                    float hiz = scanner.nextFloat();
                    System.out.print("Kamera degerini giriniz (MP): ");
                    int kamera = scanner.nextInt();

                    Samsung yeniTelefon = new Samsung(marka, model, hafiza, hiz, kamera);
                    telefonlar.add(yeniTelefon); 
                    System.out.println("\nTelefon başarıyla eklendi.\n");
                    break;

                case 2:
                    if (!telefonlar.isEmpty()) {
                        System.out.println("\n=== KAYITLI TELEFONLARIN LİSTESİ ===");
                        for (Samsung telefon : telefonlar) {
                            telefon.bilgileri_yazdir();
                        }
                    } else {
                        System.out.println("\nOncelikle bir telefon eklemelisiniz !\n");
                    }
                    break;

                case 3:
                    if (!telefonlar.isEmpty()) {
                        System.out.println("\n=== HAFIZA DEĞERLENDİRME RAPORU ===");
                        for (Samsung telefon : telefonlar) {
                            // Hangi telefonun değerlendirildiğini görmek için marka ve model eklendi
                            System.out.print(telefon.marka + " " + telefon.model + " ->");
                            System.out.println(telefon.hafiza_degerlendir());
                        }
                    } else {
                        System.out.println("\nOncelikle bir telefon eklemelisiniz !\n");
                    }
                    break;

                case 4:
                    if (!telefonlar.isEmpty()) {
                        System.out.println("\n=== HIZ DEĞERLENDİRME RAPORU ===");
                        for (Samsung telefon : telefonlar) {
                            // Çıktı karmaşasını önlemek için telefon adı öne eklendi
                            System.out.print(telefon.marka + " " + telefon.model + " için:");
                            telefon.hiz_degerlendir();
                        }
                    } else {
                        System.out.println("\nOncelikle bir telefon eklemelisiniz !\n");
                    }
                    break;

                case 5:
                    if (!telefonlar.isEmpty()) {
                        System.out.println("\n=== KAMERA DEĞERLENDİRME RAPORU ===");
                        for (Samsung telefon : telefonlar) {
                            // Çıktı karmaşasını önlemek için telefon adı öne eklendi
                            System.out.print(telefon.marka + " " + telefon.model + " için:");
                            telefon.kamera_degerlendir();
                        }
                    } else {
                        System.out.println("\nOncelikle bir telefon eklemelisiniz !\n");
                    }
                    break;

                case 6:
                    devam = false;
                    System.out.println("\nProgramdan cikiliyor. İyi günler!");
                    break;

                default:
                    System.out.println("\nGecersiz secim ! Lutfen tekrar deneyiniz.\n");
            }
        }

        scanner.close(); // Bellek sızıntısını önlemek için scanner kapatıldı
    }
}
