package pdp;

/**
 * 
 * @author Ömer Faruk Aydın / omer.aydin28@ogr.sakarya.edu.tr
 * @since 20.04.2025
 * 
 * Gezegen bilgilerini yönetir.
 */
public class Gezegen {
    private String ad; // Gezegen adı
    private int gununKacSaat; // Gezegenin bir günündeki saat sayısı
    private Zaman tarih; // Gezegenin zamanı

    // Constructor
    public Gezegen(String ad, int gununKacSaat, Zaman tarih) {
        this.ad = ad;
        this.gununKacSaat = gununKacSaat;
        this.tarih = tarih;
    }

    // 1 saat ilerletir
    public void saatIlerle() {
        tarih.saatIlerle();
    }

    // Getter: Gezegen adı
    public String getAd() {
        return ad;
    }

    // Getter: Günün kaç saat olduğu
    public int getGununKacSaat() {
        return gununKacSaat;
    }

    // Getter: Tarih bilgisi
    public Zaman getTarih() {
        return tarih;
    }
}
