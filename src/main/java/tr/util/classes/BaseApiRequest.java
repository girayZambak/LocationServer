package tr.util.classes;

public class BaseApiRequest {
    private String kullaniciAdi = null;
    private String oturumKodu = null;
    private Long makamId = null;

    public BaseApiRequest() {
    }

    public String getKullaniciAdi() {
        return this.kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getOturumKodu() {
        return this.oturumKodu;
    }

    public void setOturumKodu(String oturumKodu) {
        this.oturumKodu = oturumKodu;
    }

    public Long getMakamId() {
        return this.makamId;
    }

    public void setMakamId(Long makamId) {
        this.makamId = makamId;
    }
}
