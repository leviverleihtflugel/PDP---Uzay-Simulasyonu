package pdp;

/**
 * 
 * @author Ömer Faruk Aydın / omer.aydin28@ogr.sakarya.edu.tr
 * @since 20.04.2025
 * 
 * Kişi bilgilerini tutar.
 */
public class Kisi {
    private String isim; // Kişi ismi
    private int yas; // Kişi yaşı
    private int kalanOmur; // Kalan ömür (saat cinsinden)
    private String uzayAraciAdi; // Bağlı olduğu uzay aracı adı

    // Constructor
    public Kisi(String isim, int yas, int kalanOmur, String uzayAraciAdi) {
        this.isim = isim;
        this.yas = yas;
        this.kalanOmur = kalanOmur;
        this.uzayAraciAdi = uzayAraciAdi;
    }

    // Kalan ömrü 1 saat azaltır
    public void omurAzalt() {
        if (kalanOmur > 0) {
            kalanOmur--;
        }
    }

    // Kişi hayatta mı?
    public boolean hayattaMi() {
        return kalanOmur > 0;
    }

    // Getter: İsim
    public String getIsim() {
        return isim;
    }

    // Getter: Yaş
    public int getYas() {
        return yas;
    }

    // Getter: Kalan ömür
    public int getKalanOmur() {
        return kalanOmur;
    }

    // Getter: Uzay aracı adı
    public String getUzayAraciAdi() {
        return uzayAraciAdi;
    }
}
