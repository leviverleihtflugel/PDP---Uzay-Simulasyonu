package pdp;

/**
 * 
 * @author Ömer Faruk Aydın / omer.aydin28@ogr.sakarya.edu.tr
 * @since 20.04.2025
 * 
 * Gezegenlerdeki zamanı temsil eden sınıf.
 */
public class Zaman {
    private int gun;
    private int ay;
    private int yil;
    private int saat;
    private int gununKacSaat; // 1 gün kaç saat sürüyor (örnek: Dünya'da 24 saat)

    // Ana constructor
    public Zaman(int gun, int ay, int yil, int saat, int gununKacSaat) {
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
        this.saat = saat;
        this.gununKacSaat = gununKacSaat;
    }

    // Başka bir Zaman nesnesinden kopyalama constructor'ı
    public Zaman(Zaman other) {
        this.gun = other.gun;
        this.ay = other.ay;
        this.yil = other.yil;
        this.saat = other.saat;
        this.gununKacSaat = other.gununKacSaat;
    }

    // 1 saat ileri gider
    public void saatIlerle() {
        saat++;
        if (saat >= gununKacSaat) {
            saat = 0;
            gun++;
            if (gun > 30) { // Ay 30 gün kabul edilir
                gun = 1;
                ay++;
                if (ay > 12) { // Yıl sonu
                    ay = 1;
                    yil++;
                }
            }
        }
    }

    // Getter metotlar
    public int getGun() {
        return gun;
    }

    public int getAy() {
        return ay;
    }

    public int getYil() {
        return yil;
    }

    public int getSaat() {
        return saat;
    }

    public int getGununKacSaat() {
        return gununKacSaat;
    }

    // Zamanı string olarak döndürür
    @Override
    public String toString() {
        return gun + "." + ay + "." + yil;
    }
}
