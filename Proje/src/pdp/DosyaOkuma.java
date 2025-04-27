package pdp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 * @author Ömer Faruk Aydın / omer.aydin28@ogr.sakarya.edu.tr
 * @since 20.04.2025
 * 
 * Dosyalardan veri okuma işlemlerini yapar.
 */
public class DosyaOkuma {

    // Kişileri dosyadan okur
    public static ArrayList<Kisi> kisileriOku(String dosyaAdi) {
        ArrayList<Kisi> kisiler = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] parcalar = satir.split("#");
                String ad = parcalar[0];
                int yas = Integer.parseInt(parcalar[1]);
                int kalanOmur = Integer.parseInt(parcalar[2]);
                String uzayAraciAdi = parcalar[3];

                kisiler.add(new Kisi(ad, yas, kalanOmur, uzayAraciAdi));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kisiler;
    }

    // Uzay araçlarını dosyadan okur
    public static ArrayList<UzayAraci> araclariOku(String dosyaAdi) {
        ArrayList<UzayAraci> araclar = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] parcalar = satir.split("#");
                String ad = parcalar[0];
                String cikisGezegeni = parcalar[1];
                String varisGezegeni = parcalar[2];
                String[] tarihParca = parcalar[3].split("\\.");
                int gun = Integer.parseInt(tarihParca[0]);
                int ay = Integer.parseInt(tarihParca[1]);
                int yil = Integer.parseInt(tarihParca[2]);
                int mesafe = Integer.parseInt(parcalar[4]);

                araclar.add(new UzayAraci(ad, cikisGezegeni, varisGezegeni, new Zaman(gun, ay, yil, 0, 24), mesafe));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return araclar;
    }

    // Gezegenleri dosyadan okur
    public static ArrayList<Gezegen> gezegenleriOku(String dosyaAdi) {
        ArrayList<Gezegen> gezegenler = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] parcalar = satir.split("#");
                String ad = parcalar[0];
                int gununKacSaat = Integer.parseInt(parcalar[1]);
                String[] tarihParca = parcalar[2].split("\\.");
                int gun = Integer.parseInt(tarihParca[0]);
                int ay = Integer.parseInt(tarihParca[1]);
                int yil = Integer.parseInt(tarihParca[2]);

                gezegenler.add(new Gezegen(ad, gununKacSaat, new Zaman(gun, ay, yil, 0, gununKacSaat)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gezegenler;
    }
}
