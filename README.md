🚀 Uzay Kolonileştirme Simülasyonu (PDP Projesi)
Bu proje, farklı gezegenler arasında yolculuk yapan uzay araçlarının ve gezegenlerdeki yaşamın simülasyonunu gerçekleştirmektedir.
Kişilerin ömürlerinin takibi, araçların hareketleri, gezegenlerdeki zamanın ilerlemesi ve imha durumları detaylı şekilde yönetilmektedir.

📂 Proje Yapısı
python
Kopyala
Düzenle
G221210370/
├── src/                 # Java kaynak kodları
├── bin/                 # Derlenmiş sınıf dosyaları
├── dist/                # Çalıştırılabilir .jar dosyası
├── Araclar.txt          # Araç bilgileri
├── Gezegenler.txt       # Gezegen bilgileri
├── Kisiler.txt          # Kişi bilgileri
├── .classpath           # Eclipse proje ayar dosyası
├── .project             # Eclipse proje ayar dosyası
└── Rapor.pdf            # Ödev raporu
🛠️ Kullanılan Teknolojiler
Java 17

Eclipse IDE 2023-12

Windows 11 (konsol temizleme destekli)

📜 Çalıştırma Talimatları
Bu projeyi Eclipse veya bir Java IDE'sine import edin.

src/ klasöründe yer alan pdp.Simulasyon sınıfını çalıştırabilirsiniz.

Veya terminal/komut satırında dist klasörüne girip .jar dosyasını çalıştırın:

bash
Kopyala
Düzenle
cd dist
java -jar projeadi.jar
Not: .jar çalıştırıldığında konsolu temizler ve simülasyonu düzgün şekilde başlatır.

🎯 Projede Gerçekleştirilen İşlemler
Dosyalardan (txt) gezegen, araç ve kişi bilgileri okundu.

Gezegenlerde zaman ilerlemesi simüle edildi.

Uzay araçlarının çıkış tarihi geldiğinde hareket etmeleri sağlandı.

Araçların hedefe ulaşıp ulaşmadığı ve imha olup olmadığı kontrol edildi.

Nüfus değişimleri doğru şekilde hesaplandı.

Konsol ekranı düzenli olarak temizlendi.

Tüm araçlar hedefe ulaştığında veya imha olduğunda simülasyon sonlandı.

📚 Öğrendiklerim
Java'da dosya okuma-yazma işlemleri

OOP (Nesne Yönelimli Programlama) mantığı

Zaman ilerlemesi ve tarih yönetimi

Konsol uygulamaları için kullanıcı deneyimi artırma

.jar dosyası oluşturma ve çalıştırma

⚠️ Önemli Not
Bu proje bireysel ödev kapsamında hazırlanmıştır. Başkaları tarafından izinsiz kopyalanması yasaktır.
