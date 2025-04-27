package pdp;

import java.util.ArrayList;

/**
 * 
 * @author Ömer Faruk Aydın / omer.aydin28@ogr.sakarya.edu.tr
 * @since 20.04.2025
 * 
 * Uzay aracı bilgilerini yönetir.
 */
public class UzayAraci {
    private String ad;
    private String cikisGezegeni;
    private String varisGezegeni;
    private Zaman cikisTarihi;
    private int mesafe;
    private ArrayList<Kisi> yolcular;
    private boolean imhaDurumu;
    private int kalanSaat;
    private boolean hareketEttiMi;
    private Zaman hedefeVarisTarihi;

    // Constructor
    public UzayAraci(String ad, String cikisGezegeni, String varisGezegeni, Zaman cikisTarihi, int mesafe) {
        this.ad = ad;
        this.cikisGezegeni = cikisGezegeni;
        this.varisGezegeni = varisGezegeni;
        this.cikisTarihi = cikisTarihi;
        this.mesafe = mesafe;
        this.kalanSaat = mesafe;
        this.yolcular = new ArrayList<>();
        this.imhaDurumu = false;
        this.hareketEttiMi = false;
        this.hedefeVarisTarihi = null;
    }

    // Her saat başı kalan süreyi azaltır
    public void saatGecir() {
        if (!imhaDurumu && kalanSaat > 0) {
            kalanSaat--;
        }
    }

    // Araç varış yaptı mı kontrol eder
    public boolean varisYaptiMi() {
        return kalanSaat == 0 && hareketEttiMi;
    }

    // Araç yolcusu ekler
    public void yolcuEkle(Kisi kisi) {
        yolcular.add(kisi);
    }

    // Araçtaki herkes öldüyse imha olur
    public void imhaKontrol() {
        boolean hepsiOlmus = true;
        for (Kisi kisi : yolcular) {
            if (kisi.hayattaMi()) {
                hepsiOlmus = false;
                break;
            }
        }
        if (hepsiOlmus) {
            imhaDurumu = true;
        }
    }

    // Getter ve Setter metodları
    public String getAd() {
        return ad;
    }

    public String getCikisGezegeni() {
        return cikisGezegeni;
    }

    public String getVarisGezegeni() {
        return varisGezegeni;
    }

    public Zaman getCikisTarihi() {
        return cikisTarihi;
    }

    public int getMesafe() {
        return mesafe;
    }

    public int getKalanSaat() {
        return kalanSaat;
    }

    public boolean isImhaDurumu() {
        return imhaDurumu;
    }

    public boolean isHareketEttiMi() {
        return hareketEttiMi;
    }

    public void setHareketEttiMi(boolean hareketEttiMi) {
        this.hareketEttiMi = hareketEttiMi;
    }

    public ArrayList<Kisi> getYolcular() {
        return yolcular;
    }

    // Hareket etti mi kontrolü
    public boolean cikisTarihiGectiMi() {
        return hareketEttiMi;
    }

    public Zaman getHedefeVarisTarihi() {
        return hedefeVarisTarihi;
    }

    public void setHedefeVarisTarihi(Zaman hedefeVarisTarihi) {
        this.hedefeVarisTarihi = hedefeVarisTarihi;
    }
}
