package com.example.Rollback.Entity;
import jakarta.persistence.*;


@Entity
@Table(name = "ürünler")
public class Rollback {
    @Id //id alanının bu öğrenci için primary olduğunu söylemek için kullanılıyor.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Bu anotasyon, JPA ve Hibernate'de birincil anahtar alanının otomatik olarak veri tabanı tarafından üretileceğini belirtir.
    @Column(name="id") //veritabanı sütunuyle eşleştiriyoruz.
    private int id;

    @Column(name="ad")
    private String ad;

    @Column(name="marka")
    private String marka;

    @Column(name="teslimat kodu")
    private String teslimatKodu;

    @Column(name="durum bilgisi")
    private String durumBilgisi;

    public Rollback (){

    }

    public Rollback(String ad, String marka, String teslimatKodu, String durumBilgisi) {
        this.ad = ad;
        this.marka = marka;
        this.teslimatKodu = teslimatKodu;
        this.durumBilgisi = durumBilgisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTeslimatKodu() {
        return teslimatKodu;
    }

    public void setTeslimatKodu(String teslimatKodu) {
        this.teslimatKodu = teslimatKodu;
    }

    public String getDurumBilgisi() {
        return durumBilgisi;
    }

    public void setDurumBilgisi(String durumBilgisi) {
        this.durumBilgisi = durumBilgisi;
    }

    @Override
    public String toString() {
        return "Rollback{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", marka='" + marka + '\'' +
                ", teslimatKodu='" + teslimatKodu + '\'' +
                ", durumBilgisi='" + durumBilgisi + '\'' +
                '}';
    }
}
