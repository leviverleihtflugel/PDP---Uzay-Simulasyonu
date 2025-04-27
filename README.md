# 🚀 Uzay Kolonileştirme Simülasyonu (PDP Projesi)

Bu proje, farklı gezegenler arasında hareket eden uzay araçlarının ve gezegenlerdeki yaşamın simülasyonunu gerçekleştirmektedir.  
Kişilerin ömürlerinin takibi, araçların hareketleri, gezegenlerdeki zamanın ilerlemesi ve imha durumları detaylı şekilde yönetilmektedir.

## 📂 Proje Yapısı

```
G221210370/
├── src/                 # Java kaynak kodları (pdp package içinde)
├── bin/                 # Derlenmiş sınıf dosyaları (.class)
├── dist/                # Çalıştırılabilir .jar dosyası
├── Araclar.txt          # Araç bilgileri
├── Gezegenler.txt       # Gezegen bilgileri
├── Kisiler.txt          # Kişi bilgileri
├── .classpath           # Eclipse proje ayar dosyası
├── .project             # Eclipse proje ayar dosyası
└── Rapor.pdf            # Ödev raporu
```

## 🛠️ Kullanılan Teknolojiler

- Java 17 veya üstü
- Eclipse IDE 2023-12 (veya uyumlu başka bir IDE)
- Windows 11 işletim sistemi (konsol temizleme desteği için)

---

## 👨‍💻 Kurulum ve Çalıştırma Adımları

### 1. Java Kurulumu

- [Java 17 JDK](https://jdk.java.net/17/) sürümünü indirip kurmanız gerekir.
- Kurulumdan sonra terminale `java -version` yazarak doğru yüklendiğini kontrol edebilirsiniz.

```bash
java -version
```

### 2. Eclipse IDE Kurulumu

- [Eclipse IDE](https://www.eclipse.org/downloads/) sitesinden Eclipse IDE for Java Developers sürümünü indirip kurun.
- Eclipse ilk açılışta bir workspace (çalışma alanı) seçmenizi ister.

### 3. Projeyi Eclipse'e Import Etmek

- Eclipse → `File > Import > Existing Projects into Workspace` seçeneğini seçin.
- "Root Directory" olarak proje klasörünüzü (`G221210370`) gösterin.
- Proje başarıyla eklenecektir.

### 4. Projeyi Eclipse Üzerinden Çalıştırmak

- `src` klasöründen `pdp.Simulasyon` dosyasını bulun.
- Sağ tıklayıp `Run As > Java Application` seçeneğiyle çalıştırabilirsiniz.

### 5. Jar Dosyasından Çalıştırmak (Konsoldan)

- `dist` klasörü altında `.jar` dosyası bulunmalıdır.
- Terminal veya Komut İstemi'ni (`cmd`) açın.
- `dist` klasörünüze girin:

```bash
cd yol\G221210370\dist
```

- Ardından çalıştırın:

```bash
java -jar projeadi.jar
```

> Not: Program çalıştığında ekranı temizleyecek ve simülasyonu başlatacaktır.

---

## 🎯 Projede Gerçekleştirilen İşlemler

- Txt dosyalarından araç, gezegen ve kişi bilgileri okundu.
- Gezegenlerde zaman ilerletildi.
- Uzay araçlarının çıkış tarihi geldiğinde harekete başlaması sağlandı.
- Kişilerin ömürleri saatlik bazda azaltıldı.
- Araçlar hedefe ulaştığında varış tarihi kaydedildi.
- Tüm kişilerin ölmesi durumunda araçlar imha edildi.
- Konsol temizleme işlemleri farklı işletim sistemlerine uygun yapıldı.
- Program düzgün kapanıyor ve simülasyon sonunda mesaj veriyor.

---

## ⚠️ Önemli Notlar

- Projede her gezegen için farklı saat düzeni başarıyla desteklenmektedir.
- `.jar` dosyası ve txt dosyaları aynı klasörde olmalıdır.

---

# 📋 Projeyi Çalıştırmak için Gerekli Her Şey Tamam!
