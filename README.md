# Java Core Algorithms, Data Structures & OOP Practices

Bu depo; Java programlama dilinin temel sözdizimi yapılarından başlayarak karmaşık matematiksel algoritmalara, çok boyutlu veri manipülasyonlarına ve Nesne Yönelimli Programlama (OOP) prensiplerine kadar uzanan geniş bir yelpazedeki pratik ve kurumsal kod mimarisi çalışmalarını içerir.

## 📁 Proje Yapısı ve Algoritmik Analizler (Repository Structure)

### 1. 💼 Kurumsal OOP ve Kapsülleme Mimari Projesi (`maas_hesabi/`)
* **Açıklama:** Veri gizliliğini (`private`) esas alarak kurumsal standartlarda Kapsülleme (Encapsulation) ilkesini, Getter/Setter fonksiyonlarını ve aşırı yüklenmiş (Overloaded) yapıcı metotları uygulayan gelişmiş çalışan yönetim simülasyonu.
* **Kazanımlar:** * `Encapsulation` ile kontrollü veri erişimi.
  * `static` alan yönetimiyle nesneler arası otomatik artan benzersiz ID senkronizasyonu.
  * Çok kriterli koşul blokları (`if-else`) üzerinden esnek maaş artış algoritmalarının kurgulanması.

### 2. 🔤 Metin Karakter Analiz Uygulaması (`metni_tek_tek_yazdirma/`)
* **Açıklama:** Konsoldan alınan dinamik metinsel ifadelerin karakter dizilimlerini döngü mekanizmaları yardımıyla analiz eden veri işleme kod bloğu.
* **Kazanımlar:** İndeks tabanlı karakter ayıklama (`charAt()`) ve String uzunluk kontrolü (`length()`).

### 3. 📝 Eğitim İstatistiği ve Net Hesaplayıcı (`net_sayisi_hesaplama/`)
* **Açıklama:** Sınav verilerinde hata/başarı oranını ölçen, "4 yanlış 1 doğruyu götürür" mantığıyla çalışan aritmetik otomasyon sistemi.
* **Kazanımlar:** Aritmetik operatör öncelikleri, otomatik boş soru tespiti ve ondalıklı (`float`) çıktı formatlama.

### 4. 🚀 Metot Aşırı Yükleme ile Polimorfizm Pratiği (`overloading_ile_max_sayi_bulma/`)
* **Açıklama:** Aynı isimdeki metotları farklı parametre imzalarıyla (2 parametreli ve 3 parametreli) implementasyonunu sağlayarak statik polimorfizm örneği sunan karşılaştırma algoritması.
* **Kazanımlar:** Method Overloading (Metot Aşırı Yüklemesi) prensipleri ve verimli mantıksal operatör (`&&`) kullanımı.

### 5. 📊 İki Boyutlu Matris İstatistiği ve Mutlak Fark Analizi (`satira_uzaklik_hesaplama/`)
* **Açıklama:** Dinamik boyutlu iki boyutlu diziler (matrisler) üzerinde satır ve sütun bazlı aritmetik ortalamaları çıkaran, ardından her bir hücrenin bu ortalamalara olan mesafesini mutlak değerle yeni fark matrislerine dönüştüren ileri düzey veri işleme algoritması.
* **Kazanımlar:** * Çok boyutlu diziler (2D Arrays) ve iç içe döngü optimizasyonları.
  * `Math.abs()` fonksiyonu ile matematiksel modelleme ve hizalanmış matris çıktısı yönetimi.

### 6. 🔀 Sayı Sıralama ve Aritmetik Ortalama Analizi (`sayi_siralama_ve_ort/`)
* **Açıklama:** Girilen üç tam sayıyı performans optimizasyonunu gözeterek minimum kontrol mekanizmasıyla sıralayan ve tam değer ortalamasını hesaplayan kontrol akışı çalışması.
* **Kazanımlar:** Karmaşık karar mekanizmaları yönetimi ve veri kaybını önleyen ondalıklı tip dönüşümü (Explicit Casting).

### 7. 🔢 Sayı Teorisi ve Pozitif Bölen Keşfi (`sayinin_pozitif_bolenleri/`)
* **Açıklama:** Belirlenen bir tam sayının matematiksel olarak tüm tam bölenlerini modüler aritmetik kullanarak tespit eden ve listeleyen optimizasyon algoritması.
* **Kazanımlar:** Döngüsel sınır kontrolleri ve Kalansız Bölünme (`%` Modulo) analizi.

### 8. 🔄 Basamak Analizi ile Sayı Ters Çevirme Algoritması (`sayiyi_ters_cevirme/`)
* **Açıklama:** Herhangi bir tam sayının matematiksel basamak yapısını `while` aritmetiği ile dinamik olarak çözen, ardından veriyi string dönüştürmesi yapmadan saf matematiksel döngülerle tersine çeviren algoritma.
* **Kazanımlar:** Dinamik basamak sayımı, modüler sayı eksiltme ve döngü kombinasyonları.

### 9. 🧬 Kalıtım, Polimorfizm Sundays Koleksiyon Yönetimi (`siniftan_sinif_uretme/`)
* **Açıklama:** Üst sınıf (`SmartPhone`) ile alt sınıf (`Samsung`) arasında hiyerarşik bağ kurarak; kurucu metot zincirlemesini (`super()`), metot ezmeyi (Method Overriding) ve nesnelerin dinamik bir `ArrayList` yapısında esnekçe yönetilmesini sağlayan ileri seviye OOP mimarisi.
* **Kazanımlar:** * `Inheritance` (Kalıtım) ve `Polymorphism` (Çok Biçimlilik) temel taşları.
  * Nesne tabanlı dinamik koleksiyon (`List<Samsung>`) mimarisi ve referans türleri kontrolü.

### 10. 📐 Trigonometrik Geometri ve Alan Hesaplayıcı (`ucgen_alani_hesaplama/`)
* **Açıklama:** İki kenarı ve aralarındaki açısı derece cinsinden girilen bir üçgenin alanını, trigonometrik sinüs formülünü entegre ederek hesaplayan matematiksel yazılım parçası.
* **Kazanımlar:** `Math.sin()` entegrasyonu, `Math.toRadians()` ile radyan-derece dönüşüm hassasiyeti ve açık veri tipi dönüşümleri.

### 11. 🎓 Akademik Başarı Notu Otomasyonu (`vize_final_gecme_notu/`)
* **Açıklama:** Akademik değerlendirme kriterlerine göre vize ve final ağırlıklarını hesaplayan, ardından kademeli `if-else if` blokları üzerinden doğru harf notu aralığını seçen otomasyon sistemi.
* **Kazanımlar:** Çoklu koşul yönetimi, bağıl/mutlak sınır değer kıyaslamaları ve biçimlendirilmiş veri gösterimi (`printf`).

### 12. 🔢 Optimize Edilmiş Üç Sayı Sıralayıcı (`uc_sayi_siralama/`)
* **Açıklama:** Kullanıcı tarafından girilen 3 bağımsız tam sayıyı mantıksal kıyaslama algoritmaları aracılığıyla en verimli şekilde küçükten büyüğe sıralayan saf mantık algoritması.
* **Kazanımlar:** Akış kontrolü (Control Flow) optimizasyonları, iç içe karar yapıları yönetimi ve minimum maliyetli algoritma kurgusu.

## 🛠️ Kullanılan Teknolojiler & Bileşenler (Tech Stack)
* **Geliştirme Dili:** Java (JDK 8 ve üzeri tüm sürümlerle uyumludur)
* **Kullanılan Temel Java Kitaplıkları:**
  * `java.util.Scanner` (Konsol veri akışı yönetimi)
  * `java.util.ArrayList` & `java.util.List` (Dinamik nesne koleksiyonları)
  * `java.lang.Math` (Trigonometri, mutlak değer ve dönüşüm fonksiyonları)

## ⚙️ Projelerin Yerel Bilgisayarda Çalıştırılması (Usage)
Herhangi bir projeyi bilgisayarınızda derleyip test etmek için terminal veya komut satırı üzerinden ilgili dizine giderek şu adımları izleyebilirsiniz:

```bash
# Örnek olarak Üç Sayı Sıralama projesini derlemek ve çalıştırmak için:
javac uc_sayi_siralama/UcSayiSiralama.java
java uc_sayi_siralama.UcSayiSiralama
