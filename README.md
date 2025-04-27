🖥️ Kurulum ve Çalıştırma Adımları
1. Java Kurulumu
Java 17 JDK sürümünü indirip kurmanız gerekir.

Kurulumdan sonra terminale java -version yazarak doğru yüklendiğini kontrol edebilirsiniz.

bash
Kopyala
Düzenle
java -version
2. Eclipse IDE Kurulumu
Eclipse IDE sitesinden Eclipse IDE for Java Developers sürümünü indirip kurun.

Eclipse ilk açılışta bir workspace (çalışma alanı) seçmenizi ister.

3. Projeyi Eclipse'e Import Etmek
Eclipse → File > Import > Existing Projects into Workspace seçeneğini seçin.

"Root Directory" olarak proje klasörünüzü (G221210370) gösterin.

Proje başarıyla eklenecektir.

4. Projeyi Eclipse Üzerinden Çalıştırmak
src klasöründen pdp.Simulasyon dosyasını bulun.

Sağ tıklayıp Run As > Java Application seçeneğiyle çalıştırabilirsiniz.

5. Jar Dosyasından Çalıştırmak (Konsoldan)
dist klasörü altında projeadi.jar dosyası bulunmalıdır.

Terminal veya Komut İstemi'ni (cmd) açın.

dist klasörüne girin:

bash
Kopyala
Düzenle
cd yol\G221210370\dist
Ardından çalıştırın:

bash
Kopyala
Düzenle
java -jar projeadi.jar
Not: Program çalıştığında ekranı temizleyecek ve simülasyonu başlatacaktır.
