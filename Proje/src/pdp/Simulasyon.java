package pdp;

/**
 *
 * @author Ömer Faruk Aydın / omer.aydin28@ogr.sakarya.edu.tr
 * @since 20.04.2025
 * 
 * Bu sınıf, PDP Projesi kapsamında simülasyonun ana döngüsünü yöneten sınıftır.
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Simulasyon {
    public static void main(String[] args) {
        // Dosyalardan verileri oku
        ArrayList<Kisi> kisiler = DosyaOkuma.kisileriOku("Kisiler.txt");
        ArrayList<UzayAraci> araclar = DosyaOkuma.araclariOku("Araclar.txt");
        ArrayList<Gezegen> gezegenler = DosyaOkuma.gezegenleriOku("Gezegenler.txt");

        // Kişileri uzay araçlarına yerleştir
        for (Kisi kisi : kisiler) {
            for (UzayAraci uzayAraci : araclar) {
                if (kisi.getUzayAraciAdi().equals(uzayAraci.getAd())) {
                    uzayAraci.yolcuEkle(kisi);
                    break;
                }
            }
        }

        while (true) {
            temizleEkran(); // Ekranı temizle

            // Kişilerin ömrünü azalt
            for (Kisi kisi : kisiler) {
                kisi.omurAzalt();
            }

            // Uzay araçlarının durumunu güncelle
            for (UzayAraci uzayAraci : araclar) {
                if (uzayAraci.isImhaDurumu() || uzayAraci.varisYaptiMi()) continue;

                Gezegen cikisGezegen = getGezegenByName(gezegenler, uzayAraci.getCikisGezegeni());

                if (!uzayAraci.isHareketEttiMi()) {
                    if (cikisGezegen.getTarih().getGun() == uzayAraci.getCikisTarihi().getGun()
                        && cikisGezegen.getTarih().getAy() == uzayAraci.getCikisTarihi().getAy()
                        && cikisGezegen.getTarih().getYil() == uzayAraci.getCikisTarihi().getYil()) {
                        uzayAraci.setHareketEttiMi(true);
                    }
                } else {
                    uzayAraci.saatGecir();
                }

                uzayAraci.imhaKontrol();
            }

            // Gezegenlerde zamanı ilerlet
            for (Gezegen gezegen : gezegenler) {
                gezegen.saatIlerle();
            }

            // Gezegen nüfuslarını hesapla
            HashMap<String, Integer> gezegenNufusMap = new HashMap<>();
            for (Gezegen gezegen : gezegenler) {
                gezegenNufusMap.put(gezegen.getAd(), 0);
            }

            // Gezegenlerdeki kişi sayılarını güncelle
            for (UzayAraci uzayAraci : araclar) {
                if (!uzayAraci.isImhaDurumu()) {
                    if (!uzayAraci.isHareketEttiMi()) {
                        for (Kisi kisi : uzayAraci.getYolcular()) {
                            if (kisi.hayattaMi()) {
                                gezegenNufusMap.put(
                                    uzayAraci.getCikisGezegeni(),
                                    gezegenNufusMap.get(uzayAraci.getCikisGezegeni()) + 1
                                );
                            }
                        }
                    } else if (uzayAraci.varisYaptiMi()) {
                        for (Kisi kisi : uzayAraci.getYolcular()) {
                            if (kisi.hayattaMi()) {
                                gezegenNufusMap.put(
                                    uzayAraci.getVarisGezegeni(),
                                    gezegenNufusMap.get(uzayAraci.getVarisGezegeni()) + 1
                                );
                            }
                        }
                    }
                }
            }

            // Gezegen bilgilerini yazdır
            System.out.println("Gezegenler:");
            System.out.print("             ");
            for (Gezegen gezegen : gezegenler) {
                System.out.printf("%-20s", "--- " + gezegen.getAd() + " ---");
            }
            System.out.println();

            System.out.print("Tarih:       ");
            for (Gezegen gezegen : gezegenler) {
                System.out.printf("%-20s", gezegen.getTarih());
            }
            System.out.println();

            System.out.print("Nüfus:       ");
            for (Gezegen gezegen : gezegenler) {
                System.out.printf("%-20d", gezegenNufusMap.get(gezegen.getAd()));
            }
            System.out.println("\n");

            // Uzay araçlarının bilgilerini yazdır
            System.out.println("Uzay Araçları:");
            System.out.printf("%-10s %-10s %-10s %-10s %-20s %-20s%n",
                    "Araç Adı", "Durum", "Çıkış", "Varış", "Hedefe Kalan Saat", "Hedefe Varacağı Tarih");

            for (UzayAraci uzayAraci : araclar) {
                String durum;
                if (uzayAraci.isImhaDurumu()) {
                    durum = "IMHA";
                } else if (!uzayAraci.isHareketEttiMi()) {
                    durum = "Bekliyor";
                } else if (!uzayAraci.varisYaptiMi()) {
                    durum = "Yolda";
                } else {
                    durum = "Vardı";
                }

                if (uzayAraci.varisYaptiMi() && uzayAraci.getHedefeVarisTarihi() == null) {
                    Gezegen hedefGezegen = getGezegenByName(gezegenler, uzayAraci.getVarisGezegeni());
                    uzayAraci.setHedefeVarisTarihi(new Zaman(hedefGezegen.getTarih()));
                }

                String hedefTarih = (uzayAraci.getHedefeVarisTarihi() != null) ? uzayAraci.getHedefeVarisTarihi().toString() : "--";

                String kalanSaatStr = (uzayAraci.isImhaDurumu()) ? "--" : String.valueOf(uzayAraci.getKalanSaat());

                System.out.printf("%-10s %-10s %-10s %-10s %-20s %-20s%n",
                    uzayAraci.getAd(), durum, uzayAraci.getCikisGezegeni(),
                    uzayAraci.getVarisGezegeni(), kalanSaatStr, hedefTarih);
            }

            // Simülasyonu bitirme kontrolü
            boolean tumAraclarBitti = true;
            for (UzayAraci uzayAraci : araclar) {
                if (!uzayAraci.varisYaptiMi() && !uzayAraci.isImhaDurumu()) {
                    tumAraclarBitti = false;
                    break;
                }
            }

            if (tumAraclarBitti) {
                System.out.println("\nTüm araçlar hedefe ulaştı veya IMHA oldu! Simülasyon bitti.");
                break;
            }

            // 0.1 saniye beklet
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Konsolu temizler
    public static void temizleEkran() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Gezegen ismine göre gezegen bulur
    public static Gezegen getGezegenByName(ArrayList<Gezegen> gezegenler, String ad) {
        for (Gezegen gezegen : gezegenler) {
            if (gezegen.getAd().equals(ad)) {
                return gezegen;
            }
        }
        return null;
    }
}
